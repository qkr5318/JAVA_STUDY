package source11.chapter11;

public class MemberExample {
	public static void main(String[] args) {

		Member obj1 = new Member("blue");		
		Member obj2 = new Member("blue");		
		// 매개값이 Member 타입이고, id 필드값도 동일하므로 true 처리됨
		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다!");
		} else {
			System.out.println("obj1과 obj2 는 동등하지 않습니다!");
		}
		// 매개값이 Member 타입이지만, id 필드값이 다르므로 false 처리됨
		Member obj3 = new Member("red");
		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다!");
		} else {
			System.out.println("obj1과 obj3은 동등하지 않습니다!");
		}
	}
}

