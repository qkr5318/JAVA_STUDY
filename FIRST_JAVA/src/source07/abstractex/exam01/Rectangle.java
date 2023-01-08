package source07.abstractex.exam01;

public class Rectangle extends Shape {

	int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	void draw() {
		System.out.println("사각형을 그립니다!");		
	}

	@Override
	public double findArea() {
		return width*height;
	}	
}
