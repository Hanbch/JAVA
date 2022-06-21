package edu.hi.ex;

public class Cir2 {
	private double rad;
	
	public Cir2() {}

	public Cir2(double rad) {
		super();
		this.rad = rad;
	}

	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}
	
	public double getArea() {
		return rad*rad*3.14;
	}
}
