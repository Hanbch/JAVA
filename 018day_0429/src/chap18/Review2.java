package chap18;

import java.util.Scanner;

class Circle{
	private int rad; 
	
	Circle(int rad){this.rad = rad;}
	
	double getArea(){
		return rad*rad*Math.PI;
	}
}

class Rectangle{
	int width, height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	int getArea(){
		return width*height;
	}
}

public class Review2 {
	static double getAllArea(Circle[] cir) {
		double sum = 0;
		for(int i=0; i<cir.length; i++) {
			sum += cir[i].getArea();
		}
		return sum;
	}
	
	static double getAllArea02(Rectangle[] rec) {
		double sum = 0;
		for(int i=0; i<rec.length; i++) {
			sum += rec[i].getArea();
		}
		return sum;
	}

	public static void main(String[] args) {
		//47."1. int �迭 5�� ����
		//2. ���� ��� 0 1 2 3 4 �Է�
		//3. �迭 ���� ��� ���"
		
		int[] num = new int[5];
		
		for(int i=0; i<num.length; i++) {
			num[i]=i;
			System.out.println(num[i]);
		}
			//1. Circle Ŭ���� ����
			//2. Circle �迭 3 �� ���� �� 
			//3���� �迭�ȿ� ������ �������� �ʱ�ȭ �� �Ŀ� ��ü����

			//���Ŀ� �ش� �迭�� �̿��Ͽ�, 
			//�迭�ȿ� �ִ� ����ü���� ��ü ���̸� ���Ͻÿ�."
			
			Circle[] cir = new Circle[3];
			
			cir[0] = new Circle(10);
			cir[1] = new Circle(10);
			cir[2] = new Circle(10);
			
			System.out.println(getAllArea(cir));
			
			//1. Rectangle Ŭ���� ����
			//2. Rectangle �迭 3 �� ���� �� 
			//3���� �迭�ȿ� ������ ���� ���θ� �ʱ�ȭ �� �Ŀ� ��ü����

			//���Ŀ� �ش� �迭�� �̿��Ͽ�, 
			//�迭�ȿ� �ִ� �簢�� ��ü���� ��ü ���̸� ���Ͻÿ�."
			
			Rectangle[] rec = new Rectangle[3];
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("ù���� �簢���� �����Ǳ��� �Է�");
			int width1 = sc.nextInt();
			System.out.println("ù���� �簢���� ���� �Է�");
			int height1 = sc.nextInt();
			
			System.out.println("�ι��� �簢���� �����Ǳ��� �Է�");
			int width2 = sc.nextInt();
			System.out.println("�ι��� �簢���� ���� �Է�");
			int height2 = sc.nextInt();
			
			System.out.println("������ �簢���� �����Ǳ��� �Է�");
			int width3 = sc.nextInt();
			System.out.println("������ �簢���� ���� �Է�");
			int height3 = sc.nextInt();
			
			rec[0] = new Rectangle(width1,height1);
			rec[1] = new Rectangle(width2,height2);
			rec[2] = new Rectangle(width3,height3);
			
			System.out.println(getAllArea02(rec));
			
			//"�Ʒ��� ����� �迭 ��� ���ڼ��� ���ϴ� ���α׷��� ¥�ÿ�.   

			String[] sr = new String[7];
			   sr[0] = new String("Java");
			   sr[1] = new String("System");
			   sr[2] = new String("Compiler");
			   sr[3] = new String("Park");
			   sr[4] = new String("Tree");
			   sr[5] = new String("Dinner");
			   sr[6] = new String("Brunch Cafe");
			   
			  int sum2 =0;
			  for(int i=0; i<sr.length; i++) {
				  sum2 += sr[i].length();
			  }
			  System.out.println(sum2);
			  
			  //�Ʒ��� ������ �ǰ� ������ �������� �Ͻÿ�.

              int[] arr = {1,2,3,4,6,9,10};                
              
              int sum = sumOfArr(arr);        
              System.out.println(sum);
              
              int[] arr8 = makeArr(100);
              
              int sum8 = sumOfArr(arr8);
              
              System.out.println("����: "+ sum8); //5050 //50
			                 
			          
		
	}
	static int sumOfArr(int[] arr) {
		int sum03 = 0;
		for(int i=0; i<arr.length; i++) {
			 sum03 += arr[i];
		}
		return sum03;
	}
	
	static int[] makeArr(int num) {
		int[] ar = new int[num];
		for(int i =0; i<num; i++) {
			ar[i] = i+1;
		}
		return ar;
	}


}
