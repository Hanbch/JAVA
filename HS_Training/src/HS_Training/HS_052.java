
// 52. "정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 
//생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라."
package HS_Training;

class MakeArr{
	int[] arrNum = new int[10];
	
	MakeArr() {}
	
	double getArrNum() {
		int sum = 0;
		for(int i=0; i<arrNum.length; i++) {
			arrNum[i] = (int)(Math.random()*10)+1;
		
			sum += arrNum[i];
		}
		
		return sum/ (double)arrNum.length;
	}
	

	
}

public class HS_052 {
	public static void main(String[] args) {
		
		MakeArr arr1 = new MakeArr();
		System.out.println(arr1.getArrNum());
		
		
		
		
		
		
		
		
		
		
	}
}