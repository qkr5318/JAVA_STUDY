package source09.chapter09.nested_this;

public class OutterExample {

	public static void main(String[] args) {

		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();		
	}
}
