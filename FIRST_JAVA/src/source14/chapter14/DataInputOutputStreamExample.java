package source14.chapter14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws IOException {

		// 바이트 기반 출력 스트림을 생성하고 DataOutputStream 보조 스트림을 연결 처리해 줌
		FileOutputStream fos = new FileOutputStream("C:/Test/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		// 기본 타입값의 데이터를 C드라이브의 Test 폴더 안에 있는 primitive.db 파일에 출력(기록) 처리함.
		dos.writeUTF("장나라");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("김희선");
		dos.writeDouble(97.3);
		dos.writeInt(2);
		
		System.out.println("C드라이브 Test 폴더 안에 primitive.db 파일 생성 및 데이터 출력(기록)이 되었습니다.");
		dos.flush(); // 버퍼에 남아 있는 데이터를 모두 출력 처리함
		dos.close(); // 출력 스트림을 닫아줌
		
		// 바이트 기반 입력 스트림 FileInputStream을 생성하고 보조 스트림인 DataInputStream을 연결 처리합니다.
		FileInputStream fis = new FileInputStream("C:/Test/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		// C드라이브 Test 폴더 안에 있는 primitive.db에 출력(기록) 되어 있는 기본 타입 데이터 값을 반복해서 읽어옴.
		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		dis.close(); // 입력 스트림 닫기
	}
}



