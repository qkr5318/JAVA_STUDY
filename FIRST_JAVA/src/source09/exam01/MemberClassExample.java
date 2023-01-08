package source09.exam01;

public class MemberClassExample {

	private String secret = "비공개";
	String str = "외부";
	
	public MemberClassExample() {
		System.out.println("※ MemberClassExample 생성자!");
	}
	
	class MemberClass{
		public MemberClass() {
			System.out.println("★ MemberClass 생성자!");			
		}
		String str = "내부";
		
		public void show() {
			System.out.println("인스턴스 멤버 클래스!");
			System.out.println(secret);
			System.out.println(str);
			System.out.println(MemberClassExample.this.str);
		}
	}
	public static void main(String[] args) {
		System.out.println("@main 함수 실행 체크!");

		MemberClassExample me = new MemberClassExample();
		MemberClassExample.MemberClass mc = me.new MemberClass();
		System.out.println(mc.str);
		mc.show();
	}
}

