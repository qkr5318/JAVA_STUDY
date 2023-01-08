package source11.review;

public class Member {

	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {		
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;
			if(id.equals(member.id)) {
				return true;
			}
		}		
		return false;
	}
}



