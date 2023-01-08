package source07;

import java.util.Scanner;

class Person4{
	String name;
	String id;
	
	public Person4(String name, String id) {
		this.name = name;
		this.id = id;
	}
}

class Student4 extends Person4{

	String grade;
	String department;
	
	public Student4(String name, String id) {
		super(name, id);
	}
}
public class Test08 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("학생의 이름을 입력해 주세요 ==> ");
		String sname = scan.nextLine();
		System.out.print("학생의 아이디를 입력해 주세요 ==> ");
		String sid = scan.nextLine();
		
		String tname = "김희선";
		String tid = "khs";
		
		Person4 p4;
		Student4 s4 = new Student4(tname, tid);
		p4 = s4;  // 업캐스팅
		System.out.println(p4.name);
		
		s4.grade = "A";
		System.out.println(s4.grade);
		s4.department = "영업부";
		System.out.println(s4.department);
		
		Person4 person4 = new Student4(sname, sid); // 업캐스팅(묵시적 형변환, 자동 형변환)
		Student4 student4;
		
		student4 = (Student4)person4;  // 다운 캐스팅(명시적 형변환, 강제 형변환)
//		System.out.println(student4 instanceof Student4);
		
		if (student4 instanceof Student4) {
			System.out.println("형변환이 잘 되었습니다!");
		} else {
			System.out.println("형변환이 이루어지지 않았습니다!");
		}
		
		System.out.println("학생의 이름은 " + student4.name + ", 아이디는 " + student4.id + "입니다!");
		
	}
}



