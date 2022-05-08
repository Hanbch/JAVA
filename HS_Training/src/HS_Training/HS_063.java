package HS_Training;

// 63.
/*
" 아래가 컴파일 되도록 interface 를 작성하시오.          
////////////////////////////////////////////////////
ICalculator iCalculator = new MyCalculator();
            
            int num = iCalculator.add(1, 1);
            num = iCalculator.sub(1,1);
            
            System.out.println(num);"
 */

interface Ical{
	int add();
	int sub();
}

class MyCal implements Ical{
	int num1,num2;
	
	MyCal(int num1,int num2){
		this.num1 = num1;
		this.num2 = num2;	
	}
	
	public int add() {
		return num1+num2;
	}
	
	public int sub() {
		return num1*num2;
	}
}

public class HS_063 {
	
	public static void main(String[] args) {
		Ical cal = new MyCal(10,10);
		
		int num = cal.add();
		int num2 = cal.sub();
		System.out.println(num);
		System.out.println(num2);
		
	}

}
