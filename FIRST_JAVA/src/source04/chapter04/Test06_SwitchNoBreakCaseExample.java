package source04.chapter04;

import javax.swing.text.AbstractDocument.BranchElement;

public class Test06_SwitchNoBreakCaseExample {

	public static void main(String[] args) {
										// 1 <= ... <= 6
//		int time = (int)(Math.random()*6) + 1;
										// 5 <= ... <= 8
//		int time = (int)(Math.random()*4) + 5;		
										// 8<=...<=11사이의 정수 뽑기
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재 시각: " + time + " 시]");
		
		switch (time) {
		case 8:
			System.out.println("출근합니다!");
//			break;
		case 9:
			System.out.println("회의를 합니다!");
//			break;
		case 10:
			System.out.println("업무를 봅니다!");
//			break;
		default:
			System.out.println("외근을 나갑니다!");
//			break;
		}
		
	}

}
