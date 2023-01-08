package source13.chapter13;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {

		List<Board> list = new Vector<Board>();
		
		// Board 객체를 저장 처리함
		list.add(new Board("제목1", "내용1", "글쓴이1")); // 인덱스 0
		list.add(new Board("제목2", "내용2", "글쓴이2")); // 인덱스 1
		list.add(new Board("제목3", "내용3", "글쓴이3")); // 인덱스 2
		list.add(new Board("제목4", "내용4", "글쓴이4")); // 인덱스 3
		list.add(new Board("제목5", "내용5", "글쓴이5")); // 인덱스 4
		
		list.remove(2);  // 2번 인덱스 객체(제목3) 삭제(뒤의 인덱스는 1씩 앞으로 당겨짐)
		list.remove(3);  // 3번 인덱스 객체(제목5) 삭제
		
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}


