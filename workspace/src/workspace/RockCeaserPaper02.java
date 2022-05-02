package workspace;

import java.util.Scanner;

class Rcp{
	String[] randomBox = {"가위","바위","보"};
	String com = randomBox[(int)(Math.random()*3)];
	String user;
	String check = "Y";
	
	Rcp(String user){this.user= user;}
	
	void getResult(){
		Scanner sc = new Scanner(System.in);
		while(check.equals("Y")) {
			if(user.equals("가위")) {
				switch(com){
				
				case ("가위"):
					System.out.println("user :"+ user + "com :"+ com + "비겼습니다.");
					System.out.println("계속 Y :: 그만 N");
					check = sc.next();
					if(check.equals("Y"))
						System.out.println("가위, 바위, 보 선택");
						user = sc.next();	
					break;
				case ("바위"):
					System.out.println("user :"+ user + "com :"+ com +"졌습니다.");
					System.out.println("계속 Y :: 그만 N");
					check = sc.next();
					if(check.equals("Y"))
						System.out.println("가위, 바위, 보 선택");
						user = sc.next();	
					break;
				case ("보"):
					System.out.println("user :"+ user + "com :"+ com +"이겼습니다.");
					System.out.println("계속 Y :: 그만 N");
					check = sc.next();
					if(check.equals("Y"))
						System.out.println("가위, 바위, 보 선택");
						user = sc.next();	
					break;
				}
			}
			else if(user.equals("바위")) {
				switch(com){
				
				case ("가위"):
					System.out.println("user :"+ user + "com :"+ com + "이겼습니다.");
					System.out.println("계속 Y :: 그만 N");
					check = sc.next();
					if(check.equals("Y"))
						System.out.println("가위, 바위, 보 선택");
						user = sc.next();	
					break;
				case ("바위"):
					System.out.println("user :"+ user + "com :"+ com +"비겼습니다.");
					System.out.println("계속 Y :: 그만 N");
					check = sc.next();
					if(check.equals("Y"))
						System.out.println("가위, 바위, 보 선택");
						user = sc.next();	
					break;
				case ("보"):
					System.out.println("user :"+ user + "com :"+ com +"졌습니다.");
					System.out.println("계속 Y :: 그만 N");
					check = sc.next();
					if(check.equals("Y"))
						System.out.println("가위, 바위, 보 선택");
						user = sc.next();	
					break;
				}
			}else if(user.equals("보")) {
				switch(com){
				
				case ("가위"):
					System.out.println("user :"+ user + "com :"+ com + "졌습니다.");
					System.out.println("계속 Y :: 그만 N");
					check = sc.next();
					if(check.equals("Y"))
						System.out.println("가위, 바위, 보 선택");
						user = sc.next();	
					break;
				case ("바위"):
					System.out.println("user :"+ user + "com :"+ com +"이겼습니다.");
					System.out.println("계속 Y :: 그만 N");
					check = sc.next();
					if(check.equals("Y"))
						System.out.println("가위, 바위, 보 선택");
						user = sc.next();	
					break;
				case ("보"):
					System.out.println("user :"+ user + "com :"+ com +"비겼습니다.");
					System.out.println("계속 Y :: 그만 N");
					check = sc.next();
					if(check.equals("Y"))
						System.out.println("가위, 바위, 보 선택");
						user = sc.next();	
					break;
				}
			}else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("가위, 바위, 보 다시입력");
				user = sc.next();
			}
		}
		
		
	}
	
}

public class RockCeaserPaper02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위, 바위, 보 선택");
		String user = sc.next();
		Rcp rcp = new Rcp(user);
		
		rcp.getResult();
		
	
	}

}
