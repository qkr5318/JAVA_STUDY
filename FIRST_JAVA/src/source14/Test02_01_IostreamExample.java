package source14;

import java.io.IOException;

public class Test02_01_IostreamExample {
	public static void main(String[] args) throws IOException {

		int b, len = 0;
		int ba[] = new int[100];
		
		System.out.println("=== 입력 스트림 ===");
		// != '\n' : 줄바꿈(\n)이 되지 않을때까지(!=)를 의미함
		while ((b = System.in.read()) != '\n') {
			System.out.printf("%c(%d)", (char)b, b);
			ba[len++] = b;
		}
		System.out.println("\n\n=== 출력 스트림 ===");
		for (int i = 0; i < len; i++) {
			System.out.write(ba[i]);
		}
		System.out.flush(); // flush() 버퍼 메모리를 비워 줍니다!
	}
}

