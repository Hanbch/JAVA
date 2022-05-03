package HS_Training;

// 58.
/*
 "�Ʒ��� ������Ʈ�� ������ �ǵ��� ¥�ÿ�.

Shape[] shapes = { new Rectangle(10, 10), new Circle(20) };
            
            double total =0;
            
            for (Shape shape : shapes) {
                    total = total + shape.getArea();
                }
            System.out.println(total);        "
 * */
class Shape{
	
	public double getArea(){ return 0; }
	
}

class Circle extends Shape{
	double rad;
	
	Circle(double rad){
		this.rad = rad;
	}
	
	public double getArea(){////////////////�������̵�
		return rad*rad*Math.PI;
	}
}

class  Rectangle extends Shape{
	int width, height;
	
	Rectangle(){}
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {////////////////�������̵�
		return width*height;
	}
}

public class HS_058 {
	
	public static void main(String[] args) {
		  Shape[] sh1 = {new Circle(10), new Rectangle(20,20)};
			//sh1[0] = new Circle(10)
			//sh1[1] = new Rectangle(20,20)
		  
		  double area = 0;
	  
		  
		  //int[] ts = {1,2,3,4};
		  
		  for(Shape e:sh1)   // e[0]~e[1] ���
			  area += e.getArea();
			  
		  System.out.println(area);
	}

}
