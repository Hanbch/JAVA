package summary;
// 04/15 요약정리
public class sum_0415 {

	public static void main(String[] args) {
		
		//*****
		//*****
		//*****
		//*****
		//*****
		for(int i=0; i<5; i++) {
			for(int j=0; j<=5; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
		
		System.out.print('\n');
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
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
		System.out.print('\n');
		
		//    *
		//   ***
		//  *****
		// *******
		//*********
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(i*2)+1; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
		System.out.print('\n');
		
	}

}
