package source13.collection_review;

import java.util.List;
import java.util.Vector;

// Board 객체를 저장 처리하는 Vector 클래스 활용 자바 프로그램 제작
public class VectorExample {

	public static void main(String[] args) {

		List<Board> list = new Vector<>();
		
		// Board 객체를 생성해서 저장 처리함
		list.add(new Board("제목1", "내용1", "글쓴이1")); // 인덱스 0
		list.add(new Board("제목2", "내용2", "글쓴이2")); // 인덱스 1
		list.add(new Board("제목3", "내용3", "글쓴이3")); // 인덱스 2
		list.add(new Board("제목4", "내용4", "글쓴이4")); // 인덱스 3
		list.add(new Board("제목5", "내용5", "글쓴이5")); // 인덱스 4
		
		list.remove(2);
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}



