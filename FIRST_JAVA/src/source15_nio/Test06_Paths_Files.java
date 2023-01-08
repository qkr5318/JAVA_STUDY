package source15_nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Test06_Paths_Files {
	public static void main(String[] args) throws IOException {

		System.out.println("운영체제 종류 : " + System.getProperty("os.name"));
		System.out.println();
		
		// Paths 경로 지정 : C드라이브에 nio.txt 파일을 생성하기 위함.
		Path path = Paths.get("C:/Test/nio.txt");
		Files.createDirectories(path.getParent());
		
		// 파일 생성(CREATE), data 기록(WRITE)
		FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
		
		String data = "hi~ Janganra!";
		// 문자셋은 코딩 프로그램에 셋팅된 값으로 UTF-8 또는 ANSI 등 설정함.
		Charset charset = Charset.defaultCharset();
		ByteBuffer byteBuffer = charset.encode(data);
		
		// UTF-8 인코딩 형식은 영문 1글자는 글자당 1bytes, 한글 1글자는 3bytes
		int byteCount = fileChannel.write(byteBuffer);
		System.out.println("nio.txt : " + byteCount + " bytes written");
		fileChannel.close(); // 채널 클로징(닫기)
	}
}

