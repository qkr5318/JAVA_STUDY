package source04;

public class Test01_If {

	public static void main(String[] args) {

		int score = 85;
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다!");
			System.out.println("등급은 A입니다!");
		} else {
			System.out.println("점수가 90보다 작습니다!");
			System.out.println("등급은 B입니다!");
		}
		
		char ch = 'c';
		if((ch >= 'a' && ch <= 'z')||(ch>'A'&&ch<='Z')) {
			System.out.println(ch + "는 알파벳입니다!");
		} else {
			System.out.println(ch + "는 알파벳이 아닙니다!");
		}		
	}

}
