package HS_Training;

// 57.
/*
 "������ 2�������� �� ���� ǥ���ϴ� Point Ŭ�����̴�.

	class Point {
	   private int x, y;
	   public Point(int x, int y) { this.x = x; this.y = y; }
	   public int getX() { return x; }
	   public int getY() { return y; }
	   protected void move(int x, int y) { this.x =x; this.y = y; }
	}
	[5��] Point�� ��ӹ޾� ���� ���� ���� ��Ÿ���� ColorPoint Ŭ������ �ۼ��϶�.
	 ���� main() �޼ҵ带 �����ϰ� ���� ����� ���� ��µǰ� �϶�.
	
	public static void main(String[] args) {
	   ColorPoint cp = new ColorPoint(5, 5, ""YELLOW"");
	   cp.setXY(10, 20);
	   cp.setColor(""RED"");
	   String str = cp.toString();
	   System.out.println(str+""�Դϴ�. "");
}
RED���� (10,20)�� ���Դϴ�. "
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
		return (color + "����" + getX() +","+ getY()) ;
	}
	
}

public class HS_057 {
	
	public static void main(String[] args) {
		   ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		   cp.setXY(10, 20);
		   cp.setColor("RED");
		   String str = cp.toString();
		   System.out.println(str+"�Դϴ�. ");//RED���� (10,20)�� ���Դϴ�.
	}

}
