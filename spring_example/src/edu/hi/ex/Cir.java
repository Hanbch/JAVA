package edu.hi.ex;

public class Cir {
	private double rad;
	
	public Cir() {}

	public double getRad() {
		return rad;
	}

	public Cir(double rad) {
		super();
		this.rad = rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	
	public double getCirArea() {
		return rad*rad*3.14;
	}

}
