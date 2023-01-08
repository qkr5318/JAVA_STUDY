package source06.chapter06.access.package2;

import source06.chapter06.access.package1.Base;

public class Case {

//	Ace ace;
	Base base;	
	
	public static void main(String[] args) {
		
		Base base1 = Base.getInstance();
		
		Base base2 = new Base(false);
		
		Base base3 = new Base(true);
		base3.method1();
	}
}
