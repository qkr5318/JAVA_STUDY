package source08.exam02;

interface Portable{
	void inMyBag();
}

public class NotebookPC extends Computer implements Portable {

	@Override
	public void turnOn() {
		System.out.println("노트북 PC를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북 PC를 끈다.");
	}

	@Override
	public void inMyBag() {
		System.out.println("노트북 PC를 가방에 넣는다!");		
	}
	
	public static void main(String[] args) {
		NotebookPC npc = new NotebookPC();
		npc.turnOn();
		npc.turnOff();
		npc.inMyBag();
	}
}


