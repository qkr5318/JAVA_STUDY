package source13.chapter13;

// 사용자 정의 클래스인 Member 클래스를 만들고 hashCode()와 equals() 메서드를
// 재정의합니다. 이것은 인스턴스가 달라도 이름과 나이가 동일하다면 동일한 객체로 간주하여
// 중복 저장되지 않도록 하기 위해서입니다.
// hashCode() 메서드와 equals() 메서드 재정의 Member 클래스 작성
public class Member {
	
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// name과 age값이 같으면 true를 리턴 처리함
	@Override
	public boolean equals(Object obj) {  
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(name)&&(member.age==age);			
		} else {
			return false;
		}
	}
	// name과 age값이 같으면 동일한 hashCode를 리턴 처리함
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}


