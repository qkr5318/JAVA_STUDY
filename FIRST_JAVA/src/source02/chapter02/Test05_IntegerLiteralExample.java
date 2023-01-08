package source02.chapter02;

public class Test05_IntegerLiteralExample {
	public static void main(String[] args) {
		int var1 = 0b1011;  // 2진수 : 0b 또는 0B
		System.out.println("var1 = " + var1); // var1 = 11
		int var2 = 0206;    // 8진수 : 0
		System.out.println("var2 = " + var2); // var2 = 134
		int var3 = 365;     // 10진수
		System.out.println("var3 = " + var3); // var3 = 365
		int var4 = 0xB3;    // 16진수 : 0x 또는 0X
		System.out.println("var4 = " + var4); // var4 = 179 
	}
}
