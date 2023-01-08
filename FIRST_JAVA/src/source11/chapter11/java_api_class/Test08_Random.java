package source11.chapter11.java_api_class;

import java.util.Random;

// java.lang 패키지에 있는 Math 클래스의 random() 메서드가 아닌
// java.util 패키지에 있는 Random 클래스 활용
public class Test08_Random {
	public static void main(String[] args) {

		Random ran = new Random();
		
		for (int i = 0; i < 5; i++) { // i = 0, 1, 2, 3, 4 (5개)
			// int nextInt() : int 타입의 난수를 발생 시켜줌.
			// int nextInt(int bound) : 0~n 사이의 int 타입 난수를 발생시켜줌.
			// 여기서는 0~ 100사이의 int 타입 나수를 발생시켜주며,
			// 그 중에서 5개까지 화면으로 출력해줌
			System.out.println(ran.nextInt(100) + " ");
		}
	}
}
