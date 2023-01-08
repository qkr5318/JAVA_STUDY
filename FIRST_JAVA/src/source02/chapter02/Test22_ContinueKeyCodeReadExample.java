package source02.chapter02;

import java.io.IOException;

public class Test22_ContinueKeyCodeReadExample {
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode = " + keyCode);
		}
	}
}
