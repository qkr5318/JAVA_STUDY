package source04.chapter04;

public class Test17_BreakExample {

	public static void main(String[] args) {

		while (true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램이 종료 되었습니다!");
	}
}
