package source05;

// 2차원 배열 for문 활용 구현 자바 프로그램을 제작해 봅니다.
public class Test05 {
	public static void main(String[] args) {

		int [][] aa = new int [3][4]; // 2차원 배열을 선언함
		int i, k; // 배열의 첨자로 사용할 변수를 선언함
		int val = 1; // 배열에 들어갈 값을 초기화 함
		
		for (i = 0; i < aa.length; i++) { // i = 0, 1, 2
			for (k = 0; k < (aa.length + 1); k++) {
				aa[i][k] = val;
				val++;
			}			
		}
		System.out.println("<aa[0][0]부터 aa[2][3]까지 출력>\n");
		// 입력과 동일한 개념으로 12회 동안 각 값들을 화면으로 출력해 줌.
		for (i = 0; i < aa.length; i++) { // i = 0, 1, 2
			for (k = 0; k < (aa.length + 1); k++) {
				System.out.printf("%3d", aa[i][k]);
			}			
			System.out.println(""); // 한 행을 출력한 다음 줄바꿈을 해 줌.
		}		
	}
}
