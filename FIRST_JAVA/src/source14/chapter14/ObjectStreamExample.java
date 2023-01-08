package source14.chapter14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// 객체 입출력 보조 스트림 활용 예시
public class ObjectStreamExample {
	public static void main(String[] args) throws Exception {

		writeList();
		System.out.println("파일에 내용이 잘 기록되었습니다!");
		
		List<Board> list = readList();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Board board : list) {
			System.out.println(board.getBno() + "\t" + board.getTitle() + "\t" + board.getContent() + "\t" + board.getWriter() + "\t" + sdf.format(board.getDate()));
		}
	}

	public static List<Board> readList() throws Exception {
		// 주 스트림 FileInputStream 활용
		FileInputStream fis = new FileInputStream("C:/Test/board.db");
		// 객체 입력 보조 스트림 ObjectInputStream 연결 처리
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject();
		return list;
	}

	public static void writeList() throws Exception {

		List<Board> list = new ArrayList<>();
		list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));
		
		// 주 스트림 FileOutputStream 활용해서 C드라이브에 Test 폴더 안에 board.db 파일에 list 내용을 출력(기록) 처리함
		FileOutputStream fos = new FileOutputStream("C:/Test/board.db");
		// 객체 출력 보조 스트림  ObjectOutputStream 활용 list 내용을 출력(기록) 처리함
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush(); // 버퍼에 남아 있는 모든 객체 데이터를 출력(기록) 처리함
		oos.close(); // 스트림 닫아줌 
	}
}






