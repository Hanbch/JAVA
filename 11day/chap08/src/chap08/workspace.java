package chap08;
//Ŭ������ ��ü�� ������ -> Ŭ������ �ؾƲ ��ü�� �ؾ

class Circle{
	int radius; //Ŭ�������� �ִ� ������ �ν��Ͻ� ��������Ѵ�.
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getCirArea() { // Ŭ�������� �ִ� �޼���� �ν��Ͻ� �޼������Ѵ�.
		final double PI = 3.14;
		
		return radius*radius*PI;
	}
}

class Rectangle{
	int width;
	int height;
	
	public void initRec(int width,int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getRecArea() {
		return width*height;
	}
}

public class workspace {
	
	
	public static void main(String[] args) {
		
		Circle cir = new Circle();
		Circle cir2 = new Circle();
		
		cir.setRadius(10);
		cir2.setRadius(20);
		System.out.println(cir.getCirArea());
		System.out.println(cir2.getCirArea());
		
		Rectangle rec = new Rectangle();
		
		rec.initRec(30,2);
		System.out.println(rec.getRecArea());
		
	}

}