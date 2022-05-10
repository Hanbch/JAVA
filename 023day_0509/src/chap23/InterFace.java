package chap23;

interface IShape{
	
	abstract public double getArea();
}

class Rectangle implements IShape { 
	int width, height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width*height;
	}
}

class Triangle implements IShape { 
	int width, height;
	
	Triangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return (width*height)/2.0;
	}
}


public class InterFace {

	public static void main(String[] args) {
		IShape sh = new Triangle(10,10);
		System.out.println(sh.getArea());
		
	}

}
