package source07.abstractex;

public abstract class Animal {  // 추상 클래스 Animal

	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다!");
	}
	
	public abstract void sound();
//	public void sound() {
//		
//	}

}
