package source11.chapter11.java_api_class;

public class Test01_Math {
	public static void main(String[] args) {

		// Math 클래스의 static pow() 메서드 활용 : 2의 8승 256.0 출력
		System.out.println("Math.pow(2, 8) : " + Math.pow(2, 8));
		
		// Math 클래스의 static random() 메서드 활용 : 0.0 이상 1.0 미만 난수 출력
		System.out.println("Math.random() : " + Math.random());
		System.out.println((int)(Math.random()*6)+1); // 주사위의 눈의 수 6가지 : 1, 2, 3, 4, 5, 6
		System.out.println((int)(Math.random()*45)+1); // 행운의 로또 45가지 숫자 : 1 ~ 45
		System.out.println("Math.min(40, 30) : " + Math.min(40, 30));
		System.out.println("Math.max(40, 30) : " + Math.max(40, 30));
	}
}

