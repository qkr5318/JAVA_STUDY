package source11.chapter11;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {

		Object obj1 = new Object();
		System.out.println(obj1.hashCode());
		System.out.println(obj1.toString());
		Date obj2 = new Date();
		System.out.println(obj2.hashCode());
		System.out.println(obj2.toString());
	}
}
