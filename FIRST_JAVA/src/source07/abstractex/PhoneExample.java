package source07.abstractex;

public class PhoneExample {

	public static void main(String[] args) {

		
//		Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("장나라");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
