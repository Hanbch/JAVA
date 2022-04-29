package chap18;

public class DoubleArray {

	public static void main(String[] args) {
		// 이차원배열
		int[][] arr =  new int [3][4];
		int num = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ "\t");
					
			}	
			System.out.println();
		}
		
	}

}
