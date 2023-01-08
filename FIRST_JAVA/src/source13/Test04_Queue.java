package source13;

import java.util.LinkedList;
import java.util.Queue;

public class Test04_Queue {
	public static void main(String[] args) {

		Queue<String> q = new LinkedList<String>();
		
		System.out.println(q.poll()); // null
		
		q.offer("사과");
		System.out.println("바나나를 추가했나요? " + q.offer("바나나"));
		q.add("체리");
		System.out.println("헤드 엿보기 : " + q.peek());
		
		String head = null;
		head = q.remove();
		System.err.println(head + " 제거하기");
		
		System.out.println("새로운 헤드 : " + q.peek());
		System.out.println("List형 자료 구조에 체리를 포함하고 있나요? " + q.contains("체리"));
		System.out.println("List형 자료 구조에 사과를 포함하고 있나요? " + q.contains("사과"));
	}
}




