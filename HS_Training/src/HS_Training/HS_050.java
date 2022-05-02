// 50."양의 정수를 10개 입력받아 배열에 저장하고, 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라."

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