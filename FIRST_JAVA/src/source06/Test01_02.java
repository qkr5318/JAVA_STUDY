package source06;

class Phone{
	String model;
	int value;
	
	void print() {
		System.out.println(value + "만원 짜리 " + model + " 스마트폰");
	}	
}

public class Test01_02 {
	public static void main(String[] args) {
		
		Phone myPhone = new Phone();
		myPhone.model = "갤럭시 s22";
		myPhone.value = 100;
		myPhone.print();
	
		Phone yourPhone = new Phone();
		yourPhone.model = "아이폰 14";
		yourPhone.value = 200;
		yourPhone.print();		
	}

}
