package source06.methodexam;

public class Test13 {
	
	public void increase(int[] ref1) {
		for (int i = 0; i < ref1.length; i++) {
			ref1[i]++;
		}
	}
	
	
	public static void main(String[] args) {

		int[] ref1 = {100, 800, 1000};
		
		Test13 ref = new Test13();
		
		System.out.println("[메서드 호출 전]");
		for (int i = 0; i < ref1.length; i++) {
			System.out.println("ref1[" + i + "] = " + ref1[i]);
		}
		System.out.println("========================");
		
		ref.increase(ref1);
		
		System.out.println("[메서드 호출 후]");
		for (int i = 0; i < ref1.length; i++) {
			System.out.println("ref1[" + i + "] = " + ref1[i]);
		}
	}
}
