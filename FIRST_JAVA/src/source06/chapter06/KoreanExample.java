package source06.chapter06;

public class KoreanExample {

	public static void main(String[] args) {

		Korean k1 = new Korean("장나라", "881111-2345788");
		System.out.println("k1.name = " + k1.name);
		System.out.println("k1.ssn = " + k1.ssn);
		
		Korean k2 = new Korean("김희선", "851111-2345678");
		System.out.println("k2.name = " + k2.name);
		System.out.println("k2.ssn = " + k2.ssn);		
	}
}
