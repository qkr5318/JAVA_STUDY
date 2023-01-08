package source07.chapter07.polymorphism;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) {
			int problemlocation = car.run();

			switch (problemlocation) {
			case 1:
				// 앞왼쪽 타이어가 펑크 났을 때 HankookTire로 교체
				System.out.println("앞 왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);				
				break;
			case 2:
				// 앞오른쪽 타이어가 펑크 났을 때 KumhoTire로 교체
				System.out.println("앞 오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);				
				break;
			case 3:
				// 뒤왼쪽 타이어가 펑크 났을 때 HankookTire로 교체
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);			
				break;
			case 4:
				// 뒤오른쪽 타이어가 펑크났을 때 KumhoTire로 교체
				System.out.println("뒤 오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);			
				break;
			}
			System.out.println("-------------------------------"); // 1회전 시 출력되는 내용을 구분함			
		}		
	}
}
