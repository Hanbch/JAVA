package chap09;

public class Review {

	public static void main(String[] args) {
		// "아래의 별을 찍으시오.
		//*
		//**
		//***
		//****
		//*****
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
		
		System.out.print('\n');
		//*****
		//****
		//***
		//**
		//*
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
		
		System.out.print('\n');
		
		//    *
		//   **
		//  ***
		// ****
		//*****
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
		
		System.out.println('\n');
		
		//  - 1과 1000 사이의 숫자중 3의 배수 이자 5의 배수인 첫번재 수는?
		//	-  없다면 없다고 출력 할것."
		 boolean search = false;
		 int rst = 0;
		 
		 for(int i=1; i<1000; i++ ) {
			 if((i%3) == 0 && (i%5) == 0 ){
				 search = true;
				 rst =i;
				 break;
			 }
		 }
		 
		 if(search)
			 System.out.println("3의배수이자 5의 배수의 첫번째 수는" + rst + "입니다.");
		 else
			 System.out.println("없다.");
		 
		 System.out.println('\n');
		 //
		 
		 
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
	}

}
