package source13.chapter13;

// 사용자 정의 객체인 Student를 키(Key)로 하고, 점수를 값(Value)으로 저장하는
// HashMap 사용 Student 클래스를 작성해 봅니다.
// 학번(sno)과 이름(name)이 동일한 Student를 동등 키(Key)로 간죽하기 위해
// Student 클래스에는 hashCode() 메서드와 equals() 메서드를 재정의해서 활용합니다.
public class Student {

	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	// 학번(sno)과 name(이름)이 같다면 true값을 리턴 처리함
	@Override
	public boolean equals(Object obj) { 
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno==student.sno)&&(name.equals(student.name));
		} else {
			return false;
		}
	}

	// 학번(sno)과 이름(name)이 같다면 동일한 값을 리턴 처리함
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
}





