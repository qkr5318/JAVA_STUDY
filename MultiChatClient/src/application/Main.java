package application;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

// 클라이언트 프로젝트에서 Main 클래스를 정의합니다.
public class Main extends Application {

	Socket socket;
	TextArea textArea;


	// 클라이언트 프로그램 동작 메서드 startClient() 정의
	public void startClient(String IP, int port) {
		// 클라이언트 프로그램은 서버 프로그램과는 다르게
		// 여러개의 쓰레드가 발생하지 않기 때문에
		// ThreadPool을 사용할 필요는 없습니다.
		// 이번에는 Thread 객체를 사용해서 쓰레드를 생성해 봅니다.
		Thread thread = new Thread() {

			@Override
			public void run() {
				try {
					// 소켓 초기화
					socket = new Socket(IP, port);
					// 메시지를 전달 받도록 receive() 메서드를 호출합니다.
					receive();
				} catch (UnknownHostException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// 만약에 예외가 발생한 경우
					if (!socket.isClosed()) {
						// stopClient 메서드를 호출해서 클라이언트를 종료 처리해 줍니다.
						stopClient();
						System.out.println("[서버 접속 실패]");
						// 클라이언트 프로그램 자체를 종료 시켜줍니다.
						Platform.exit();
					}
				}
			}
		};
		thread.start();
	}
	
