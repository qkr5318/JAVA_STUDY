package source11.chapter11;

public class MathExample {
	public static void main(String[] args) {

		int v1 = Math.abs(-5);
		System.out.println("v1 = " + v1);
		double v2 = Math.abs(-3.14);
		System.out.println("v2 = " + v2);
		
		double v3 = Math.ceil(5.3);
		System.out.println("v3 = " + v3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v4 = " + v4);
		
		double v5 = Math.floor(5.3);
		System.out.println("v5 = " + v5);
		double v6 = Math.floor(-5.3);
		System.out.println("v6 = " + v6);
		
		int v7 = Math.max(5, 9);
		System.out.println("v7 = " + v7);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v8 = " + v8);
		
		int v9 = Math.min(5, 9);
		System.out.println("v9 = " + v9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v10 = " + v10);
		
		double v11 = Math.random();
		System.out.println("v11 = " + v11);
		System.out.println("random() 메서드 값에 대한 소수 두째자리 반올림 적용 = " + Math.round(v11*100)/100.0);
		
		// double rint(double a) : 가까운 정수의 실수값으로 처리함
		double v12 = Math.rint(5.3);
		System.out.println("v12 = " + v12);
		double v13 = Math.rint(5.7);
		System.out.println("v13 = " + v13);
		
		long v14 = Math.round(5.3);
		System.out.println("v14 = " + v14);
		long v15 = Math.round(5.7);
		System.out.println("v15 = " + v15);
		
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		double v16 = temp2 / 100.0;
		System.out.println("v16 = " + v16); // v16 = 12.35
	}
}







