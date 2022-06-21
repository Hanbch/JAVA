package edu.hi.ex;

public class Square implements Shape {
	private int width;
	private int height;
	
	public Square() {}
	
	public Square( int width,int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}



	public double getArea() {
		return  (width*height); 
	}
	

}
