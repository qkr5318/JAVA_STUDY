package source06.chapter06;

import java.util.Scanner;

public class ReveiwExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("좋아하는 이름을 입력해 주시기 바랍니다 ==> ");
		String scanName = scan.next();
		System.out.print("희망하시는 나이를 입력해 주시기 바랍니다 ==> ");
		int scanAge = scan.nextInt();
		
		Review rv = new Review();
		System.out.println(rv);
		System.out.println(rv.name);
		rv.name = "김희선";
		System.out.println(rv.name);
		System.out.println(rv.age);
		rv.age = 25;
		System.out.println(rv.age);
		
		Review rv2 = new Review("이영애");
		System.out.println(rv2.name);
		
		Review rv3 = new Review(scanName, scanAge);
		System.out.println(rv3.name + ", " + rv3.age);
		
		
		
	}

}
