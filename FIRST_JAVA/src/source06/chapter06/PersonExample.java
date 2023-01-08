package source06.chapter06;

public class PersonExample {

	public static void main(String[] args) {

		Person p1 = new Person("123456-2345678", "장나라");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
//		p1.nation = "Canada";
//		p1.ssn = "1234567-1123456";
		p1.name = "김희선";
		System.out.println(p1.name);		
	}
}
