package chap20;
//다형성 과 오버라이딩의 응용
class Shape{
	public double getArea() {
		return 0;
	}
}

class Rectangle extends Shape{
	int width,height;
	
	Rectangle(int width,int height){
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
}

class Circle extends Shape{
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	 public double getArea() {
		 return radius * radius * Math.PI;
	 }
	
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      

class Triangle extends Shape{
	   int width;
	   int height;
	   
	   Triangle(int width, int height){
		   this.width = width;
		   this.height = height;
		   
	   }
	   
	   public double getArea(){
	      return width * height /2;
	   }
	}




public class Exe01 { 

	public static void main(String[] args) {
		
		Shape[] shape = { new Rectangle(10,10), new Circle(10), new Triangle(10,10) };
		
		for(Shape e: shape)
			System.out.println(e.getArea()); 
		
	}

}
