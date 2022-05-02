//4 x 4의 2차원 배열을 만들고
//이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하여 정수 16개를 배열에
// 저장하고, 2차원 배열을 화면에 출력하라.
//
//8 6 1 1 
//7 3 6 9 
//4 5 3 7 
//9 6 3 1 "
package HS_Training;

class MakeArr02{
	private int[][] arr = new int[4][4];
	
	MakeArr02() {};
	
	public void setArr() {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*10+1);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
public class HS_053 {
	public static void main(String[] args) {
		
		
		MakeArr02 arr = new MakeArr02();
		
		arr.setArr();
		
		
	}
}