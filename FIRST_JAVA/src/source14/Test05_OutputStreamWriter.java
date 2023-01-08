package source14;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Test05_OutputStreamWriter {
	public static void main(String[] args) {

		char ch[] = {'안', '녕', '하', '세', '요'};
		String aa = "Hello";
		
		OutputStream out = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(out);
		
		try {
			osw.write(ch);
			osw.write("\n"); // \n 줄바꿈 처리
			osw.write(aa);
			osw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}


