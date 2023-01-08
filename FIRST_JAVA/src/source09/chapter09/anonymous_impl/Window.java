package source09.chapter09.anonymous_impl;

public class Window {

	Button button1 = new Button();
	Button button2 = new Button();
	
	// 필드 초기값으로 대입 : 필드값으로 익명 객체 대입 처리
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다!");			
		}
	};
	
	public Window() {
		button1.setOnClickListener(listener); // 매개값으로 필드 대입 처리
		// 매개값으로 익명 객체 대입 처리함
		button2.setOnClickListener(new Button.OnClickListener() {			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다!");				
			}
		});
	}	
}


