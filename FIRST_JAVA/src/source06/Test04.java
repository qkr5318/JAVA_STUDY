package source06;

class Person{
	String name; // 인스턴스 필드 name 생성
	int age; // 인스턴스 필드 age 생성
	
	public Person setName(String name) {
		this.name = name;
		return this;
	}
	public Person setAge(int age) {
		this.age = age;
		return this;
	}
	
	public void sayHello() {
		System.out.println("안녕하세요, 제 이름은 " + name + "이고, " + age + "살 입니다!");
	}	
}


public class Test04 {

	public static void main(String[] args) {

		Person person = new Person();
		
//		person.name = "장나라";
//		person.age = 21;
//		person.sayHello();
		
		// 다음의 setName(), setAge는 this를 반환하므로 Person 객체임
		// 따라서, person.setName().setAge()는 sayHello()를 호출할 수 있음 
		person.setName("장나라").setAge(21).sayHello();
	}
}
