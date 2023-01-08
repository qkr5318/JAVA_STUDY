package source02;

public class Test05 {
	public static void main(String[] args) {
		double a = 10.58;
		float b = 10.3f;
		int c = 30;
		System.out.println((int)a); // 10
		int result = (int)a + (int)b + c;
		System.out.println(result);
		
		float d = 6.78f;
		System.out.println((int)d); // 6
		
		int e = (int)7.88;
		System.out.println(e);
	}
}
