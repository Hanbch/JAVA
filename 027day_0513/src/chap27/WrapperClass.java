package chap27;

public class WrapperClass {

	public static void main(String[] args) {
		
		Integer iObj = 10;
		Double dObj = 3.14;
		
		System.out.println(iObj);
		System.out.println(dObj);
		
		int num = iObj; // int num = iObj.Value();
		double num2 = dObj; // double num = dObj.Value();
		
		System.out.println(num);
		System.out.println(num2);
	}

}
