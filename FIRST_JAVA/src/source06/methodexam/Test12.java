package source06.methodexam;


public class Test12 {
	
	public int increase(int n) {
		++n;
		System.out.println("increase 메서드에서 ++n 되어진 값 = " + n);
		return n;
	}
		
	public static void main(String[] args) {

		int var1 = 100;
		Test12 val = new Test12();
		
		int result = val.increase(var1);
		System.out.println("var1 = " + var1 + ", result = " + result);		
	}
}
