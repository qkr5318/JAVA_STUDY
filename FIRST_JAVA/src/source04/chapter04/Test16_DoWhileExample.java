package source04.chapter04;

public class Test16_DoWhileExample {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		do {
			sum += num; // sum = sum + num;
			num++;
		}while(num <= 100);
		
		System.out.println("1부터 100까지의 합 = " + sum + "입니다!");
	}
}
