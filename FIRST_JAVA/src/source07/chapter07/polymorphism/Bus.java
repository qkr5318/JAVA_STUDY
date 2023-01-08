package source07.chapter07.polymorphism;

public class Bus extends Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다!");
	}
	
	
	public void speedUp() {
		System.out.println("버스가 속력을 올립니다!");
	}
}
