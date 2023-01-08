package source10;

public class Test03_02 {
	public static void main(String[] args) {

		try {
			int [] array = {31, 21, 42};
			System.out.println("첫 번째 원소 => " + array[0]);
			System.out.println("두 번째 원소 => " + array[1]);
			System.out.println("세 번째 원소 => " + array[2]);
			System.out.println("네 번째 원소 => " + array[3]);	
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("원소가 존재하지 않습니다!" + " 에러 메시지 = " + e.getMessage());
		}
	}
}
