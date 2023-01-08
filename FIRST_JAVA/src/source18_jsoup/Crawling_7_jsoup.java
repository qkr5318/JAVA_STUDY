package source18_jsoup;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

import javax.imageio.ImageIO;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//네이버 뉴스 웹사이트 URL에 있는 정보와 이미지를 크롤링하는 자바 프로그램을 제작해 봅니다.
//네이버 뉴스 웹사이트 URL = https://news.naver.com/main/list.nhn?mode=LS2D&mid=shm&sid1=101&sid2=263
//크롤링한 이미지는 C드라이브의 download 폴더에 저장합니다.
//C드라이브에 download 폴더를 생성하고, 소스 코딩 후에 Java Application을 실행 확인 바랍니다.
public class Crawling_7_jsoup {
	
	public String saveDir = null; // 저장 폴더 필드
	public String fileformat = null; // 파일 포맷 형식 필드
	public String url = null; // URL 주소 정보 필드
	// import java.awt.image.BufferedImage;
	public BufferedImage bi = null; // 버퍼 저장 이미지 필드
	// import java.net.URL;
	public URL imageurl = null; // 이미지 URL 필드
	public String saveFileName = null; // 저장 파일 이름 필드
	Iterator<Element> titleInfo = null; // 이미지 타이틀 정보 필드
	Iterator<Element> imgName = null; // 이미지 이름 필드
	Iterator<Element> imgInfo = null; // 이미지 정보 필드
	
	// Document형의 doc 변수에 웹 페이지 전체 소스를 저장할 것이며,
	// null로 초기화 처리합니다.
	private Document doc = null;
	
	// url을 매개변수로 입력 받는 생성자 정의
	public Crawling_7_jsoup(String url) {
		this.url = url;
	}
	
	// url, saveDir(저장폴더), fileformat(파일 포맷 형식)을 매개변수로 입력 받는 생성자 정의
	public Crawling_7_jsoup(String url, String saveDir, String fileformat) {
		this.url = url;
		this.saveDir = saveDir;
		this.fileformat = fileformat;
	}
	
	// 뉴스 리스트 정보값을 가져오는 getList() 메서드 정의
	public void getList() throws IOException {
		// get() 메서드를 활용하여 url에서 크롤링한 정보를
		// Document 타입의 변수 doc에 대입 처리함.
		doc = Jsoup.connect(url).get();
//		System.out.println(doc);
		
		// select() 메서드를 이용해서 원하는 태그를 선택합니다.
		// select() 메서드는 원하는 값을 가져오기 위한 중요한 기능입니다.
		Elements element = doc.select("div.list_body.newsflash_body");
//		System.out.println(element);
		
		// titleInfo 변수 정보를 Iterator를 사용하여 하나씩 값을 읽어 옵니다.
		// li 태그 안에 dl 태그 안에 dt 태그 안에 a 태그 값을 titleInfo 변수에 대입합니다.
		titleInfo = element.select("li dl dt a").iterator();
		while (titleInfo.hasNext()) {
			// li 태그 안에 dl 태그 안에 dt 태그 안에 a 태그값 안에 있는
			// 텍스트 값을 화면으로 출력해 줍니다.
			System.out.println(titleInfo.next().text());
		}
	}
	
	// 이미지 다운 기능의 imageDown() 메서드 정의
	public void imageDown() throws IOException {		
		Elements element = doc.select("div.list_body.newsflash_body");
		System.out.println("● element 변수 정보 = " + element);
		imgName = element.select("img").iterator();
		System.out.println("◆ imgName 변수 정보 = " + imgName);		
		
		imgInfo = element.select("img").iterator();
		// 이미지 정보를 while 반복문으로 읽어 옵니다.
		while (imgInfo.hasNext()) {
			String image = imgInfo.next().attr("src");
			System.out.println("이미지 주소 = " + image);
			imageurl = new URL(image);
			// ImageIO 클래스의 read() 메서드를 활용하여
			// 이미지 정보를 읽어들여서 버퍼 이미지 변수에 대입 처리합니다.
			bi = ImageIO.read(imageurl);
			// saveFileName 변수에 파일명 저장 시 윈도우 파일명에 들어가지 못하는
			// 특수문자들 /:*?"<>|\
			// 윈도우 파일명에 /:*?"<>|\ 특수문자들 중에서 한개를 넣어보시기 바랍니다.
			// 그러면, 에러 메시지가 나타납니다.
			// saveFileName 변수에 파일명 저장 시 윈도우 파일명에 사용 가능한
			// 특수문자들로 replace() 메서드를 활용해서 치환 처리해 줍니다.
			// 윈도우 파일명에 .;..'().. 특수문자들을 넣어보시기 바랍니다. 파일명이 저장됩니다.
			// saveFileName = replace("/", ".").replace(":", ";").replace("*", ".").replace("?", ".")
			// .replace("\"", "'").replace("<", "(").replace(">", ")").replace("|", ".").replace("\\", ".") + ".jpg";
			// "중요) 이미지 이름에 들어가지 못하는 특수문자 replace 메서드 치환 예시.jpg" 이미지도 함께 참고 바랍니다.
			saveFileName = imgName.next().attr("alt").replace("/", ".").replace(":", ";").replace("*", ".").replace("?", ".").replace("\"", "'").replace("<", "(").replace(">", ")").replace("|", ".").replace("\\", ".") + ".jpg";
			
			// File 클래스를 활용하여 saveFile 변수에 saveDir 변수와
			// saveFileName 변수값을 대입 합니다.
			File saveFile = new File(saveDir + saveFileName);
			// saveFile 정보를 갖고 있는 fileformat 변수 형식의 bi 정보를
			// ImageIO 클래스의 write() 를 활용하여 기록 저장 처리합니다.
			ImageIO.write(bi, fileformat, saveFile);
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		Crawling_7_jsoup test = new Crawling_7_jsoup("https://news.naver.com/main/list.nhn?mode=LS2D&mid=shm&sid1=101&sid2=263");
		//		test.getList();

		Crawling_7_jsoup crw = new Crawling_7_jsoup("https://news.naver.com/main/list.nhn?mode=LS2D&mid=shm&sid1=101&sid2=263", "C:\\download\\", "jpg");
				crw.getList();
				crw.imageDown();

	}
}
