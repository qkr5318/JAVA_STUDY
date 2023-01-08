package source07.chapter07;

public class SupersonicAirplane extends Airplane {

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행을 합니다!");
		} else {
			super.fly(); // 부모/상위 객체의 fly() 메서드 호출 실행			
		}		
	}	
}
