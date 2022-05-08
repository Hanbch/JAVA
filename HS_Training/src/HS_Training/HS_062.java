package HS_Training;

// 62.
/*
 " 아래가 컴파일 되도록 interface 를 작성하시오.          

IShape iShape = new Circle0202(10);
            
            System.out.println(iShape.getArea());"
  */

interface IShape {
	abstract public double getArea();
} 

class Circle0202 implements IShape {
	double rad;
	Circle0202(double rad){this.rad = rad;}
	
	public double getArea(){return rad*rad*Math.PI;}
}

public class HS_062 {
	
	public static void main(String[] args) {
		
	   IShape iShape =  new Circle0202(10);
	   
	   System.out.println(iShape.getArea());
			
	}

}
