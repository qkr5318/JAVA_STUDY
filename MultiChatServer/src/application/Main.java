package application;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application{
	   // 즉, 여러개의 쓰레드를 효율적으로 관리하기 위해 사용하는 대표적인 라이브러인 ExecutorService를 활용합니다.
	   // ThreadPool로 Thread를 처리하게 되면 기본적인 Thraed숫자에 제한을 두기 떄문에, 갑작스럽게 클라이언트 숫자가 폭증하더라도
	   // Thread의 숫자에는 제한이 있기 때문에 서버의 성능 저하를 방지할 수 있습니다.
	   // 즉, 한정된 자원을 이용해서 안정적으로 서버를 운용하기 위해 사용하는 것이 ThreadPool 기법입니다.
	public static ExecutorService threadPoll;
	public static Vector<Client> clients = new Vector<Client>();
	
	ServerSocket serverSocket;
	
	// 서버를 구동시켜서 클라이언트의 연결을 기다리는 메서드인 startServer() 메서드를 정의합니다.

	public void startServer(String IP, int port) {
		// 소켓 객체를 활성화
		try {
			serverSocket = new ServerSocket();
			// bind를 통해 서버 역할을 하는 컴퓨터가 자신의 IP 주소, port번호로 특정한
			// 클라이언트에 접속을 기다리도록 할 수 있습니다.
			serverSocket.bind(new InetSocketAddress(IP, port));
		} catch (IOException e) {
			e.printStackTrace();
			// 만약, 서버 소켓이 닫혀있는 상태가 아니라면
			if (!serverSocket.isClosed()) {
				stopServer(); // 서버 종료
			}
			return; // 여기서 return문은 void형의 메서드 실행 종료 처리를 담당함
		}
		// 클라이언트가 접속할 때까지 기다리는 쓰레드 생성
		// 즉, 하나의 클리이언트가 접속할 때까지 대기할 쓰레드를 작성해 줍니다.
		Runnable thread = new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					try {
						// 새로운 클라이언트가 접속할 수있도록 accept() 준비함
						Socket socket = serverSocket.accept();
						// 클라이언트가 접속을 한다면, 클라이언트 배열에 새롭게 접속한 클라이언트를 추가해 줍니다.
						clients.add(new Client(socket));
						System.out.println("[클라이언트가 접속했습니다." + socket.getRemoteSocketAddress() + " : " + Thread.currentThread().getName()) ;
					} catch (IOException e) {
						// 오류가 발생한다면 서버를 작동 중지시키고 break문으로 빠져 나옵니다.
						if (!serverSocket.isClosed()) {
							stopServer();
						}
						break; // 여기서 break문은 void 타입의 run() 메서드 실행 종료를 합니다.
					}
				}
			}
		};
		// 쓰레드풀 초기화
		threadPoll = Executors.newCachedThreadPool();
		// 쓰레드풀 초기화 후에 현재 클라이언트를 기다리는 쓰레드를 담을 수 있도록 정의함.
		threadPoll.submit(thread);
		
	}
	
	// stopServer() 메서드는 서버의 작동을 중지시키는 역할을 하는 메서드입니다.
	// stopServer() 메서드는 서버작동 종료 후에, 전체 자원(resource)을 할당 해제해 주는 메서드 입니다.
	public void stopServer() {
		// 현재 작동중인 모든 클라이언트 접속 연결을 끊어줍니다. 즉, 모든 소켓을 닫아줍니다.
		try {
		Iterator<Client> iterator = clients.iterator();
		// iterator로 하나씩 클라이언트에 접근해서 닫아줍니다.
		while (iterator.hasNext()) {
			Client client = (Client) iterator.next();
				client.socket.close();
			// iterator에서도 닫아준 소켓 제거합니다.
			iterator.remove();
			
		}
		// 서버 소켓 객체 닫기
		if (serverSocket != null && !serverSocket.isClosed()) {
			serverSocket.close();
		}
		// 쓰레드풀 종료하기
		if (threadPoll != null && !threadPoll.isShutdown()) {
			// shutdown으로 자원 할당 해제함
			threadPoll.shutdown();
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	
	

	// JavaFX GUI 형식으로 채팅 서버 UI를 생성하고, 실질적으로 서버 프로그램을 동작시키는 start()정의함
	@Override
	public void start(Stage primaryStage) throws Exception {

		BorderPane root = new BorderPane();
		root.setPadding(new Insets(5));
		
		TextArea textArea = new TextArea();
		// textArea에는 출력 내용만 보여주고, 입력을 할 수 없도록 false 비활성화 처리해 줍니다.
		textArea.setEditable(false);
		textArea.setFont(new Font("나눔고딕", 15));
		// 레이아웃에서 중간에 위치시켜줌
		root.setCenter(textArea);
		
		// 서버의 작동을 시작하는데 사용할 버튼 객체를 생성해 줍니다.
		Button toggleButton = new Button("실행하기");
		toggleButton.setMaxWidth(Double.MAX_VALUE);
		BorderPane.setMargin(toggleButton, new Insets(1, 0, 0, 0));
		// 레이아웃에서 아래에 배치하게함
		root.setBottom(toggleButton);
		// 본인 Pc의 컴퓨처 ip 주소: local IP address 설정
		String IP = "192.168.0.185";
		int port = 9007;
		
		// 버튼 이벤트 처리
		toggleButton.setOnAction(event -> {
			if (toggleButton.getText().equals("실행하기")) {
				startServer(IP, port);
				Platform.runLater(()->{
					String message = String.format("<규남이 챗서버 실행> \n", IP, port);
					textArea.appendText(message);
					toggleButton.setText("종료하기");
				});
			} else {
				// 버튼의 상태가 "종료하기"라면 서버를 종료해 주고, 버튼 Text를 변경 처리해 줍니다.
				stopServer();
				Platform.runLater(() -> {
					String message = String.format("<규남이 챗서버 종료> \n", IP, port);
					textArea.appendText(message);
					toggleButton.setText("종료하기");
				});
			}
		});
		
		Scene scene = new Scene(root, 400, 400);
		primaryStage.setTitle("My Multi ChatServer ver 1.0");
		// 만약 종료버튼을 눌른다면 stopServer 함수를 호출시키게 함
		primaryStage.getIcons().add(new Image(Class.forName("application.Main").getResourceAsStream("/application/resources/icon/server.png")));
		primaryStage.setOnCloseRequest(evnet -> stopServer());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	// JavaFX 실행 main 함수
	public static void main(String[] args) {
		launch(args);
	}
	// ThreadPool을 통해서 다양한 클라이언트가 접속했을 때, Thread들을 효과적으로 관리할 수 있기 위한 것.
}
