package edu.hi.ex;

public class ShapeGetArea {
	private Shape shape;
	
	public ShapeGetArea() {}

	public ShapeGetArea(Shape shape) {
		super();
		this.shape = shape;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public String toString() {
		return shape.getArea()+"";
	}
}
