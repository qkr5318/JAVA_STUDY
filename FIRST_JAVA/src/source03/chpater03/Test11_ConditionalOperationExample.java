package source03.chpater03;

public class Test11_ConditionalOperationExample {

	public static void main(String[] args) {

		int score = 95;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
//		char grade;
//		if(score > 90) {
//			grade = 'A';
//		} else {
//			grade = 'B';
//		}
		
		System.out.println(score + "점은 " + grade + "등급입니다!");
	}
}
