package source18_jsoup;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// https://www.bbq.co.kr/brand/bbq.asp 웹사이트의 정보를
// 크롤링하는 자바 프로그램을 제작해 봅니다.

public class Crawling_6_jsoup {

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

		System.out.println("================================================================");
		
		// 4) 요소(Element) 정보 탐색
		// 4-1) Attribute 정보 탐색
		System.out.println("[Attribute 탐색]");
		Elements fileblocks = html.getElementsByClass("ddak_font");
//		System.out.println(fileblocks);
		// for문으로 fileblocks에 저장된 ddak_font 클래스 정보를 화면으로 출력합니다.
		for (Element element : fileblocks) {
			Elements files = element.getElementsByTag("a");
			for (Element elm : files) {
				// element에 저장된 텍스트 노드 요소 정보를 text 변수에 대입 처리 합니다.
				String text = elm.text();
//				System.out.println(text);
				// fileblock에 저장된 href 속성의 값을 href 변수에 대입 합니다.
				String href = elm.attr("href");
//				System.out.println(href);
				// text 변수 내용과 href 변수 내용을 화면으로 출력 표시해 줍니다.
				System.out.println(text + " => " + href);
			}
		}

		// 4-2) CSS Selector 정보 탐색
		System.out.println("\n[CSS Selector 탐색]");
		// footer-sns 클래스 안에 있는 a태그의 정보를 files 변수에 대입 합니다.
		Elements files = html.select(".footer-sns a");
//		System.out.println(files);
		
		for (Element elm : files) {
			String href = elm.attr("href");
			// footer-sns 클래스 안에 있는 a 태그 정보의 화면 출력 형식 = href
			System.out.println("footer-sns 클래스 안에 있는 a 태그의 href 정보 = " + href);
		}
	}
}



