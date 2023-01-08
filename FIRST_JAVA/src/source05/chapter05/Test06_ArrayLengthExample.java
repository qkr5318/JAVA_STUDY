package source05.chapter05;

public class Test06_ArrayLengthExample {
	public static void main(String[] args) {

		int[] scores = {83, 90, 87};
		System.out.println("배열의 길이 = " + scores.length);
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 = " + avg);
	}

}
