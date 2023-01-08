package source07.chapter07;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		// DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "황금색", 10);
		
		// CellPhone 클래스로부터 상속 받은 필드
		System.out.println("모델 = " + dmbCellPhone.model);
		System.out.println("색상 = " + dmbCellPhone.color);
		
		// DmbCellPhone 클래스의 필드
		System.out.println("채널 = " + dmbCellPhone.channel);
		
		// CellPhone 클래스로부터 상속 받은 메서드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요~ ^^/");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 장나라인데요~ ㅠ.ㅠ");
		dmbCellPhone.sendVoice("반갑습니다!");
		dmbCellPhone.hangUp();
		
		// DmbCellPhone 클래스의 메서드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();		
	}
}
