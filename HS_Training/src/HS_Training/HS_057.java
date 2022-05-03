package HS_Training;

// 57.
/*
 "다음은 2차원상의 한 점을 표현하는 Point 클래스이다.

	class Point {
	   private int x, y;
	   public Point(int x, int y) { this.x = x; this.y = y; }
	   public int getX() { return x; }
	   public int getY() { return y; }
	   protected void move(int x, int y) { this.x =x; this.y = y; }
	}
	[5번] Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라.
	 다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.
	
	public static void main(String[] args) {
	   ColorPoint cp = new ColorPoint(5, 5, ""YELLOW"");
	   cp.setXY(10, 20);
	   cp.setColor(""RED"");
	   String str = cp.toString();
	   System.out.println(str+""입니다. "");
}
RED색의 (10,20)의 점입니다. "
 * */
class Point {
	   private int x, y;
	   public Point(int x, int y) { this.x = x; this.y = y; }
	   public int getX() { return x; }
	   public int getY() { return y; }
	   protected void move(int x, int y) { this.x =x; this.y = y; }
}

class ColorPoint extends Point {
	private String color;
	
	ColorPoint(int x , int y, String color){
		super(x,y);
		this.color = color;
	}
	
	public void setXY(int x, int y){
		super.move(x, y);
	}
	
	void setColor(String color){
		this.color = color;
	}
	
	 public String toString() {
		return (color + "색의" + getX() +","+ getY()) ;
	}
	
}

public class HS_057 {
	
	public static void main(String[] args) {
		   ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		   cp.setXY(10, 20);
		   cp.setColor("RED");
		   String str = cp.toString();
		   System.out.println(str+"입니다. ");//RED색의 (10,20)의 점입니다.
	}

}
