package source14;

import java.io.File;

// 파일 삭제 자바 프로그램을 제작해 봅니다. 
public class Test08_FileDelete {
	public static void main(String[] args) {

		// 만약 args.length 길이가 1이 !=(아닌 경우) : args(인수값)이 있을 경우
		if(args.length != 1) {
			System.out.println("파일 또는 (파일 없는) 디렉토리 삭제 프로그램 사용");
		}
		
		// delete를 호출하고 발생하는 모든 메시지를 출력 처리함
		try {
			delete(args[0]);
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		}
	}

	// 삭제를 처리하는 static 정적 메서드 delete() 메서드 제작 : 지정한 파일이나 디렉토리를 삭제하기 전에
	// 삭제가 가능한지를 먼저 확인함. 문제가 발생하면 상황에 따른 에러 메시지를 발생 시켜줌.
	public static void delete(String filename) throws IllegalAccessException {
		// 파일 이름을 나타내기 위해, File 객체를 생성함 
		File f = new File(filename);
		
		// 파일이나 디렉토리가 존재하는지와 쓰기 방지가 되어 있는지를 확인함.
		// 파일이 존재하지 않을 경우
		if(!f.exists()) {
			fail("Delete : no such file or directory : " + filename);
		}
		
		// 파일에 쓰기(write)를 하지 못하는 경우
		if(!f.canWrite()) {
			fail("Delete : write protected : " + filename);
		}
		
		// 디렉토리이면, 비어 있는지 확인하게 함
		if(f.isDirectory()) {
			String [] files = f.list();
			if(files.length > 0) {
				fail("Delete : directory not empty : " + filename);
			}
		}
		// 위에 모든 검사를 통화했다면 파일을 삭제 처리함
		boolean success = f.delete();
		if(!success) {
			fail("Delete : deletion failed!");
		}
		System.out.println("파일 삭제가 성공적으로 이루어졌습니다!");
	}

	public static void fail(String msg) throws IllegalAccessException {
		// IllegalAccessException : 부적절 인수(args)를 메서드에 처리할 경우 예처 처리함
		throw new IllegalAccessException(msg);
	}
}





