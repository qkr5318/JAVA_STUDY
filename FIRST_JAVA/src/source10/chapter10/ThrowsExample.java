package source10.chapter10;

public class ThrowsExample {
	public static void main(String[] args) {

		try {
			findClass();
			System.out.println("클래스가 존재합니다!");
		} catch (ClassNotFoundException e) {		
//			e.printStackTrace();
			System.out.println("고객님~ 클래스가 존재하지 않습니다!");
		}		
	}

	public static void findClass() throws ClassNotFoundException {
		Class cla = Class.forName("java.lang.String2");		
	}

}
