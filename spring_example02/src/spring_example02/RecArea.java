package spring_example02;

public class RecArea {
	private int width,height;
	
	public RecArea(){}

	public RecArea(int width, int height) {
		super();
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
	
	
	public int getRecArea() {
		return width*height;
	}
	
}
