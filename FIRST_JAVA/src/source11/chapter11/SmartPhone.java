package source11.chapter11;

public class SmartPhone {

	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
//		return super.toString();
		return company + ", " + os;
	}
}



