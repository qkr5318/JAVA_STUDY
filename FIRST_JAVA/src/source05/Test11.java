package source05;

import java.util.Scanner;

// 배열에 있는 정보의 아이디와 비밀번호를 입력 받아서,
// 아이디와 비밀번호를 찾아주는 자바 프로그램을 제작해 봅니다. 

public class Test11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i = 0;
		String findId = "";
		String mem[][] = {
				{"song", "1234"},
				{"kim", "a007"},
				{"lee", "0000"}
		};
		System.out.print("찾으실 아이디를 입력해 주세요 ==> ");
		findId = scan.next();
		for (i = 0; i < mem.length; i++) {
			if(findId.equals(mem[i][0])) {
				System.out.println("비밀번호는 " + mem[i][1] + "입니다!");
				break;
			}			
			scan.close();
		}
		if(i == 3) {
			System.out.println("해당 아이디가 존재하지 않습니다!");
		}
	}
}
