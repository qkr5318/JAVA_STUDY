package source06.methodexam;

class Person{
	int age = 21;
}



public class Test15 extends Person{
	
	String name = "장나라";

	public static void printArrayResult(int b []) {
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");			
		}
	}
	
	public static void main(String[] args) {

		int a [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// int a[0] = 1;
		// int a[1] = 2;
		// ...
		// int a[9] = 10;
		printArrayResult(a);  // printArray() 메서드가 매개변수(parameter)로 배열을 갖는 경우		
	}
}
