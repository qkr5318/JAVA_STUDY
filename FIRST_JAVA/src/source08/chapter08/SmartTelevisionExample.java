package source08.chapter08;

public class SmartTelevisionExample {
	public static void main(String[] args) {

		SmartTelevision stv = new SmartTelevision();
		stv.turnOn();
		stv.setVolume(50);
		stv.setVolume(-10);
		stv.search("kbs.co.kr");
		stv.turnOff();
		
		RemoteControl rc = stv;
		Searchable searchable = stv;
		searchable.search("mbc.co.kr");	
		rc.turnOn();
		rc.turnOff();		
	}
}
