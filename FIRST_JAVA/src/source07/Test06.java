package source07;

import java.util.Scanner;

class Box{
	private String name;
	public Box() {
		System.out.println("Box() 디폴트 생성자 호출~ ★");
	}
	
	public void setInfo(String name) {
		this.name = name;
		System.out.println(name);
	}
	
	public void showInfo() {
		System.out.println("박스 이름 = " + name);
	}
}

class ColoredBox extends Box{
	private String color;
	public ColoredBox() {
		System.out.println("ColoredBox() 디폴트 생성자 호출~ @");
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("칼라 박스의 색상 = " + color);
	}
	
	public void setColorInfo(String name, String color) {
		super.setInfo(name);
		this.color = color;
	}
}

public class Test06 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("칼라박스 이름을 입력해 주시기 바랍니다 ==> ");
		String colorBoxName = scan.nextLine();
		System.out.print("칼라박스 색상을 입력해 주시기 바랍니다 ==> ");
		String colorBoxColor = scan.nextLine();
		
		ColoredBox colorBox = new ColoredBox();
		
		colorBox.setColorInfo(colorBoxName, colorBoxColor);
		colorBox.showInfo();
		
		scan.close();
	}
}




