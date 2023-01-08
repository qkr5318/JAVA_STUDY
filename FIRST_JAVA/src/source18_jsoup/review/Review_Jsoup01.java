package source18_jsoup.review;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

//웹크롤링(웹스크래핑) 고려사항
//1. 웹 크롤링이 막혀 있거나 이미지(또는 텍스트) 소스가 개별 코드로
// 분리되어 있을 경우에는 크롤링이 어려울 수도 있습니다.
//2. 웹 크롤링(웹스크래핑) 대상 서버에 심한 부하를 주지 않도록 배려가 필요합니다.
// (이미지 파일 1,000건 웹크롤링 다운로드 등 대상 서버에 부하를 주지 않도록 합니다)
//3. 웹크롤링 추출 콘텐츠의 저작권을 보호해 줍니다.
//4. 웹크롤링 거부 표현을 하는 웹사이트와 웹페이지는 크롤링을 하지 않도록 합니다.
public class Review_Jsoup01 {
	public static void main(String[] args) throws IOException {

		// http://example.com/ 웹 사이트 정보를 크롤링해서
		// Document 타입의 doc 변수에 대입 처리합니다.
		String url = "http://example.com";
		Document doc = Jsoup.connect(url).get();
//		System.out.println(doc);
		
		// 웹크롤링 doc 데이터 중에서 첫번째 a 태그 정보를 link 변수에 대입해 줌.
		Element link = doc.select("a").first();
//		System.out.println(link);
		
		// Element(요소).text(); 의미는 엘리먼트 요소의 텍스트 노드값을 리턴 처리함.
		String text = doc.body().text();
//		System.out.println(text);
		
		String linkText = link.text();
//		System.out.println(linkText);
		
		// Element(요소).attr("속성이름"); 의미는 엘리먼트 요소의 "속성이름"에 대한 값을 리턴 처리함.
		String linkHref = link.attr("href");
		System.out.println(linkHref);
	}
}


