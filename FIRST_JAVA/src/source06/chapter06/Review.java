package source06.chapter06;

public class Review {

	String name = "장나라";
	int age;
	
	public Review() {
		System.out.println("Review 클래스의 Review() 생성자 입니다!");
	}

	public Review(String name) {
		this.name = name;
	}

	public Review(String name, int age) {
		System.out.println("이거 생성자 실행되고 있음!");
		this.name = name;
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
}
