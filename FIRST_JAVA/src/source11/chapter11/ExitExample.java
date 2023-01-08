package source11.chapter11;

public class ExitExample {
	public static void main(String[] args) {

		for (int i = 0; i < 10;i++) {
			if(i == 5) {
//				System.exit(0);
				break;
			}			
			System.out.println("체크");
		}
		System.out.println("마무리 코드 실행!");		
	}
}
