package source09.exam03;

class Ticon{
	int n = 10;
	interface Touchable{
		void touch();
	}
	public Ticon() {
		System.out.println("★ 외부 클래스 Ticon 생성자!");
	}
}


public class InnerInterfaceExample implements Ticon.Touchable {
	
	public InnerInterfaceExample() {
		System.out.println("@InnerInterfaceDemo 생성자 체크입니다!");
	}
	
	@Override
	public void touch() {
		System.out.println("아이콘을 터치합니다!");		
	}
	
	public static void main(String[] args) {
		System.out.println("★ Application 시작!");
		Ticon.Touchable btn = new InnerInterfaceExample();
		btn.touch();
		
		Ticon tc = new Ticon();
		int k = tc.n;
		System.out.println("k = " + k);
	}
}


