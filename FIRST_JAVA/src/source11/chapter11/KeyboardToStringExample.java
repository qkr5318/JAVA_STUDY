package source11.chapter11;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {

		byte [] bytes = new byte[100]; // 읽은 바이트를 저장하기 위한 배열 생성
		System.out.print("문자를 입력해 주시기 바랍니다 ==> ");
		// 앞서 배열에서 읽은 바이트를 저장하고 읽은 바이트 수를 리턴 처리해 줍니다.
		int readByteNo = System.in.read(bytes);
		
		// String(byte[] bytes, int offset, int length) 형태로
		// 바이트 배열을 문자열로 변환하였는데, length 매개값으로 배열 길이에서 2를 빼준 이유는
		// 캐리지리턴(\r)+라인피드(\n) 부분은 문자열로 만들 필요가 없기 때문입니다!
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}
}


