package source03.chpater03;

public class Test03_DenyLogicOperatorExample {

	public static void main(String[] args) {

		boolean play = true;
		System.out.println(play); // true
		
		play = !play;
		System.out.println(play); // false
		
		play = !play;
		System.out.println(play); // true
	}

}
