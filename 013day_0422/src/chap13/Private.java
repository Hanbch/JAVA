package chap13;

class Circle{
	private double rad = 0;// class 밖에서 변수 변경 불가
	final double PI = 3.14;
	
	public Circle(double r) {
		setRad(r);
	}
	public void setRad(double r) {
		if(r < 0) {
			rad = 0;
			return;
		}
		rad = r;
	}
	
	public double getRad() {
		return rad;
	}
	
	public double getArea() {
		
		return rad*rad*PI;
	}
	
	
	
}

public class Private {
	public static void main(String[]args) {
		Circle c = new Circle(1);
		System.out.println(c.getArea());
		
		c.setRad(2);
		System.out.println(c.getArea());
		c.setRad(3);
		System.out.println(c.getArea());
		//c.rad = - 4.5;
		System.out.println(c.getArea());
	}

}
