package source04.chapter04;

public class Test08_SwitchStringExample {

	public static void main(String[] args) {

		String position = "과장";
		
		switch (position) {
		case "부장":
			System.out.println("월급여 800만원");
			break;
		case "과장":
			System.out.println("월급여 700만원");
			break;
		default:
			System.out.println("월급여 300만원");
		}
	}

}
