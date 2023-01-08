package source08.exam02;

public class ControllableExample {
	public static void main(String[] args) {

		TV tv = new TV();
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		tv.remoteOn();
		tv.remoteOff();
		
		System.out.println("======================");
		
		Computer com = new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();
		
		System.out.println("======================");
		
		Controllable.reset();
	}
}


