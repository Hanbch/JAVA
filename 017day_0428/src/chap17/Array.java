package chap17;

public class Array {

	public static void main(String[] args) {
		//���̰� 5�� int�� 1���� �迭�� ����
		int[] arr1 = new int[5];
		
		//���̰� 7�� double�� 1���� �迭�� ����
		double[] arr2 = new double[7];
		
		//�迭�� ���������� �ν��Ͻ� ���� �и� 
		float[] arr3;
		arr3 = new float[9];
		
		//�迭 �ʱ�ȭ
		int arr[] = new int[] {1,2,3}; 
		int ar[] ={1,2,3}; 
		
		//�迭�� �ν��Ͻ� ���� ����
		System.out.println("�迭 arr1 ����: " + arr1.length);
		System.out.println("�迭 arr2 ����: " + arr2.length);
		System.out.println("�迭 arr3 ����: " + arr3.length);
		
		
	}

}