	// 클라이언트 프로그램 종료 메서드 stopClient() 정의
	public void stopClient() {
		try {
				// 소켓이 열려 있는 상태라면
				if(socket != null && !socket.isClosed()) {
						socket.close();
				}		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 서버로부터 메시지를 전달 받는 receive() 메서드를 정의해 줍니다.
	// 계속적으로 메시지를 전달 받기 위해 무한 loop으로 처리해 줍니다.
	// 실무에서는 무한 loop문을 사용하지 않고, 조건별로 메시지 처리가 되도록 합니다.
	public void receive() {
		
		while (true) {
			try {
			// 현재 서버로부터 어떠한 메시지를 전달 받게 된다면
				InputStream in = socket.getInputStream();
				// 512 byte만큼 버퍼에 끊어서 메시지를 담아주고, 계속 전달 받게 됩니다.
				byte[] buffer = new byte[512];
				// read(0 메서드로 실제로 값을 입력 받아서 처리해 줍니다.
				int length = in.read(buffer);
				// 내용을 입력 받는 도중에 오류가 발생하면 IOException을 발생시켜 줍니다.
				if (length == -1) {
					throw new IOException();
				}
				// message 변수에 버퍼에 있는 정보를 담아서 처리해 줍니ㅏㄷ.
				String message = new String(buffer,0,length,"UTF-8");
				// 화면에 출력 처리해 줍니다.
				Platform.runLater(()->{
					// textArea는 GUI 요소 중 하나로써 화면에 출력해 주는 요소입니다.
					textArea.appendText(message);
				});
		
			} catch (IOException e) {
				// 예외가 발생했을 때에는 stopClient() 메서드 호출 후 break문으로 종결 처리합니다.
				stopClient();
				break;
			}
			
			
			
			
		}
	
		
		
	}
	// 서버로 메시지를 전송하는 send() 메서드를 정의해 봅니다.
	public void send(String message) {
		// 메시지를 전송할 경우, Thread를 활용하게 되며
		// 서버로 메시지를 전송하기 위한 Thread 1개와
		// 서버로부터 메시지를 전달 받는 Thread 1개,
		// 즉, 총 2개의 Thread가 각각 다른 역할을 하게 됩니다.
		Thread thread = new Thread() {

			@Override
			public void run() {
				try {
				OutputStream out = socket.getOutputStream();
				// 보내고자 하는 메세지를 UTF-8로 인커딩 처리합니다.
				// 서버에서 전달 받을 떄는 UFT-8로 인코딩된 것을 받도록 했기 때문입니다.
					byte[] buffer = message.getBytes("UTF-8");
					// 메세지 전송 처리
					out.write(buffer);
					// 메시지전송의 끝을 알려줌. 즉, 버퍼에 있는 출력 내용을 모두 비워줌
					out.flush();
				} catch (IOException e) {
					// 예외가 발생한다면
					stopClient();
				}
				
			}
			
		};
		thread.start();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(5));
		
		//  BorederPane 위에 Hbox 레이아웃을 덧붙여 줍니다. 
		HBox hbox = new HBox();
		// 생생한 hbox 인스턴스 객체에 여백을 줍니다.
		hbox.setSpacing(5);
		// 사용자 이름이 들어갈 수 있는 텍스트 공간을 생성해 줍니다.
		TextField userName = new TextField();
		userName.setPrefWidth(150);// 150 너비 설정
		userName.setPromptText("닉네임을 입력해 주세요.");
		// Hbox 내부에 TextField가 항상 나타나도록 처리해 줍니다.
		HBox.setHgrow(userName, Priority.ALWAYS);
		
		TextField IPText = new TextField("192.168.0.149");
		TextField portText = new TextField("9007");
		portText.setPrefWidth(80);
		
		hbox.getChildren().addAll(userName, IPText, portText);
		root.setTop(hbox);
		
		textArea = new TextArea();
		// 이 textArea는 직접 글 입력을 하는 것이 아니고, 메시지 내용을 볼 수만 있는 것이기에, 입력/ 수정 못하도록 false 비활성화 처리 합니다.
		textArea.setEditable(false);
		// borderPane 레이아웃의 중간에 위치시켜 줍니다.
		root.setCenter(textArea);
		
		TextField input = new TextField();
		input.setPrefWidth(Double.MAX_VALUE);
		// 입력란 TestField의 경우, 클라이언트 접속 전에는 어떠한 메시지도 전송할 수 없도록 설정해 줌
		input.setDisable(true);

		input.setOnAction(event -> {
			// 서버로 메시지를 전송시킬 수 있도록
			send(userName.getText() + " : " + input.getText() + "\n");
			input.setText(""); // 서버로 메시지 전송 후에 입력란을 빈공간으로 비워둠(초기화 처리함)
			input.requestFocus();// 다시 사용자가 메시지를 입력 전송 처리할 수 있도록 포커싱을 설정해 줌
		});

		Button sendButton = new Button("메시지 보내기");
		// 클라이언트 접속하기 이전에는 사용할 수 없도록 설정 처리함
		sendButton.setDisable(true);
		
		// 버튼을 누르는 이벤트가 발생했을 때 전송이 이루어질 수 있도록
		sendButton.setOnAction(event -> {
			send(userName.getText() + " : " + input.getText() + "\n");
			input.setText("");// 서버로 메시지 전송 후에 입력란을 빈공간으로 비워둠(초기화 처리함)
			input.requestFocus();// 다시 사용자가 메시지를 입력 전송 처리할 수 있도록 포커싱을 설정해 줌
		});
		
		Button connectionButton = new Button("접속하기");
		connectionButton.setOnAction(event ->{
			// 사용자가 버튼을 보았는데, 현재 "접속허ㅏ기"인 것을 클릭했다면
			if (connectionButton.getText().equals("접속하기")) {
				int port = 9007; // 포트 번호 기본 설정
				
				try {
					// 포트 번호 입력 란에 들어 있는 텍스트 내용을 정수 형태로 변환해서 port에 대입 처리함
					// 사용자가 직접 포트 번호를 입력 설정할 수 있도록 함
					port = Integer.parseInt(portText.getText());
					
					
					// 특정한 IP 주소에 특정 Port번호로 접속 할 수 있도록
					startClient(IPText.getText(), port);
					// runLater() 메서드로 실질적으로 화면에 채팅 관련 내용이 출력될 수 있도록 처리함
					Platform.runLater(()-> {
						textArea.appendText("[채팅방 접속 성공]\n");
					});
					connectionButton.setText("종료하기");// 접속 성공하면 "종료하기"로 버튼 변경처리함
					
					input.setDisable(false); // 입력란을 수정할 수 있도록 false로 처리함
					sendButton.setDisable(false); // 전송 버튼을 사용할 수 있도록 false 처리함
					input.requestFocus();// 입력란에 바로 입력 가능하도록 포커싱 처리해 줌.
					
				} catch (Exception e) {
					e.getMessage();
				}
			} else {
				// 접속하기 버튼이 아니라 종료하기 버튼인 상태라면
				stopClient();
				Platform.runLater(() -> {
					textArea.setText("[채팅방 퇴장]\n");
				});
				connectionButton.setText("접속하기");
				input.setDisable(true); // 입력란을 수정할 수 없도록 true로 처리함
				sendButton.setDisable(true); // 전송 버튼을 사용할 수 없도록 true로 처리함
			}
			
			
		});
		
		// 위에서 설정한 내용을 넣을 객체 공간 생성해 줌
		BorderPane pane = new BorderPane();
		pane.setLeft(connectionButton);
		pane.setCenter(input);
		pane.setRight(sendButton);
		
		root.setBottom(pane);
		
		Scene scene = new Scene(root, 600, 600);
		primaryStage.setTitle("My Multi ChatClient Ver 1.0");
		primaryStage.getIcons().add(new Image(Class.forName("application.Main").getResourceAsStream("/application/resources/icon/icon2.png")));
		primaryStage.setScene(scene);
		// 화면 닫기 버튼을 누르면 stopClient() 메서드 호출 후 종료 처리합니다.
		primaryStage.setOnCloseRequest(event -> stopClient());
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
