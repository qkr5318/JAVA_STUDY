package debugex;
//배열 이용 정렬(Sort) 확인
public class DebugEx03_Sort{
	public static void main(String[] args) {
		int a[] = { 40, 30, 50, 10, 20 }; 
		System.out.println("<<정렬전>>"); // (1) BreakPoint 찍어봄 : Step Over(F6) 실행해 봄
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " "); }
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {  
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("\n<<정렬후>>");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
