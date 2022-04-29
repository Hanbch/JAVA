package workspace;

import java.lang.Math;

public class Lotto {

	public static void main(String[] args) {
		//Math.(int)Random*10
		
		int[] num = new int[6];
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*45+1);
			
				for(int j =0; j<i; j++) {
					if(num[i] == num[j]) {
						//System.out.println(num[j]+"=" +num[i]);
						i--;
						break;
					}
				}
			
		}
		System.out.print(num[0] +" ");
		System.out.print(num[1]+" ");
		System.out.print(num[2]+" ");
		System.out.print(num[3]+" ");
		System.out.print(num[4]+" ");
		System.out.print(num[5]+" ");
		System.out.println();
	}

}
