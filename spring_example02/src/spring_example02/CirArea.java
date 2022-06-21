package spring_example02;

public class CirArea {
	private double rad;
	
	CirArea(){}
	
	CirArea(double rad){ this.rad = rad;}
	
	public void setRad( double rad) {
		this.rad=rad;
	}
	public double getRad() {
		return this.rad;
	}

	public double getArea() {
		return (this.rad)*(this.rad)*3.14;
	}
	
}
