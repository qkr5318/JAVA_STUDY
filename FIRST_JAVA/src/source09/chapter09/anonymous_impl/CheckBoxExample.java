package source09.chapter09.anonymous_impl;

// CheckBoxExample 클래스를 실행했을 때, 실행 결과가 출력되도록 익명 구현 객체를 작성해 봅니다.
public class CheckBoxExample {
	public static void main(String[] args) {

		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new CheckBox.OnSelectListener() {
			
			@Override
			public void onSelect() {
				System.out.println("배경을 변경합니다.");				
			}
		});
		
		checkBox.select();
		
	}

}
