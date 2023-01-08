package source15_nio;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class Test05_Charset {
	public static void main(String[] args) {

		Charset charset = Charset.forName("UTF-8");
		
		// 문자열 -> 인코딩 -> ByteBuffer
		String data = "안녕하세요";
		ByteBuffer byteBuffer = charset.encode(data);
		System.out.println("문자열 복원 전 : " + data);
		
		// ByteBuffer -> 디코딩 -> CharBuffer -> 문자열
		data = charset.decode(byteBuffer).toString();
		System.out.println("문자열 복원 후 : " + data);
	}
}


