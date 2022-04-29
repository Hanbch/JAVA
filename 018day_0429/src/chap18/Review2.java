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
		//47."1. int 배열 5개 선언
		//2. 차례 대로 0 1 2 3 4 입력
		//3. 배열 순서 대로 출력"
		
		int[] num = new int[5];
		
		for(int i=0; i<num.length; i++) {
			num[i]=i;
			System.out.println(num[i]);
		}
			//1. Circle 클래스 만듬
			//2. Circle 배열 3 개 생성 후 
			//3개의 배열안에 임의의 반지름을 초기화 한 후에 객체생성

			//그후에 해당 배열을 이용하여, 
			//배열안에 있는 원객체들의 전체 넓이를 구하시오."
			
			Circle[] cir = new Circle[3];
			
			cir[0] = new Circle(10);
			cir[1] = new Circle(10);
			cir[2] = new Circle(10);
			
			System.out.println(getAllArea(cir));
			
			//1. Rectangle 클래스 만듬
			//2. Rectangle 배열 3 개 생성 후 
			//3개의 배열안에 임의의 가로 세로를 초기화 한 후에 객체생성

			//그후에 해당 배열을 이용하여, 
			//배열안에 있는 사각형 객체들의 전체 넓이를 구하시오."
			
			Rectangle[] rec = new Rectangle[3];
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("첫번쨰 사각형의 가로의길이 입력");
			int width1 = sc.nextInt();
			System.out.println("첫번쨰 사각형의 높이 입력");
			int height1 = sc.nextInt();
			
			System.out.println("두번쨰 사각형의 가로의길이 입력");
			int width2 = sc.nextInt();
			System.out.println("두번쨰 사각형의 높이 입력");
			int height2 = sc.nextInt();
			
			System.out.println("세번쨰 사각형의 가로의길이 입력");
			int width3 = sc.nextInt();
			System.out.println("세번쨰 사각형의 높이 입력");
			int height3 = sc.nextInt();
			
			rec[0] = new Rectangle(width1,height1);
			rec[1] = new Rectangle(width2,height2);
			rec[2] = new Rectangle(width3,height3);
			
			System.out.println(getAllArea02(rec));
			
			//"아래의 선언된 배열 모든 글자수를 구하는 프로그램을 짜시오.   

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
			  
			  //아래를 컴파일 되고 정답이 나오도록 하시오.

              int[] arr = {1,2,3,4,6,9,10};                
              
              int sum = sumOfArr(arr);        
              System.out.println(sum);
              
              int[] arr8 = makeArr(100);
              
              int sum8 = sumOfArr(arr8);
              
              System.out.println("걀과: "+ sum8); //5050 //50
			                 
			          
		
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
