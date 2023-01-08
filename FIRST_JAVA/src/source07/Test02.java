package source07;

class Parent{
	private int a = 10;
	public int b = 20;
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
}

class Child extends Parent{
	public int c = 30;
	
	void display() {
		System.out.println(getA());
		System.out.println(b);
		System.out.println(c);
	}
}
public class Test02 {
	public static void main(String[] args) {

		Child ch = new Child();
		ch.display();
	}
}








