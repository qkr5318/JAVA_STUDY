package source02.chapter02;

import java.io.IOException;

public class Test21_KeyCodeExample {
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		keyCode = System.in.read(); // a
		System.out.println("keyCode = " + keyCode); // keyCode = 97
		
		keyCode = System.in.read(); // ENTER(CR)
		System.out.println("keyCode = " + keyCode); // keyCode = 13 
		
		keyCode = System.in.read(); // ENTER(LF)
		System.out.println("keyCode = " + keyCode); // keyCode = 10
	}
}
