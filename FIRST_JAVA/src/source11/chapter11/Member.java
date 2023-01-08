package source11.chapter11;

public class Member {

	public String id;

	public Member(String id) {
		this.id = id;
	}
	
	// id가 동일한 문자열인 경우, 같은 해시 코드를 리턴 처리함
	@Override
	public int hashCode() {		
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // 매개값이 Member 타입인지 체크 확인
			// Member 타입으로 강제 타입 변환 처리하고,
			// id 필드 값이 동일한지 검사한 후에,
			// 동일하다면 true를 리턴 처리함.
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		// 매개값이 Member 타입이 아니거나 id 필드값이 다른 경우 false를 리턴 처리함.
		return false;
	}
}



