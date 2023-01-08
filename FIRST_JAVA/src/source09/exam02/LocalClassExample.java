package source09.exam02;

public class LocalClassExample {

	public LocalClassExample() {
		System.out.println("※ 이것은 LocalCalssExample 생성자입니다!");
	}
	
	void method() {
		class LocalClass{
			String str = "내부";
			public LocalClass() {
				System.out.println("★ 이것은 LocalClass 생성자입니다!");
			}
			public void show() {
				System.out.println("지역 클래스 LocalClass show() 메서드입니다!");
			}
		}
		LocalClass lc = new LocalClass();
		System.out.println(lc.str);
		lc.show();
	}
	
	public static void main(String[] args) {
		System.out.println("% 이것은 main() 함수 실행 체크입니다!");
		LocalClassExample lce = new LocalClassExample();
		lce.method();
	}
}


