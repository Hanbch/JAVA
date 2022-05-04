package HS_Training;

// 58.
/*
 "아래의 프로젝트가 컴파일 되도록 짜시오.

Shape[] shapes = { new Rectangle(10, 10), new Circle(20) };
            
            double total =0;
            
            for (Shape shape : shapes) {
                    total = total + shape.getArea();
                }
            System.out.println(total);        "
 * */
class Shape01{
	
	public double getArea(){ return 0; }
	
}

class Circle01 extends Shape01{
	double rad;
	
	Circle01(double a){ this.rad = a; }
	
	public double getArea() {
		return rad*rad*Math.PI;
	}
	
}

class Rectangle01 extends Shape01{
	int width , height;
	
	Rectangle01(int a, int b){
		this.width = a;
		this.height = b;
	}
	
	public double getArea() {
		return width*height;
	}
	
}

public class HS_058_2 {
	
	public static void main(String[] args) {
		Shape[] shapes = { new Rectangle(10, 10), new Circle(20) };
        
        double total =0;
        
        for (Shape shape : shapes) {
                total = total + shape.getArea();
            }
        System.out.println(total);    
	}

}
