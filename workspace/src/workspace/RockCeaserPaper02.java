package workspace;

import java.util.Scanner;

class Rcp{
	String[] randomBox = {"����","����","��"};
	String com = randomBox[(int)(Math.random()*3)];
	String user;
	String check = "Y";
	
	Rcp(String user){this.user= user;}
	
	void getResult(){
		Scanner sc = new Scanner(System.in);
		while(check.equals("Y")) {
			if(user.equals("����")) {
				switch(com){
				
				case ("����"):
					System.out.println("user :"+ user + "com :"+ com + "�����ϴ�.");
					System.out.println("��� Y :: �׸� N");
					check = sc.next();
					if(check.equals("Y"))
						System.out.println("����, ����, �� ����");
						user = sc.next();	
					break;
				case ("����"):
					System.out.println("user :"+ user + "com :"+ com +"�����ϴ�.");
					System.out.println("��� Y :: �׸� N");
					check = sc.next();
					if(check.equals("Y"))
						System.out.println("����, ����, �� ����");
						user = sc.next();	
					break;
				case ("��"):
					System.out.println("user :"+ user + "com :"+ com +"�̰���ϴ�.");
					System.out.println("��� Y :: �׸� N");
					check = sc.next();
					if(check.equals("Y"))
						System.out.println("����, ����, �� ����");
						user = sc.next();	
					break;
				}
			}
			else if(user.equals("����")) {
				switch(com){
				
				case ("����"):
					System.out.println("user :"+ user + "com :"+ com + "�̰���ϴ�.");
					System.out.println("��� Y :: �׸� N");
					check = sc.next();
					if(check.equals("Y"))
						System.out.println("����, ����, �� ����");
						user = sc.next();	
					break;
				case ("����"):
					System.out.println("user :"+ user + "com :"+ com +"�����ϴ�.");
					System.out.println("��� Y :: �׸� N");
					check = sc.next();
					if(check.equals("Y"))
						System.out.println("����, ����, �� ����");
						user = sc.next();	
					break;
				case ("��"):
					System.out.println("user :"+ user + "com :"+ com +"�����ϴ�.");
					System.out.println("��� Y :: �׸� N");
					check = sc.next();
					if(check.equals("Y"))
						System.out.println("����, ����, �� ����");
						user = sc.next();	
					break;
				}
			}else if(user.equals("��")) {
				switch(com){
				
				case ("����"):
					System.out.println("user :"+ user + "com :"+ com + "�����ϴ�.");
					System.out.println("��� Y :: �׸� N");
					check = sc.next();
					if(check.equals("Y"))
						System.out.println("����, ����, �� ����");
						user = sc.next();	
					break;
				case ("����"):
					System.out.println("user :"+ user + "com :"+ com +"�̰���ϴ�.");
					System.out.println("��� Y :: �׸� N");
					check = sc.next();
					if(check.equals("Y"))
						System.out.println("����, ����, �� ����");
						user = sc.next();	
					break;
				case ("��"):
					System.out.println("user :"+ user + "com :"+ com +"�����ϴ�.");
					System.out.println("��� Y :: �׸� N");
					check = sc.next();
					if(check.equals("Y"))
						System.out.println("����, ����, �� ����");
						user = sc.next();	
					break;
				}
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println("����, ����, �� �ٽ��Է�");
				user = sc.next();
			}
		}
		
		
	}
	
}

public class RockCeaserPaper02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����, ����, �� ����");
		String user = sc.next();
		Rcp rcp = new Rcp(user);
		
		rcp.getResult();
		
	
	}

}
