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
	
	//�Ķ���Ͱ��� ���̷��ϴ� �迭���� �� �迭 ����
 	static int[] makeArr(int num) {
		
		int[] arr = new int[num];
		
		for(int i=0; i < num; i++ ) {
			arr[i] = i+1; 
		}
		return arr;
	}
	
 	//�Ķ���ͷ� �迭�� �ް� �迭�� ���ڵ��� �ջ�
	static int sumOfArry(int[] ar){
		
		int count = 0;
		
		for(int i=0; i<ar.length; i++) {
			count += ar[i];
		}
		return count;
	
	}

}
