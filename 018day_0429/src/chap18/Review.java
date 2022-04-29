package chap18;

import java.util.Scanner;

class Circle01{
	private int rad; 
	
	Circle01(int rad){this.rad = rad;}
	
	double getArea(){
		return rad*rad*Math.PI;
	}
}

public class Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름을 입력해주세요.");
		int rad = sc.nextInt();
		String yn = "Y";
		
		Circle01 cir = new Circle01(rad);
		
		for(;;) {
			if(yn.equals("Y") || yn.equals("y")) {
				System.out.println("반지름: " + rad);
				System.out.println("넓이는: " + cir.getArea());
				System.out.println("중단 N :: 계속 Y ");
				yn = sc.next();
			}else if(yn.equals("N") || yn.equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}else {
				System.out.println("잘못입력하셨습니다.다시입력하세요");
				yn = sc.next();
			}
			
		}
		
		
		
		
	}


}
