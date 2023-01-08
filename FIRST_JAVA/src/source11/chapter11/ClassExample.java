package source11.chapter11;

import source08.chapter08.Car;

public class ClassExample {
	public static void main(String[] args) throws Exception {

		// Class 객체 정보 얻기 : 첫번째 방법
		Class clazz = Car.class;
		System.out.println(clazz.getName());
		
		// Class 객체 정보 얻기 : 두번째 방법
		Class clazz1 = Class.forName("source07.chapter07.Car");
		System.out.println(clazz1.getSimpleName());
		
		// Class 객체 정보 얻기 : 세번째 방법
		Car car = new Car();
		Class clazz2 = car.getClass();
		System.out.println(clazz2.getPackage().getName());
	}
}


