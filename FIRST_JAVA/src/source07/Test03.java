package source07;

class Parent1{
	public Parent1() {
		System.out.println("이것은 Parent1() 생성자입니다!");
	}
	void display() {
		System.out.println("부모 클래스의 display() 메서드 입니다!");
	}
}

class Child1 extends Parent1{
	
	public Child1() {
		System.out.println("자식 클래스 생성자입니다~~ ★");
	}

	@Override
	void display() {
//		super.display();
		System.out.println("자식 클래스의 display() 메서드 입니다!");
	}	
}

public class Test03 {
	public static void main(String[] args) {
		
		Parent1 pa = new Parent1();
		pa.display();
		
		Child1 ch1 = new Child1();
		ch1.display();
		
		System.out.println("================================");		
		Parent1 pc = new Child1();
		pc.display();		
		Child1 cpc = (Child1)pc;
		cpc.display();
		
		System.out.println("================================");
		Parent1 pc1 = new Parent1();  // 실행하면 ClassCastException 예외 발생
		Child1 cpc1 = (Child1)pc1;    // 실행하면 ClassCastException 예외 발생
		cpc1.display();               // 실행하면 ClassCastException 예외 발생
	}
}




