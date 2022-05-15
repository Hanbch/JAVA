package workspace;
/*
 "2.중심을 나타내는 정수 x, y와 반지름 radius 필드를 가지는 Circle 클래스를 작성하고자 한다. 생성자는 3개의 인자(x, y, raidus)를 받아 해당 필드를 초기화하고, equals() 메소드는 두 개의 Circle 객체의 중심이 같으면 같은 것으로 판별하도록 한다.

public static void main(String[] args) {
        Circle a = new Circle(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
        Circle b = new Circle(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
        System.out.println(""원 a : "" + a);
        System.out.println(""원 b : "" + b);
        if(a.equals(b))
                System.out.println(""같은 원"");
        else 
                System.out.println(""서로 다른 원"");
}
//====================
원 a : Circle(2,3)반지름5
원 b : Circle(2,3)반지름30
같은 원"
 * */

class Cir{
	int x,y;
	private double rad;
	
	Cir(int x ,int y, double rad){
		this.x = x;
		this.y = y;
		this.rad = rad;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this.x == ((Cir)obj).x && this.y == ((Cir)obj).y)
			return true;
		else
			return false;
	}
	
}
public class Practice{
	public static void main(String[] args) {
		Cir c1 = new Cir(10,10,5);
		Cir c2 = new Cir(10,10,5);
		
		if(c1.equals(c2))
			System.out.println("원 a: " + "Circle(" + c1.x + "," + c1.y + ")"  );
			System.out.println("원 b: " + "Circle(" + c2.x + "," + c2.y + ")"  );
			System.out.println("같은 원");
		
		
   }
}
