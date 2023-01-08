package source09.chapter09.local_use;

public class Outter {

	// 자바 7 까지는 반드시 final 키워드를 붙여야 되었지만,
	public void method1(final int arg) {
		final int localVariable = 1;
		// arg = 100;
		// localVariable = 100;		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	// 자바 8 부터는 final 키워드를 붙이지 않아도 final 특성을 가지고 있습니다.
		public void method2(int arg) {
			final int localVariable = 1;
			// arg = 100;
			// localVariable = 100;		
			class Inner{
				public void method() {
					int result = arg + localVariable;
				}
			}
		}
	
	
}
