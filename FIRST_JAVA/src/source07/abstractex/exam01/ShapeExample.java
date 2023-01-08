package source07.abstractex.exam01;

public class ShapeExample {
	public static void main(String[] args) {

		// 추상 클래스 Shape는 직접 인스턴스 생성을 하지 못합니다!
//		Shape shape = new Shape();
		
		Circle circle = new Circle(3);
		circle.draw();
		System.out.printf("원의 넓이는 %.2f\n", circle.findArea());

		System.out.println("=========================");
		
		Rectangle rectangle = new Rectangle(3, 4);
		rectangle.draw();
		System.out.printf("직사각형의 넓이는 %.1f\n", rectangle.findArea());
	}
}


