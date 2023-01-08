package source06;

public class Test03 {
	public static void main(String[] args) {

		Circle myCircle = new Circle();
		myCircle.radius = 15.0;
		
		System.out.println(myCircle);
		System.out.println(myCircle.radius);
		System.out.println(myCircle.findArea());
		myCircle.show(myCircle.radius, myCircle.findArea());		
	}
}

class Circle{
	double radius;
	double findArea() {
		return 3.14*radius*radius;
	}
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}
}
