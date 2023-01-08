package source08.chapter08;

// 구현 클래스 Audio 소스 코딩
public class Audio implements RemoteControl {

	// 필드
	private int volume;
	

	// turnOn() 추상 메서드의 실체 메서드
	@Override
	public void turnOn(){
		System.out.println("Audio를 켭니다!");		
	}

	// turnOff() 추상 메서드의 실체 메서드
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다!");		
	}
	
	// setVolume() 추상 메서드의 실체 메서드
	// : RemoteControl 인터페이스의 상수를 이용해서 volume 필드의 값을 제한 처리함
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);		
	}
}




