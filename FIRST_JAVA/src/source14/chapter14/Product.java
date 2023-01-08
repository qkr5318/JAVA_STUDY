package source14.chapter14;

// Scanner 클래스 활용 상품의 내용을 키보드로 입력 받아서,
// Product 객체를 생성하고 List 컬렉션에서 관리하는 자바 프로그램을 제작해 봅니다.
public class Product {

	private int pno;
	private String name;
	private int price;
	private int stock;
	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}

