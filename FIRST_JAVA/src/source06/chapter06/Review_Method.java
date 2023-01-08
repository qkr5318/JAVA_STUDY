package source06.chapter06;

public class Review_Method {

	int plus(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	void  execute() {
		int result = plus(10, 11);
		printConsole("실행결과 = " + result);
	}

	void printConsole(String string) {
		System.out.println(string);		
	}	
}
