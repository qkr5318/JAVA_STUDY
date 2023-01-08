package source08.exam02;

public class TV implements Controllable, RemoteControllable {

	@Override
	public void repair() {
		System.out.println("TV를 수리합니다!");
	}

	@Override
	public void remoteOn() {
		System.out.println("TV를 멀리서 Remote로 켠다.");		
	}

	@Override
	public void remoteOff() {
		System.out.println("TV를 멀리서 Remote로 끈다.");		
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켠다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끈다.");		
	}
}


