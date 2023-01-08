package source13.collection_review;

// 사용자 정의 클래스인 Member를 만들고, hashCode() 메서드와 equals() 메서드를
// 재정의해서, 객체 인스턴스가 달라도 이름과 나이가 동일하다면
// 동일한 객체로 간죽하여 중복 저장되지 않도록 하는 자바 프로그램을 제작합니다.
public class Member {

	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 위에서 정의한 name필드값과 age필드값이 같으면 true를 리턴 처리함
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(name)&&(member.age==age);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		// name과 age값이 같으면 동일한 hashCode를 리턴 처리함
		return name.hashCode() + age;	
	}
}






