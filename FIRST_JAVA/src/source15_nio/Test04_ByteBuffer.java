package source15_nio;

import java.nio.ByteBuffer;

public class Test04_ByteBuffer {
	public static void main(String[] args) {

		System.out.println("[7바이트 크기로 버퍼 생성]");
		ByteBuffer buffer = ByteBuffer.allocate(7);
		printState(buffer); // 사용자 정의 pringState() 메서드 활용
		
		buffer.put((byte)10);
		buffer.put((byte)11);
		System.out.println("[2바이트 저장 후]");
		printState(buffer);
		
		buffer.put((byte)12);
		buffer.put((byte)13);
		buffer.put((byte)14);
		System.out.println("[3바이트 저장 후]");
		printState(buffer);
		
		buffer.mark(); // 현재 position의 위치를 기억시키기 위해 mark() 메서드 호출
		System.out.println("==============[현재 위치를 마크해 놓음]");
		
		buffer.clear(); // 버퍼 위치 속성을 초기화하기 위해 clear() 메서드 호출
		System.out.println("[clear() 실행 후]");
		printState(buffer);
	}

	public static void printState(ByteBuffer buffer) {
		System.out.print("\t position : " + buffer.position() + ", ");
		System.out.println("\t limit : " + buffer.limit() + ", ");
		System.out.println("\t capacity : " + buffer.capacity());
	}
}
