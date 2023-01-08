package source05.chapter05;

public class Test12_EnhancedForExample {

	public static void main(String[] args) {

		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for (int score : scores) {
			sum+=score;   // sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println(scores.length); // 5
		System.out.println("점수 평균 = " + avg);
	}
}
