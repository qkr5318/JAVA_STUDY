package source08.chapter08;

public interface RemoteControl {

	// 상수 : public static final을 생략하더라도 컴파일 과정에서 자동으로 붙게 됩니다!
	public int MAX_VOLUME = 20;
	public int MIN_VOLUME = 0;
	
	// 추상 메서드 : public abstract를 생략하더라도 컴파일 과정에서 자동으로 붙게 됩니다.
	public void turnOn(); // 추상 메서드 turnOn() 선언 : 메서드 선언부만 작성
	public void turnOff(); // 추상 메서드 turnOff() 선언 : 메서드 선언부만 작성
	public void setVolume(int volume); // 추상 메서드 setVolume(int volume) 선언	
}
