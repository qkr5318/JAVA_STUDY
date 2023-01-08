package source06.chapter06;

public class Page257_Car {

	public static void main(String[] args) {

		Page256_Car myCar = new Page256_Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다!");
			myCar.run();
		}
			
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다. gas가 남아있어요!");
		} else {
			System.out.println("gas를 주입해 주시기 바랍니다!");
		}
		
	}

}
