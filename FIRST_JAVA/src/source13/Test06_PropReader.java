package source13;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//실무에서 자바 설정파일의 경우, 개발 환경 설정 시 해당 정보를 프로퍼티(properties)로 만들고
//필요할때만 읽어서 사용합니다. 해당 정보들을 자바 클래스 파일에 지정해 둘 경우,
//정보가 변경되면 컴파일을 다시 해줘야 하는 등의 번거로움이 있기에 프로퍼티 활용을 권장해 드립니다.
//보통, DB 접속 정보나 특정 모듈의 경로 정보, 로그 파일의 위치 정보와 같은 내용을 프로퍼티에
//기재해서 활용합니다. 자바에서 프로퍼티 파일로는 텍스트 형식과 xml 형식이 있습니다.
//우리는 텍스트 형식을 활용해 봅니다. 텍스트 형식의 properties 파일의 경우,
//일반 텍스트 형식의 파일에 확장자는 .properties로 설정해 줍니다.
public class Test06_PropReader {
	public static void main(String[] args) throws Exception {

		try {
		String propFile = "C:/Test/config.properties";
		
		Properties props = new Properties();
		
			FileInputStream fis = new FileInputStream(propFile);
			
			// 프로퍼티 파일 로딩
			props.load(new BufferedInputStream(fis));
			
			// TEST Key의 Value값을 msg 객체 참조 변수에 담아서 처리하기 
			String msg1 = props.getProperty("TEST");
			String msg2 = props.getProperty("TODAY");
			
			// 콘솔 출력 확인
			System.out.println(msg1);			
			System.out.println(msg2);			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}


