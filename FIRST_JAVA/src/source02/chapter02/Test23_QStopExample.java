package source02.chapter02;

import java.io.IOException;

public class Test23_QStopExample {
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode = " + keyCode);
			if (keyCode == 113) {
				break; // keyCode가 113(q)일 경우 while 반복문을 중지함
			}
		}
		System.out.println("프로그램 종료");
	}
}
