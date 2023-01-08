package source08.chapter08;

public class RemoteControlExample {
	public static void main(String[] args) {

		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(30);
		rc.turnOff();
	
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(40);
		rc.turnOff();
	}
}


