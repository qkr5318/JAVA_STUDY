package source13.generic_ex;

import java.util.ArrayList;

public class Test01 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add(new String("봄"));
		list.add(new String("여름"));
		list.add(new String("가을"));
		list.add(new String("겨울"));
		
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("============================");
		
		ArrayList<Integer> itg = new ArrayList<>();
		itg.add(new Integer(100));
		itg.add(new Integer(200));
		itg.add(new Integer(300));
		itg.add(new Integer(400));
		
		for (Integer integer : itg) {
			System.out.println(integer);
		}
	}
}



