package source07.chapter07;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
		System.out.println("=========================");
		Airplane ap = new Airplane();
		ap.takeOff();
		ap.fly();
		ap.land();
	}
}
