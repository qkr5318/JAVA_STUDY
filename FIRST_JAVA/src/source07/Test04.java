package source07;

import java.util.Scanner;

class Parent2{
	void display() {
		System.out.println("부모 클래스의 display() 메서드 입니다!");
	}
}

class Child2 extends Parent2{

	@Override
	void display() {
		System.out.println("자식 클래스의 display() 메서드 입니다!");
	}
	
	void display(String str) {
		System.out.println(str);
	}
	
}

public class Test04 {
	public static void main(String[] args) {

		Child2 ch2 = new Child2();
		ch2.display();
		Scanner scan = new Scanner(System.in);
		System.out.print("화면으로 보여주고 싶은 문자열을 입력해 주시기 바랍니다 ==> ");
		String str = scan.nextLine();
		ch2.display(str);
		scan.close();
	}
}






