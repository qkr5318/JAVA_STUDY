package source12.chapter12.review;

class CarThread extends Thread{
	private String who;
	private SharedCar car;
	private String where;
	
	public CarThread(String who, SharedCar car, String where) {
		this.who = who;
		this.car = car;
		this.where = where;
	}

	@Override
	public void run() {
		car.drive(who, where);
	}
}

public class SynchroExample {
	public static void main(String[] args) {

		SharedCar car = new SharedCar();
		new CarThread("장나라", car, "서울").start();
		new CarThread("김희선", car, "부산").start();
		new CarThread("이영애", car, "광주").start();
	}
}


