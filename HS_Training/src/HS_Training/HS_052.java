
// 52. "������ 10�� �����ϴ� �迭�� ����� 1���� 10���� ������ ������ �����ϰ� 
//�����Ͽ� �迭�� �����϶�. �׸��� �迭�� �� ���ڵ�� ����� ����϶�."
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