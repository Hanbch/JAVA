package chap06;

public class Review {

	public static void main(String[] args) {
		// "�Ʒ��� ���� �����ÿ�.
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
		
		//  - 1�� 1000 ������ ������ 3�� ��� ���� 5�� ����� ù���� ����?
		//	-  ���ٸ� ���ٰ� ��� �Ұ�."
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
			 System.out.println("3�ǹ������ 5�� ����� ù��° ����" + rst + "�Դϴ�.");
		 else
			 System.out.println("����.");
		 
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