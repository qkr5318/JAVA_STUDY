package source04.chapter04;

public class Test19_ContinueExample {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i%2 != 0) {  // 2로 나눈 나머지가 0이 아닐 경우,				
				continue;    // 즉 홀수인 경우,
			}
			System.out.println(i);
		}
		System.out.println("프로그램 종료");
	}
}
