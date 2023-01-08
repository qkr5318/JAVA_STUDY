package source11.chapter11;



public class MathRandomExample {
	public static void main(String[] args) {

		int num = (int)(Math.random()*6) + 1;		
		System.out.println("주사위의 눈 = " + num);
		System.out.println(Math.random());
		System.out.println((Math.random()*6));
		System.out.println((int)(Math.random()*6));
		System.out.println((int)(Math.random()*6)+1);
		
	}
}
