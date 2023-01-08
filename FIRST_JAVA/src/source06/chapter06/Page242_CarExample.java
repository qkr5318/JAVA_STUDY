package source06.chapter06;

public class Page242_CarExample {

	public static void main(String[] args) {

		Page242_Car car1 = new Page242_Car();
		System.out.println("car1.company = " + car1.company);
		System.out.println("car1.company = " + car1.model);
		System.out.println();
		
		Page242_Car car2 = new Page242_Car("쏘나타");
		System.out.println("car2.company = " + car2.company);
		System.out.println("car2.model = " + car2.model);
		System.out.println();
		
		Page242_Car car3 = new Page242_Car("그랜져", "빨강색");
		System.out.println("car3.company = " + car3.company);
		System.out.println("car3.model = " + car3.model);
		System.out.println("car3.color = " + car3.color);
		System.out.println();
		
		Page242_Car car4 = new Page242_Car("싼타페", "녹색", 200);
		System.out.println("car4.company = " + car4.company);
		System.out.println("car4.model = " + car4.model);
		System.out.println("car4.color = " + car4.color);
		System.out.println("car4.maxSpeed = " + car4.maxSpeed);		
	}
}
