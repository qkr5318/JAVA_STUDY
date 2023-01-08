package source18_jsoup.review;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// https://www.bbq.co.kr/brand/noticeList.asp 웹사이트의 정보를
// 웹크로링하는 자바 프로그램을 제작해 봅니다.

public class Review_Jsoup02 {
	public static void main(String[] args) throws IOException {

		String URL = "https://www.bbq.co.kr/brand/noticeList.asp";
//		System.out.println(URL);
		
		Connection conn = Jsoup.connect(URL);
//		System.out.println(conn);
		
		Document html = conn.get();
//		System.out.println(html);
		
		System.out.println("[Attribute 탐색]");
		Elements fileblocks = html.getElementsByClass("ta-l");
		for (Element fileblock : fileblocks) {
//			System.out.println(fileblock);
			Elements files = fileblock.getElementsByTag("a");
			for (Element elm : files) {
				String text = elm.text();
//				System.out.println(text);
				String href = elm.attr("href");
//				System.out.println(href);
			}
		}
		
		System.out.println("\n[CSS Selector 탐색]");
		// .ta-l 클래스 안에 있는 a태그의 정보를 files 변수에 대입 처리합니다.
		Elements files = html.select(".ta-l a");
//		System.out.println(files);
		for (Element elm : files) {
			String href = elm.attr("href");
//			System.out.println(href);
			String text = elm.text();
			System.out.println(text);
		}
	}
}


