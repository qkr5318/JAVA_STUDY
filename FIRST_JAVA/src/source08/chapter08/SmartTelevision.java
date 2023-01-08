package source08.chapter08;

public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;
	
	
	@Override
	public void search(String url) {
		// Searchable 인터페이스의 추상 메서드 search(String url)에 대한 실체 메서드 기능 구현
		System.out.println(url + "을 검색합니다!");		
	}

	@Override
	public void turnOn() {
		// RemoteControl 인터페이스의 추상 메서드 turnOn()에 대한 실체 메서드 기능 구현
		System.out.println("스마트 TV를 켭니다!");		
	}

	@Override
	public void turnOff() {
		// RemoteControl 인터페이스의 추상 메서드 turnOff()에 대한 실체 메서드 기능 구현
		System.out.println("스마트 TV를 끕니다!");		
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 스마트 TV 볼륨 : " + this.volume);		
	}
}




