package source07.package02;

import source07.package01.ProtectedAce;

public class Test07 extends ProtectedAce {

	public Test07() {
		super();
		this.name = "김희선";
		this.ProtectedAce();
	}
	
	public static void main(String[] args) {

		Test07 t07 = new Test07();
		System.out.println("t07.name = " + t07.name);
	}
}
