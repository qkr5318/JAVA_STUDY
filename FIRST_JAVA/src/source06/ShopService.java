package source06;

public class ShopService {

	// 싱글톤 패턴 적용
	private static ShopService singleton = new ShopService();
	
	private ShopService() {
		System.out.println("싱글톤 패턴 적용을 했습니다!");
	}
	
	static ShopService getInstance() {
		return singleton;
	}

	
	
	
}
