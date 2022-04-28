package chap17;

class Circle01{
	private int rad;
	private double area;
	
	
	Circle01(int rad){
		this.rad = rad;
	}
	
	double getArea() {
		area = rad*rad*Math.PI;
		return area;
	}
	
}

public class Exe01 {
	
	static double getAllArea(Circle01[] arr) {
		double area = 0;
		
		for(int i=0; i<arr.length; i++) {
			area += arr[i].getArea();
		}
		return area;
	}
	
	public static void main(String[] args) {
		Circle01[] cir = new Circle01[3];
		
		cir[0] = new Circle01(10);
		cir[1] = new Circle01(10);
		cir[2] = new Circle01(10);
		
		
		System.out.println(getAllArea(cir));
	}

}
