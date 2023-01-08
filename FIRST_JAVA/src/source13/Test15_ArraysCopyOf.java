package source13;

import java.util.Arrays;

public class Test15_ArraysCopyOf {
	public static void main(String[] args) {

		int [] arr1 = {1, 2, 3, 4, 5};
		
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		
		System.out.println("=============================");
		
		// 위에 arr1 요소들 중에서 ArrayscopyOf() 메서드 활용
		// 4개 요소까지만 복사(복제함)
		int [] arr2 = Arrays.copyOf(arr1, 4);
		for (int i : arr2) {
			// arr2에 복사(복제)된 요소만 출력됨
			System.out.print(i + " ");
		}
	}
}


