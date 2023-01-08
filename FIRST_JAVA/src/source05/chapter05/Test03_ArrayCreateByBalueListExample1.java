package source05.chapter05;

public class Test03_ArrayCreateByBalueListExample1 {
	public static void main(String[] args) {
		int scores [] = {83, 90, 87};
		
//		System.out.println("scores[0] : " + scores[0]);
//		System.out.println("scores[1] : " + scores[1]);
//		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for (int i = 0; i < 3; i++) { // i = 0, 1, 2
			sum += scores[i];
			System.out.println("i = " + i);
			System.out.println("scores[i] = " + scores[i]);
			System.out.println("sum = " + sum);
		}
		System.out.println("총합 = " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 = " + avg);		
	}
}
