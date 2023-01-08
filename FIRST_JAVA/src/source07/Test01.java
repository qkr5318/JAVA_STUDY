package source07;

class Person {

	private String name;  // 필드 : 이름
	private String sid;   // 필드 : 주민등록번호
	
	public void setInfo(String name, String sid) {
		this.name = name;
		this.sid = sid;
		System.out.println("이름은 " + name + ", 주민등록번호는 " + sid + "★");
	}
	
	public void showInfo() {
		System.out.println("이름 = " + name);
		System.out.println("주민등록번호 = " + sid);
	}	
}

class Student extends Person{
	private String hakbun; // 필드 : 학번
	private int score;     // 필드 : 학점
	
	public Student() {
		System.out.println("Student 디폴트 생성자");
	}

	public Student(String hakbun, int score) {
		this.hakbun = hakbun;
		this.score = score;
	}

	@Override
	public void setInfo(String name, String sid) {		
		super.setInfo(name, sid);
		System.out.println("학번은 " + hakbun + "이며, 학점은 " + score + " 입니다!");
	}
	
	public void setStuInfo(String name, String sid, String hakbun, int score) {
		setInfo(name, sid);
		this.hakbun = hakbun;
		this.score = score;
		System.out.println("이름은 " + name + "이고, 주민등록번호는 " + sid + "이며, " + "학번은 " + hakbun + "이고, " + "학점은 " + score + "점수 입니다!");
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("학번 = " + hakbun);
		System.out.println("학점 = " + score);
	}
}

public class Test01{
	public static void main(String[] args) {
		
		Student stu1 = new Student();
		stu1.setInfo("장나라", "828288-2345678");
		stu1.setStuInfo("김희선", "828255-2345671", "221110", 90);
		
		Singer sing1 = new Singer();
		sing1.setInfo("아이유", "93123450-2222334");
		
		Singer sing2 = new Singer("기도", "큐브");
		sing2.setInfo("비투비", "9411111-1345676");
		
		Actor act1 = new Actor();
		act1.setInfo("김보성", "921123-1876542");
		
		Actor act2 = new Actor("의리다~!");
		act2.setInfo("김보성", "921123-1876542");
	}
}











