package source09.chapter09.nested_interface;

public class ButtonExample {
	public static void main(String[] args) {

		Button btn = new Button();
		
		btn.setListener(new CallListener());
		btn.touch();
		
		btn.setListener(new MessageListener());;
		btn.touch();
	}
}


