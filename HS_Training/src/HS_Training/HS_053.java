//4 x 4�� 2���� �迭�� �����
//�̰��� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� ���� 16���� �迭��
// �����ϰ�, 2���� �迭�� ȭ�鿡 ����϶�.
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