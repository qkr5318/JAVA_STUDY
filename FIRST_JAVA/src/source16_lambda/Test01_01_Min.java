package source16_lambda;

public class Test01_01_Min {
	public static void main(String[] args) {

		
		MyMin min = (int x, int y) -> {return x < y ? x : y;};
		
		min.printDefault();
		
		MyMin.printStatic();
		
		if(min.min(10, 5) == 5) {
			System.out.println("정답입니다!");
		} else {
			System.out.println("오답입니다!");
		}
	}
}


