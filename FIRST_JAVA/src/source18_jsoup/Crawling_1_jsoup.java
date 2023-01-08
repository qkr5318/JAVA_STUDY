package source18_jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling_1_jsoup {
	public static void main(String[] args) throws IOException {

		// http://en.wikipedia.org/ 웹사이트 정보를 Jsoup 클래스로
		// 크롤링해서 Document 타입의 doc 변수에 대입 처리합니다.
		Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
//		System.out.println(doc);
		
		// doc 변수에 있는 title 태그 정보를 log 메서드로 출력해 줍니다.
		log(doc.title());
		System.out.println("\n이것은 구분선! ==================================");
		
		// doc 객체에 저장된 정보 중에서 아이디가 mp-itn 안에 b태그 안에 있는 a태그 내용을
		// Elements 타입의 newsHeadlines 변수에 대입 처리 합니다.
		Elements newsHeadlines = doc.select("#mp-itn div a");
//		System.out.println(newsHeadlines);
		for (Element headline : newsHeadlines) {
			// newsHeadlines 변수에 저장된 title 속성값, href 속성값을 화면으로 출력합니다.
        	// %s(첫번째 문자열 표현), \n(줄바꿈), \t(탭 간격 띄우고), %s(두번째 문자열 표현)
        	// , headline.attr("title") 내용을 위에 %s(첫번째 문자열 표현)로 대입해서 표시합니다.
        	// , headline.absUrl("href") 내용을 위에 %s(두번째 문자열 표현)로 대입해서 표시합니다.
			log("%s\n\t%s", headline.attr("title"), headline.absUrl("href"));
			System.out.println("\n이것은 구분선! ==================================");
		}
	}

	// 메시지와 인수값들을 매개변수로 입력 받아서 처리하는 log() 메서드를 정의합니다.
	private static void log(String msg, String... vals) {
		System.out.println(String.format(msg, vals));
	}

}
