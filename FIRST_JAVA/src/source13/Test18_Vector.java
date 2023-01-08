package source13;

import java.util.Vector;

public class Test18_Vector {
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(new Integer(4));
		v.add(10);
		
		// 벡터 요소(Element)값 중에서 0번 인덱스(5), 1번 인덱스(4), 2번 인덱스에 -1값을 삽입 저장 처리함
		v.add(2, -1);		
		System.out.println("Vector 내의 요소 Element 저장 값 : " + v);
		System.out.println("Vector 내의 요소 Element 객체 수 : " + v.size());
		System.out.println("Vector 내의 1번 인덱스 값 = " + v.get(1));
	}
}


