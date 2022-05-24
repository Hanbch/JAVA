package chap34;

import java.net.InetAddress;
import java.util.Scanner;
import java.net.InetAddress;

class InetAdressEx{
	Scanner scanner;
	
	public InetAdressEx() {
		System.out.println("Host 이름을 입력하세요.");
		
		scanner = new Scanner(System.in);
		try{
			InetAddress inetAddress = InetAddress.getByName(scanner.next());
			
			System.out.println("Computer Name: " + inetAddress.getHostName());
			System.out.println("Computer Name: " + inetAddress.getHostAddress());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

public class InetAdress {

	public static void main(String[] args) {
		new  InetAdressEx();

	}

}
