package source20_network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

// InetAddress 클래스 활용 : 이클립스 실행 확인
public class InetAddress_Eclipse {
	public static void main(String[] args) {
		
		InetAddress addr1 = null, addr2 = null;
		System.out.println("호스트 이름을 입력해 주시기 바랍니다 = ");
		Scanner in = new Scanner(System.in);
		String url = in.nextLine();
		
		try {
			addr1 = InetAddress.getByName(url);
			addr2 = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.print(url + "의 IP 주소 = ");
		System.out.println(addr1.getHostAddress());
		System.out.print("로컬 IP 주소 = ");
		System.out.println(addr2.getHostAddress());
		
		in.close(); // in 스트림 닫기
	}
}
