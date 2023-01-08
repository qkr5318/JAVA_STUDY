package source07.chapter07;

public class StudentExample {

	public static void main(String[] args) {

		Student student = new Student("장나라", "828543-2345678", 1);
		System.out.println("name = " + student.name);
		System.out.println("ssn = " + student.ssn);
		System.out.println("studentNo = " + student.studentNo);
	}
}
