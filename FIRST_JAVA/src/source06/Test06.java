package source06;

import java.util.Scanner;

class Util{
	static int fourTimes(int i) {
		return i * 4;
	}
}

public class Test06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("4의 곱셈 결과값을 구하고 싶은 숫자를 입력해 주세요 ==> ");
		int num = scan.nextInt();

		System.out.println(Util.fourTimes(num));		
	}
}
