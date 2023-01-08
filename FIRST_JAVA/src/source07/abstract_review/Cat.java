package source07.abstract_review;

public class Cat extends Animal {

	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {  // 추상 메서드 sound()의 메서드 오버라이딩(재정의) 활용
		System.out.println("고양이가 야옹~ 야옹~ 합니다!");
	}
}
