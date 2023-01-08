package source05;

// 스택 구현 : 한쪽 끝이 막힌 터널과 같은 자료 구조, LIFO(Last In First Out) 구조
public class Test09 {
	public static void main(String[] args) {

		// char형 stack 배열에 5개의 메모리 공간을 할당함
		char[] stack = new char[5];
		int top = 0; // top 변수 초기값을 0으로 선언함
		
		stack[top] = 'A';
		System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
		top++;
		
		stack[top] = 'B';
		System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
		top++;
		
		stack[top] = 'C';
		System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
		top++;
		
		System.out.println("====================================");
		
		top--;
		System.out.printf("%c 자동차가 터널을 빠져나감\n", stack[top]);
		stack[top] = ' ';
		
		top--;
		System.out.printf("%c 자동차가 터널을 빠져나감\n", stack[top]);
		stack[top] = ' ';
		
		top--;
		System.out.printf("%c 자동차가 터널을 빠져나감\n", stack[top]);
		stack[top] = ' ';		
	}
}
