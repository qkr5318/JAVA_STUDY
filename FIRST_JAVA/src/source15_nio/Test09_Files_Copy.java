package source15_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

// Files 클래스의 copy() 메서드 활용 파일 복사 자바 프로그램을 제작해 봅니다.
public class Test09_Files_Copy {
	public static void main(String[] args) throws IOException {

		// C드라이브 Test 폴더 안에 images 폴더 안에 있는 house1.jpg 파일을
		Path from = Paths.get("C:/Test/images/house1.jpg");
		
		// C드라이드 Test 폴더 안에 images 폴더 안에 copy_house.jpg 파일로
		Path to = Paths.get("C:/Test/images/copy_house.jpg");
		
		// Files.copy() 메서드 활용 표준카피옵션.REPLACE_EXISTING적용 copy 실행함.
		Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
		
		System.out.println("파일 복사가 성공했습니다!");
	}
}



