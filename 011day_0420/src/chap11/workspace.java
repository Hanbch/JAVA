package chap11;
//클래스와 객체의 차이점 -> 클래스는 붕어빵틀 객체는 붕어빵

class Circle{
	int radius; //클래스내에 있는 변수는 인스턴스 변수라고한다.
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getCirArea() { // 클래스내에 있는 메서드는 인스턴스 메서드라고한다.
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
