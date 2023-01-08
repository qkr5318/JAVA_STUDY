package source01;

public class Test06_args {

	public static void main(String[] args) {

		String arg1 = args[0];
		String arg2 = args[1];		
		System.out.println("Arg is " + arg1);
		System.out.println("Arg is " + arg2);
	}
}
// 이클립스에서는 Test06.java 파일 선택 우클릭
// - Run As - Run Configurations... 클릭
// - Arguments - Program arguments 탭 아래에 5 30 입력함 - Run 클릭
// 결과값 확인
// Arg is 5
// Arg is 30
// C:\JAVA_STUDY\FRIST_JAVA\bin>java source01.Test06 5 30
// 결과값 확인
// Arg is 5
// Arg is 30
