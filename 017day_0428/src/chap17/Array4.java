package chap17;

public class Array4 {
	
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7};
		int sum = sumOfArry(ar);
		
		System.out.println(sum);
		
		int[] arr = makeArr(100);
		arr = makeArr(10);
		
		int sum2 = sumOfArry(arr);
		
		System.out.println(sum2);
		
	}
	
	//파라미터값을 길이로하는 배열생성 후 배열 리턴
 	static int[] makeArr(int num) {
		
		int[] arr = new int[num];
		
		for(int i=0; i < num; i++ ) {
			arr[i] = i+1; 
		}
		return arr;
	}
	
 	//파라미터로 배열은 받고 배열의 인자들을 합산
	static int sumOfArry(int[] ar){
		
		int count = 0;
		
		for(int i=0; i<ar.length; i++) {
			count += ar[i];
		}
		return count;
	
	}

}
