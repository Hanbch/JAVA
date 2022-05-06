

package HS_Training;

import java.util.Scanner;

public class HS_043 {
	public static void main(String[] args) {
		
		int[] arr = makeArr(100);
		
		int sum = sumOfArr(arr);
		
		System.out.println(sum);
	}
	public static int sumOfArr(int[] arr) {
		int sum = 0;
		for(int e:arr)
			sum+=e;
		
		return sum;
	}
	
	public static int[] makeArr(int a) {
		int[] arr = new int[a];
		for(int i=0; i< arr.length; i++) {
			arr[i] = i+1;
		}
		return arr;
	}
}