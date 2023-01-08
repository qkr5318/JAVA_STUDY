package source06.chapter06.getter_setter;

public class Car {
	// 필드
	private int speed;
	private boolean stop;
	
	// 디폴트 생성자
	
	
	// 메서드
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}	
}
