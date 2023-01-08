package source06.chapter06;

import java.util.Scanner;

public class AnimalExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("좋아하는 동물 종류를 입력해 주세요 ==> ");
		String myKind = scan.next();
		System.out.print("좋아하는 동물 이름을 입력해 주세요 ==> ");
		String myName = scan.next();
		
		Animal zoo2 = new Animal(myKind, myName);
		System.out.println("저는 " + zoo2.kind + " " + zoo2.name + "을 좋아합니다!");
	
		Animal zoo1 = new Animal("강아지", "퐁키");
		System.out.println("저는 " + zoo1.kind + " " + zoo1.name + "을 좋아합니다!");
		scan.close();
	}
}
