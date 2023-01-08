package source17_stream_api.exam06;

public class Student implements Comparable<Student> {
	
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score); // 클래스 객체 : 점수 비교 정렬 처리
	}
}


