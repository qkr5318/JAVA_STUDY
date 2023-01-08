package source09.chapter09.nested_interface;

public class Button {

	OnClickListener listener; // 인터페이스 타입 필드 선언
	
	void setListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}	
	
	// 중첩 인터페이스 OnClickListener 선언
	static interface OnClickListener {
		void onClick();
	}	
}


