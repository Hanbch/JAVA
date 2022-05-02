package chap19;

public class Exe02 {

	public static void main(String[] args) {
		
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str);//RED색의 (10,20)의 점입니다. 
		
	
	}

}


class Point {
	private int x, y;
	
	public Point(int x, int y) { this.x = x; this.y = y; }
	
	public int getX() { return x; }
	public int getY() { return y; }
	protected void setX(int x) { this.x = x; }
	protected void setY(int y) { this.y = y; }
	
	protected void move(int x, int y) { this.x =x; this.y = y; }
}

class ColorPoint extends Point{
	private String color;
	
	ColorPoint(int x, int y,String color){
		super(x,y);
		this.color = color;
	}
	
	void setXY(int x, int y){
		setX(x);
		setY(y);
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return (String)color + "색의" + "("+ getX() +","+ getY() +")"+" 의 점 입니다." ;
	}
}

	

	
	