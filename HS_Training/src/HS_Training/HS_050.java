// 50."���� ������ 10�� �Է¹޾� �迭�� �����ϰ�, �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����ϴ� ���α׷��� �ۼ��϶�."

package HS_Training;

class MakeAr{
	private int[] arr = new int[10];
	
	MakeAr(int[] arr) {this.arr = arr;}
	
	public int[] getArr() {
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		return arr;
	}
	
	public void get3x() {
		getArr();
		for(int i=0; i<arr.length; i++) {
			if (arr[i]%3 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
	
}

public class HS_050 {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		MakeAr a1 = new MakeAr(arr);
		
		a1.get3x();
		
		
	}
}