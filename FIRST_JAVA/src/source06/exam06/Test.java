package source06.exam06;

class Field{
	static int classVar = 10; // static 변수(클래스 변수) 선언
	int instanceVar = 20; // 인스턴스 변수 선언
}

public class Test {
	public static void main(String[] args) {

		int var = 30; // 로컬 변수(지역 변수) 선언
		System.out.println("지역 변수 var = " + var); 
		
		Field myField1 = new Field(); // myField1 인스턴스 객체 생성
		Field myField2 = new Field(); // myField2 인스턴스 객체 생성
		
		System.out.println("static 변수(클래스 변수) 참조 = " + Field.classVar);
		
		myField1.classVar = 100; // static(클래스) 변수의 값을 변경 처리함
		System.out.println(Field.classVar); // 변경된 static(클래스) 변수 참조 : 100
		System.out.println(myField1.instanceVar); // 인스턴스 객체 변수 참조 : 20
		myField1.instanceVar = 200;
		System.out.println(myField1.instanceVar); // 200
 		
		System.out.println(myField2.instanceVar); // 20		
	}
}
