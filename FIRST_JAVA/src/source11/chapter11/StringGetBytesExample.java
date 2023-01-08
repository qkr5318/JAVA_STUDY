package source11.chapter11;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {

		String str = "안녕하세요~";
		// 기본 문자셋으로 인코딩과 디코딩 처리함
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1);
		// UTF-8 문자인코딩셋에서는 영문 1바이트, 한글 3바이트로 인식 처리함
		System.out.println("bytes1.length : " + bytes1.length); // 16
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String : " + str1); // 안녕하세요~
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			// EUC-KR 문자인코딩셋에서는 영문 1바이트, 한글 2바이트로 인식 처리함
			System.out.println("bytes2.length : " + bytes2.length); // 11
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2 -> String : " + str2);

			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("byte3.length : " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3 -> String : " + str3);
		} catch (UnsupportedEncodingException e) {			
			e.printStackTrace();
		}
	}
}


