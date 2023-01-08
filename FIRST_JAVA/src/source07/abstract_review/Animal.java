package source07.abstract_review;

public abstract class Animal {  // 추상 클래스 Animal 생성

	public String kind;
	
	public void breathe() {     // 일반 메서드 breathe() 선언
		System.out.println("숨을 쉽니다!");
	}
	
	public abstract void sound();  // 추상 메서드 sound() 선언
	
}
