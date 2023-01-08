package source15_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test03_Files {
	public static void main(String[] args) throws IOException {

		// C드라이브 Test 폴더 안에 있는 fighting.txt 파일 정보를 읽어들여서
		// 화면으로 출력하는 자바 프로그램을 제작해 봅니다.
		Path path = Paths.get("C:/Test/fighting.txt");
		System.out.println("디렉토리 여부 확인 : " + Files.isDirectory(path));
		System.out.println("파일 여부 : " + Files.isRegularFile(path));
		System.out.println("마지막 수정 시간 : " + Files.getLastModifiedTime(path));
		System.out.println("파일 크기 : " + Files.size(path) + "바이트");
		System.out.println("소유자 : " + Files.getOwner(path).getName());
		System.out.println("숨김 파일 여부 : " + Files.isHidden(path));
		System.out.println("읽기 가능 여부 : " + Files.isReadable(path));
		System.out.println("쓰기 가능 여부 : " + Files.isWritable(path));
	}
}


