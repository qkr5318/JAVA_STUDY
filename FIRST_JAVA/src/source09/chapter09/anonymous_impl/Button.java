package source09.chapter09.anonymous_impl;

// 윈도우 및 안드로이드 등의 UI 프로그램에서 버튼의 클릭 이벤트를 처리하기 위해
// 익명 구현 객체를 이용하는 방법을 활용해 봅니다.
// UI Button 클래스 생성
public class Button {

	OnClickListener listener; // 인터페이스 타입 필드
	
	// 매개 변수의 다형성 활용
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	// 구현 객체의 onClick() 메서드 호출
	void touch() {
		listener.onClick();
	}

	// 중첩 인터페이스
	static interface OnClickListener {
		void onClick();
	}
}





