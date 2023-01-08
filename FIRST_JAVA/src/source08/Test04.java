package source08;

interface Movable{
	void move(int x);
}

class Car implements Movable{
	
	private int pos = 0;

	@Override
	public void move(int x) {
		pos += x;  // pos = pos + x;
		System.out.println(pos);
	}
	
	public void show() {
		System.out.println(pos + "m 이동했습니다!");
	}
}

public class Test04 {
	public static void main(String[] args) {

		Movable mova = new Car();
		mova.move(5);  // 5	
		
		Car car = (Car)mova;
		car.move(10);  // 15
		car.show();
	}
}

