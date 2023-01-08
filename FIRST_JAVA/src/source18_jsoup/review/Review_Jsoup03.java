package source18_jsoup.review;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

import javax.imageio.ImageIO;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sun.org.apache.bcel.internal.classfile.Field;

//망고플레이트의 부산 이탈리안 맛집 베스트 7곳 URL에 있는
//정보와 이미지를 크롤링하는 자바 프로그램을 제작해 봅니다.
//https://www.mangoplate.com/top_lists/1825_busan_italian
//크롤링한 이미지는 C드라이브의 tasteimages 폴더에 저장합니다.
//C드라이브에 tasteimages 폴더를 생성하고, 소스 코딩 후에 Java Application을 실행 확인 바랍니다.
public class Review_Jsoup03 {
	
	public String saveDir = null; // 저장 폴더 필드 정의
	public String fileformat = null; // 파일 포맷 형식 필드 정의
	public String url = null; // URL 주소 정보 필드 정의
	// import java.awt.image.BufferedImage;
	public BufferedImage bi = null;  // 버퍼 저장 이미지 필드 정의
	// import java.net.URL;
	public URL imageurl = null; // 이미지 url 필드 정의
	public String saveFileName = null; // 저장 파일 이름 필드 정의
	Iterator<Element> titleInfo = null; // 이미지 타이틀 정보 필드 정의
	Iterator<Element> imgName = null; // 이미지 이름 정보 필드 정의
	Iterator<Element> imgInfo = null; // 이미지 정보 필드 정의

	private Document doc = null;
	
	public Review_Jsoup03(String url) {
		this.url = url;
	}

	public Review_Jsoup03(String saveDir, String fileformat, String url) {
		this.saveDir = saveDir;
		this.fileformat = fileformat;
		this.url = url;
	}

	// 맛집 리스트 정보값을 가져오는 getList() 메서드 정의
	public void getList() throws IOException {
		doc = Jsoup.connect(url).get();
//		System.out.println(doc);
		Elements element = doc.select("div.with-review");
//		System.out.println(element);
		titleInfo = element.select("figure.restaurant-item a").iterator();
		while (titleInfo.hasNext()) {
//			System.out.println(titleInfo.next());
			System.out.println(titleInfo.next().text());
		}
	}

	// 이미지 다운 기능의 imageDown() 메서드 정의
	public void imageDown() throws IOException {
		Elements element = doc.select("div.with-review");
		System.out.println("● element 변수 정보 = " + element);
		imgName = element.select("img").iterator();
		System.out.println("◆ imgName 변수 정보 = " + doc.select("img"));
		
		imgInfo = element.select("img").iterator();
		System.out.println("=================================================");
		// 이미지 정보를 while 반복문으로 읽어 옵니다.
		while (imgInfo.hasNext()) {
			String image = imgInfo.next().attr("data-original");
			System.out.println("이미지 주소 = " + image);
			imageurl = new URL(image);
			// import javax.imageio.ImageIO;
			// ImageIO 클래스의 read() 메서드를 활용하여
			// 이미지 정보를 읽어들여서 버퍼 이미지 변수에 대입 처리 합니다.
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
			
			// import java.io.File;
			// File 클래스를 활용하여 saveFile 변수에 saveDir 변수와
			// saveFileName 변수값을 대입 처리 합니다.
			File saveFile = new File(saveDir + saveFileName);
			// saveFile 정보를 갖고 있는 fileformat 변수 형식의 bi 정보를
			// ImageIO 클래스의 write()를 활용하여 기록 저장 합니다.
			ImageIO.write(bi, fileformat, saveFile);
		}
		
	}

	public static void main(String[] args) throws IOException {
		
		String url = "https://www.mangoplate.com/top_lists/1825_busan_italian";
		Review_Jsoup03 test = new Review_Jsoup03(url);
//		System.out.println(test);
//		test.getList();
		
		// 우유빙수 맛집 베스트 15곳 https://www.mangoplate.com/top_lists/971_milk_bingsu
		String inputUrl = "https://www.mangoplate.com/top_lists/971_milk_bingsu";
		
		Review_Jsoup03 crw = new Review_Jsoup03("C:\\tasteimages\\", "jpg", inputUrl);
		// crw 인스턴스에 생성된 맛집 리스트 정보값을 가져오는
		// getList() 메서드를 호출하여 정보를 표시합니다.
		crw.getList();		
		// 앞서 getList()에서 인식된 정보를 토대로
		// crw 인스턴스에 생성된 이미지 다운로드 데이터를
		// imageDown() 메서드를 호출하여 파일 저장 처리합니다.
		crw.imageDown();
	}
}


