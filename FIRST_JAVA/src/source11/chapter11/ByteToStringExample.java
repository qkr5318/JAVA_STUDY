package source11.chapter11;

public class ByteToStringExample {
	public static void main(String[] args) {

		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
//		System.out.println((char)72);  // H
		System.out.println(str1); // Hello Java
									// 74의 인덱스 위치값(6)부터 4개 데이터 : Java
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2); // Java
	}
}

