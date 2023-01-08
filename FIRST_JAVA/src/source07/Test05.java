package source07;

class Parent3{
	int a = 10;
}

class Child3 extends Parent3{
	void display() {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

public class Test05 {
	public static void main(String[] args) {
		Child3 ch3 = new Child3();
		ch3.display();
	}	
}





