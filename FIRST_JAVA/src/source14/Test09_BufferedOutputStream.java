package source14;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Test09_BufferedOutputStream {
	public static void main(String[] args) throws IOException {

		String file, str;
		
		Date date = new Date(); // 현재 날짜를 객체로 생성해 줍니다.
		str = "파일 생성시간\n" + date + "\n";
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일 경로와 이름을 입력해 주시기 바랍니다 ==> ");
		file = read.readLine();
		System.out.println("저장할 문자열을 입력해 주시기 바랍니다 ==> ");
		str += read.readLine(); // str = str + read.readLine();
				
		byte byte_str [] = str.getBytes();
		
		FileOutputStream fos = new FileOutputStream(file);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write(byte_str);
		bos.close();
		System.out.println(file + " 파일을 성공적으로 저장했습니다!");
	}
}

// 실행 결과
// 파일 경로와 이름을 입력해 주시기 바랍니다 ==> 
// C:/Test/second.txt
// 저장할 문자열을 입력해 주시기 바랍니다 ==> 
// Nice to meet you~ ^-^/
// C:/Test/second.txt 파일을 성공적으로 저장했습니다!

