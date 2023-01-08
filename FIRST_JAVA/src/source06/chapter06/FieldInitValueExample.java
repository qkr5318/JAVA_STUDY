package source06.chapter06;

import java.util.Scanner;

public class FieldInitValueExample {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해 주시기 바랍니다 ==> ");
		String name = scan.next();
		
		FieldInitValue fiv4 = new FieldInitValue(name);
		System.out.println(fiv4.name);

		FieldInitValue fiv2 = new FieldInitValue("이영애");
		System.out.println(fiv2.name);
		
		FieldInitValue fiv3 = new FieldInitValue("김다미");
		System.out.println(fiv3.name);
		
		FieldInitValue fiv = new FieldInitValue();
		System.out.println(fiv);
		System.out.println(fiv.name);		
		
		System.out.println("byteField : " + fiv.byteField);
		System.out.println("shortField : " + fiv.shortField);
		System.out.println("intField : " + fiv.intField);
		System.out.println("longField : " + fiv.longField);
		System.out.println("booleanField : " + fiv.booleanField);
		System.out.println("charField : " + fiv.charField);
		System.out.println("floatField : " + fiv.floatField);
		System.out.println("doubleField : " + fiv.doubleField);
		System.out.println("arrField : " + fiv.arrField);
		System.out.println("referenceField : " + fiv.referenceField);
	}
}
