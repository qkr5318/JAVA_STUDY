package application;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

// ChatServer가 1명의 Client와 통신을 하기 위해서 필요한 기능을 정의한 Client 클래스입니다.
public class Client {

	// 네트워크 상에서 통신을 하기 윈한 소켓 필드 정의
	Socket socket;
	
	public Client(Socket socket) {
		this.socket = socket;
		receive();
	}

	// 클라이언트로부터 메시지를 전달 받는 메서드 receive() 정의
	public void receive() {
		Runnable thread = new Runnable() {
			
			// 하나의 Thread가 어떠한 모듈 형태로 동작을 할 것인지 run()에서 정의를 해줍니다.
			@Override
			public void run() {
				try {
				// 클라이언트로부터 반복적으로 내용을 전달 받을 수 있도록 조건은 true로 설정함
				while (true) {
					// 내용을 전달받기 위한 InputStream 객체 생성합니다.
						InputStream in = socket.getInputStream();
					// 한번에 512byte 만큼 전달 받을 수 있는 버퍼를 생성합니다.
						byte[] buffer = new byte[512];
						// 실제로 클라이언트로부터 어떠한 내용을 전달 받아서 buffer에 담아주도록 합니다.
						// 이때, length는 담기는 메시지으 크기(글자수)를 의미합니다.
						int length = in.read(buffer);
						
						// 메시지를 읽어들일 떄 오류가 발생했다면 예외 처리를 해줍니다.
						while (length == -1) {
							throw new IOException();
						}											// 클라이언트의 주소 정보를 출력해 줍니다.
						System.out.println("[메시지 수신 성공]" + socket.getRemoteSocketAddress() + " : " + Thread.currentThread().getName());// 쓰레드 이름 출력
						
						//buffer에서 전달받은 내용을 message 변수에 담아서 출력할 수 있도록 하며,
						// 한글을 포함하는 UTF-8로 인코딩 처리를 합니다.
						String message = new String(buffer, 0, length, "UTF-8");
						
						// 위에서 메시지를 전달 받는다면, 전달 받은 메시지를 다른 클라ㅣ언트들에게도 전송 처리하도록 합니다.
						for (Client client : Main.clients) {
							client.send(message);
						}
						
				}
				} catch (IOException e) {							 // 메시지를 보낸 클라이언트 주소 출력
					System.out.println("[메시지 수신 오류]" + socket.getRemoteSocketAddress() + " : " + Thread.currentThread().getName());// 해당 쓰레드 이름도 출력함
					
				}
			}
		};
		// Thread를 안정적으로 관라히기 위해 Thread를 ThreadPool에 등록해 줍니다.
		Main.threadPoll.submit(thread);
		
		
		
	}
	// 클라이언트에게 메시지를 전송하는 send() 메서드 정의
	public void send(String message) {
		Runnable thread = new Runnable() {
			
			@Override
			public void run() {

				try {
					// 메시지를 보낼 때는 OutputStream 이용
					OutputStream out = socket.getOutputStream();
					byte[] buffer = message.getBytes("UTF-8");
					
					// 예외가 발생하지 않는다면
					// buffer(버퍼)에 담긴 내용을 서버에서 클라이언트로 전송 처리해 줍니다.
					out.write(buffer);
					// 반드시 flush() 메서드 처리를 해주어, 버펑의 내용을 모두 비워줍니다.
					out.flush();
				} catch (IOException e) {
					try {
					System.out.println("[메시지 송신 오류] " + socket.getRemoteSocketAddress() + " : " + Thread.currentThread().getName());
					
					// 이 부분에서 예외가 발생하였다면, Main 클래스에 접속한 모든 클라이언트들을 
					// 담아둔 배열에서 현재 존재하는 클라이언트를 지워 줍니다.
					// 즉, 예외가 발생하여 해당 클라이언트가 서버로부터 접속이 끊어졌다는 것을
					// 서버 내에서도 해당 클라이언트의 접속 끊김에 대한 정보를 처리하는 것입니다.
					// 이것을 통해, 클라이언트에서 예외가 발생한 클라이언트르 제거해 줍니다.
					Main.clients.remove(Client.this);
						socket.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		};
		Main.threadPoll.submit(thread);
	}
}
