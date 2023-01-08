package source04;

// while문을 사용해서 n까지 더한 합이 20이상이 되는 최초의 n값과
// n까지 더한 합을 표현하는 프로그램을 제작해 봅니다.
// 예를들면, 1 + 2 + 3 + ... + n = 20 이상이 되는 n값

public class Test13 {
	public static void main(String[] args) {

		int n = 0;
		int sum = 0;
		while (true) {
			sum += n; // sum = sum + n;
			System.out.println("sum값의 변화 = " + sum);
			if(sum >= 20) {
				break;
			} else {
				n++;
				System.out.println("n값의 변화 = " + n);
			}
		}
		System.out.println("20이상이 되게 하는 최초의 n값 = " + n); // 6
		System.out.println("n까지 더한 합 = " + sum); // 21
	}
}
