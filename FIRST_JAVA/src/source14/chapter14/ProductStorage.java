package source14.chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Scanner로 입력된 문자열 얻는 ProductStorage 클래스 소스 코딩
public class ProductStorage {

	private List<Product> list = new ArrayList<Product>(); // List 컬렉션 자료구조 생성
	private Scanner scan = new Scanner(System.in); // 키보드 입력 Scanner 생성
	private int counter;
	
	public void showMenu() {
		while (true) {
			System.out.println("====================================");
			System.out.println("1. 등록 | 2. 목록 | 3. 종료");
			System.out.println("====================================");
			
			System.out.print("선택 : ");
			String selectNo = scan.nextLine(); // 번호 읽어들이기
			switch (selectNo) {
			case "1": registerProduct();				
				break;
			case "2": showProducts();				
				break;
			case "3":
				System.out.println("프로그램이 종료 되었습니다!");
				return; // 3번 입력하면 프로그램 종료 처리함
			}
		}
	}

	public void showProducts() {
		// List 컬렉션에 저장 처리된 모든 Product 객체 정보를 모니터에 출력 처러합니다.
		for (Product product : list) {
			System.out.println(product.getPno() + "\t" + product.getName() + "\t" + product.getPrice() + "\t" + product.getStock());
		}
	}

	public void registerProduct() {

		try {
			Product product = new Product();
			// Product() 생성자가 생성되면 counter 필드값을 1씩 증가 시켜주면서 pno 설정 처리
			product.setPno(++counter); 
			
			System.out.print("상품명 : ");
			product.setName(scan.nextLine()); // 상품명을 읽고 설정 처리함
			
			System.out.print("가격 : ");
			product.setPrice(Integer.parseInt(scan.nextLine())); // 가격을 읽고 설정 처리함
			
			System.out.print("재고 : ");
			product.setStock(Integer.parseInt(scan.nextLine())); // 재고를 읽고 설정 처리함
			
			list.add(product); // List 컬렉션에 Product 생성 객체를 추가(저장) 처리함

		} catch (Exception e) {
			System.out.println("등록 에러 : " + e.getMessage());
		}
	}

	


}


