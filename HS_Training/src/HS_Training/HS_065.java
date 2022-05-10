package HS_Training;

// 65.
/*
 "5. 아래의 출력 결과가 아래와 같이 나오도록 프로그래밍 하시오.
Object obj = new Circle(10);

System.out.println(obj); 

//출력: 넓이는 100 입니다. (예시)"
*/

class Circle05{
	int num;
	
	Circle05(int num){this.num = num;}
	
	public String toString() {
		return "넓이는" + (num*num*3.14) + "입니다.";
	}
	
}

public class HS_065 {
	
	public static void main(String[] args) {
		
		Object obj = new Circle05(10);
		System.out.println(obj);
	}

}
