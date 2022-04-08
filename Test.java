import java.util.Scanner;
import java.util.Arrays;
public class Test{
	public String capitalMethod(String str){
		String ret = str.toUpperCase() ;
		return ret;
	}
	public static void main(String[] args){
		
		//int []arr={1,2,3,4,5,6};
		//int []arr2={3,3,3};
		//System.arraycopy(arr2,0,arr,2,3);
		//System.out.println(Arrays.toString(arr));

		//int a=1;
		//int b=2;
		//int c=a;
		
		//for(Integer aaa:arr)
		//	System.out.println(aaa);
		
		//int a=123;
		//String str=String.valueOf(a);
		//System.out.println(str+a);
		
		//String [][] asia={
		//	{"kor","jap","chi"},
		//	{"tai","bet","phi"}
		//}; 
		//System.out.print(asia[0][1]);
	
		//for(int i=0; i<asia.length; i++){
		//	 for(int j=0; j<asia[i].length; j++){
		//		System.out.print (asia[i][j]+" ");
		//	 }
		//	System.out.println();
		//}
		 
		//String []strAr={"hong","kim","park"};
		//String aa="hanbe";
		//System.out.println(aa.charAt(2));
	
		//for(int i=0; i<strAr.length; i++){
		//	for(int j=0; j<strAr[i].length(); j++){
		//		System.out.print(strAr[i].charAt(j));
		//	}
		//	System.out.println();
		//}
		
		//for(int a=2; a<10; a++){
		//	for(int j=1; j<10; j++){
		//		System.out.println(a+"X"+j+"="+a*j);
		//	}
		//	System.out.println();
		//}
		
		//String []str={"Hanbe","Soohyun","Baehwam"};
		//	for(String aaa:str)
		//	 System.out.print(aaa);
	
		//Scanner sc=new Scanner(System.in);
		
		//System.out.print("How old are you?");
		//int C=sc.nextInt();
		
		//Scanner sc = new Scanner(System.in);
		
		//System.out.print(" row: ");
		//int row = sc.nextInt();
		
		//System.out.print("colum:");
		//int col = sc.nextInt();
		
		//char [][]wordData = new char[row][col];
		
		//String []storage = new String [row];
		
		//for( int i=0; i<row; i++){
		//	System.out.print("input the word: ");
		//	storage[i] = sc.next();
		//	for( int j=0; j<col; j++ ){
		//		wordData[i][j] = storage[i].charAt(j); 
		//	}	
		//}
		//System.out.print(Arrays.toString(wordData[0]));
		String rst;
		Test tes= new Test();
		rst = tes.capitalMethod("korea");
		
		//rst = capitalMethod("korea");
		
		System.out.print("after = "+rst);
	
	}
}