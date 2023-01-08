package source02.chapter02;

public class Test04_VariableScopeExample {

	public static void main(String[] args) {
		
		int v1 = 7;
		if(v1 > 10) {
			int v2;
			v2 = v1 -10;
			System.out.println("v2 = " + v2);
		}
		int v3 = v1 + 5;
		System.out.println("v3 = " + v3);
		
		
	}

}
