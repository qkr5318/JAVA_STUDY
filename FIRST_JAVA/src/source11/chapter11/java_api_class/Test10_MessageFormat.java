package source11.chapter11.java_api_class;

import java.text.MessageFormat;

public class Test10_MessageFormat {
	public static void main(String[] args) {

		String java = "Java";
		int version = 11;
		
		String str = MessageFormat.format("language : {1} \n version : {0}",  version, java);
		System.out.println(str);
		
		System.out.println("====================================");
		Object[] data = {"파란색", "쏘나타"};
		MessageFormat mf = new MessageFormat("Car : {1} \nColor : {0}");
		System.out.println(mf.format(data));
	}
}



