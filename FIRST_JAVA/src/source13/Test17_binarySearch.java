package source13;

import java.util.Arrays;

public class Test17_binarySearch {

	public static void main(String[] args) {

		int arr1 [] = {1, 5, 3, 2, 4};
		// Arrays.sort() 이용해서 arr1 정렬 처리함
		// 탐색 이전에 정렬이 선행되어야 합니다.
		Arrays.sort(arr1);
		
		// 향상된 for each문으로 arr1 요소 5개 만큼 반복 수행함
		for (int i : arr1) {
			System.out.print(i + " "); //       1 2 3 4 5
			                           // index 0 1 2 3 4
		}
		System.out.println("\n===========================");
		
		// Arrays.binarySearch() 활용해서 arr1 배열 요소 3의 정렬 위치 2를 찾아냄
		int idx = Arrays.binarySearch(arr1, 3); // 2 
		System.out.println("Index of 3 : " + idx);
	}
}




