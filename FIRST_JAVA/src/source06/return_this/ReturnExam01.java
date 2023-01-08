package source06.return_this;

public class ReturnExam01 {

	public static void main(String[] args) {

		int hap = 0;
		int i;
		
		for (i = 0; i <= 100; i++) {
			hap += i; // hap = hap + i;
			if (hap > 500) {
				System.out.printf("hap 변수값이 500을 초과했을 때 숫자는 %d 입니다! \n", hap);
				return;
			}
//			System.out.printf("hap 변수값이 500을 초과하기 전에 숫자는 %d 입니다! \n", hap);			
		}
	}
}
