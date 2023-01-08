package source05;

// 문자 배열 표현
public class Test10 {
	public static void main(String[] args) {

		String stu [][] = {
				{"장나라", "서울시 송파구"},
				{"김희선", "서울시 영등포구"},
				{"이영애", "서울시 구로구"}
		};
//		System.out.println(stu);
//		System.out.println(stu[0][0]);
//		System.out.println(stu[0][1]);
//		System.out.println(stu[1][0]);
//		System.out.println(stu[1][1]);
//		System.out.println(stu[2][0]);
//		System.out.println(stu[2][1]);
		for (int i = 0; i < stu.length; i++) {  // i = 0, 1, 2
			for (int j = 0; j < 2; j++) { // j = 0, 1
				System.out.println(stu[i][j] + " ");				
			}
			System.out.println("");
		}
	}
}
