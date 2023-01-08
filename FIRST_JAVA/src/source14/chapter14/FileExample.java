package source14.chapter14;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 다음은 C드라이브의 Test 폴더 안에 images 폴더와 file1.txt, file2.txt, file3.txt 파일을 생성하고,
// Test 폴더에 잇는 파일 목록을 출력 처리하는 자바 프로그램 예시 입니다!
// File 클래스를 이용한 파일 및 폴더 정보 출력 FileExample 클래스 소스 코딩!
public class FileExample {
	public static void main(String[] args) throws Exception {

		File dir = new File("C:/Test/images");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file1 = new File("C:/Test/file1.txt");
		if(file1.exists() == false) {
			file1.createNewFile();
		}
		File file2 = new File("C:/Test/file2.txt");
		if(file2.exists() == false) {
			file2.createNewFile();
		}
		File file3 = new File("C:/Test/file3.txt");
		if(file3.exists() == false) {
			file3.createNewFile();
		}
		
		// C드라이브 Test 폴더의 내용 목록을 File 배열로 읽어 들임
		File test = new File("C:/Test");
		File[] contents = test.listFiles();
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("=================================================================");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for (File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if (file.isDirectory()) {
				System.out.println("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println("=================================================================");
		}
		
		System.out.println("처리가 잘 되었습니다!");
	}
}


