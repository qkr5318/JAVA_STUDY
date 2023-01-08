package source18_jsoup;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// https://www.bbq.co.kr/brand/bbq.asp 웹사이트의 정보를
// 크롤링하는 자바 프로그램을 제작해 봅니다.

public class Crawling_5_jsoup {

	public static void main(String[] args) throws IOException {

		// 1) 크롤링 정보 수집 대상 URL을 지정하여
		//    String 형식의 문자열 변수 URL에 대입합니다.
		String URL = "https://www.bbq.co.kr/brand/bbq.asp";
//		System.out.println(URL);
		
		// 2) Jsoup 클래스의 connect() 메서드로
		//    URL 연결 접속 Connection을 생성합니다.
		Connection conn = Jsoup.connect(URL);
//		System.out.println(conn);
		
		// 3) Connection 생성 연결 객체 정보를 바탕으로
		//    HTML 정보를 파싱해 옵니다.
		Document html = conn.get();
//		System.out.println(html);
		
		// 4) Connection 생성 연결 객체 정보를 바탕으로
		//    파싱해 온 HTML 정보를 화면으로 출력해서 보여줍니다.
		System.out.println(html.toString());
		
	}
}


