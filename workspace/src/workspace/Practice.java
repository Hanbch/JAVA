package workspace;

import java.io.*;

import java.util.*;



public class Practice{
	
	public static void main(String[] args) throws IOException{
		int i;
		int group = (int)(Math.random()*5+1);
		System.out.print(group + "Á¶ ");
		for( i=0; i<6; i++) {
			int num = (int)(Math.random()*9);
			System.out.print(num + " ");
		}
		
	}
}