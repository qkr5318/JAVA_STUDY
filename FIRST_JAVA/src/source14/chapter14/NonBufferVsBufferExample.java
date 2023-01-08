package source14.chapter14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 다음은 성능 향상 보조 스트림(BufferedInputStream, BufferedOutputStream)을 사용했을 때와
// 사용하지 않았을 때의 파일 복사 실행 성능 차이를 보여줍니다. 실행 결과를 보면 보조 스트림을 사용했을 때가
// 훨씬 성능이 좋아지는 것을 알 수 있는 자바 프로그램 예시 입니다.
// 파일 복사 성능 테스트용 NonBufferVsBufferExample 클래스 소스 코딩!
public class NonBufferVsBufferExample {
	public static void main(String[] args) throws Exception {

		// 기본 스트림 생성
		String originalFilePath1 = NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/Test/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		// 기본 스트림에 버퍼 활용 보조 스트림 연결 처리
		String originalFilePath2 = NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/Test/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2); // 보조 스트림 연결 처리
		BufferedOutputStream bos = new BufferedOutputStream(fos2); // 보조 스트림 연결 처리
		
		// 기본 스트림 FileInputStream, FileOutputStream만 사용할 경우, 원본 파일 복사 시간 측정
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때 : \t" + nonBufferTime + "ns");
		
		// 기본 스트림 FileInputStream, FileOutputStream에 추가적으로 보조 스트림 BufferedInputStream, BufferedOutputStream을 이용했을 경우, 원본 파일 복사 시간 측정
		long buffertime = copy(bis, bos);
		System.out.println("버퍼를 사용했을 경우 : \t\t" + buffertime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}

	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime(); // 시작 시간 저장 변수 start 선언
		// [파일 복사] 원본 파일에서 읽은 1byte를 타깃 파일로 바로 출력 처리함
		while (true) {
			data=is.read();
			if(data == -1) {
				break;
			}
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime(); // 끝 시간 저장 변수 end 선언
		return (end-start); // 끝시간(end)-시작시간(start) 차이, 즉 복사에 걸린 시간을 리턴 처리해 줌
	}
}





