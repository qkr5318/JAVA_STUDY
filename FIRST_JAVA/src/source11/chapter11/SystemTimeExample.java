package source11.chapter11;

// 다음은 for문을 사용해서 1부터 1000000까지의 합을 구하는데 걸리는 시간을 화면으로 표시해 주는
// 자바 프로그램을 제작하는 예시 입니다.
public class SystemTimeExample {
	public static void main(String[] args) {
		
		long time1 = System.nanoTime(); // 합 구하는 연산의 시작 시간 읽기!
		System.out.println("시작 시간 = " + time1);
		int sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += i;			
		}		
//		System.out.println(sum);
		
		long time2 = System.nanoTime(); // 합 구하는 연산의 끝 시간 읽기!
		System.out.println("끝 시간 = " + time2);
		System.out.println("1 ~ 1000000까지의 합 : " + sum);
		System.out.println("계산에 " + (time2 - time1) + " 나노초가 소요되었습니다!");
	}
}

