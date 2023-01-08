package source11.chapter11;

public class ResourcePathExample {
	public static void main(String[] args) {

		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		System.out.println(photo1Path);
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		System.out.println(photo2Path);
	}
}
