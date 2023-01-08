package source11.chapter11;

public class StringTrimExmaple {
	public static void main(String[] args) {

		String tel1 = "  02";
		System.out.println(tel1.trim()); // 02
		String tel2 = "123   ";
		System.out.println(tel2.trim()); // 123
		String tel3 = "   1234   ";
		System.out.println(tel3.trim()); // 1234
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}
}


