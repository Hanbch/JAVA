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
		
		System.out.println("�������� �Է����ּ���.");
		int rad = sc.nextInt();
		String yn = "Y";
		
		Circle01 cir = new Circle01(rad);
		
		for(;;) {
			if(yn.equals("Y") || yn.equals("y")) {
				System.out.println("������: " + rad);
				System.out.println("���̴�: " + cir.getArea());
				System.out.println("�ߴ� N :: ��� Y ");
				yn = sc.next();
			}else if(yn.equals("N") || yn.equals("n")) {
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.�ٽ��Է��ϼ���");
				yn = sc.next();
			}
			
		}
		
		
		
		
	}


}
