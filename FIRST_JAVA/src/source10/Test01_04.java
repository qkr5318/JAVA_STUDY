package source10;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 비만도 계산 프로그램 : 키와 몸무게를 입력 받아서 비만도를 계산하는 프로그램

[비만도 계산 공식]
1) 표준체중 : (신장(cm)-100) * 0.9 = 표준체중
2) 비만도 : (측정체중-표준체중)/표준체중 * 100
            비만 : +20% 이상
            경도비만 : +10% 이상 ~ +20% 미만
            정상 : -10% 이상 ~ +10% 미만
            약간마름 : -20% 이상 ~ -10% 미만
            매우마름 : -20% 미만
3) 입력값에 문제가 있을 경우 예외처리하여 프로그램을 종료시켜줌. */

public class Test01_04 {
	public static void main(String[] args) {

		int h, w; // h = 키값 저장 변수, w = 몸무게값 저장 변수
		float a, o; // a = 표준 체중값 저장 변수, o = 비만도값 저장 변수
		
		Scanner inputData = new Scanner(System.in);
		
		try {
			System.out.print("고객님의 키를 입력해 주세요(입력 범위 = 100 ~ 250) ==> ");
			h = inputData.nextInt();
			if (h<100 || h >= 251) {
				System.out.println("잘못된 범위의 값을 입력하셨습니다!");
				System.exit(0); // 시스템 종료 처리
			}
			System.out.println("고객님의 키는 " + h + "cm 입니다!\n");
			
			System.out.print("몸무게를 입력해 주세요 ==> ");
			w = inputData.nextInt();
			if (w <= 0) {
				System.out.println("잘못된 범위의 값을 입력하셨습니다!");
				System.exit(0);
			}
			System.out.println("고객님의 몸무게는 " + w + "kg 입니다!\n");
			// 1) 표준체중 : (신장(cm)-100) * 0.9 = 표준체중
			a = ((float)h-100)*(float)0.9; // 표준 체중을 a변수에 대입해 줍니다!
//		2) 비만도 : (측정체중-표준체중)/표준체중 * 100
//         비만 : +20% 이상
//         경도비만 : +10% 이상 ~ +20% 미만
//         정상 : -10% 이상 ~ +10% 미만
//         약간마름 : -20% 이상 ~ -10% 미만
//         매우마름 : -20% 미만
			o = (((float)w - a)/a)*100; // 비만도를 o변수에 대입해 줍니다!
			if (o>=20) {
				System.out.println("귀하께서는 비만입니다!"); // 비만 : +20% 이상
			} else if (o >= 10) {
				System.out.println("귀하께서는 경도비만 상태 입니다!"); // 경도비만 : +10% 이상 ~ +20% 미만			
			} else if (o < 10 && o >= -10) {
				System.out.println("귀하께서는 정상 체중 입니다!"); // 정상 : -10% 이상 ~ +10% 미만
			} else if (o < -10 && o >= -20) {
				System.out.println("귀하께서는 약간 마름 상태 입니다!"); // 약간마름 : -20% 이상 ~ -10% 미만
			} else {
				System.out.println("귀하께서는 매우 마름 상태 입니다!"); // 매우마름 : -20% 미만
			}			
		} catch (InputMismatchException e) {
			System.out.println("고객님~ 정수값을 입력해 주세요!");
		} finally {
			inputData.close();
		}		
	}
}
