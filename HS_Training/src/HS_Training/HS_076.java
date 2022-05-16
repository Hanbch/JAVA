package HS_Training;
/* 76.
 "중심을 나타내는 정수 x, y와 반지름 radius 필드를 가지는 Cir00 클래스를 작성하고자 한다. 
생성자는 3개의 인자(x, y, raidus)를 받아 해당 필드를 초기화하고, 
equals() 메소드는 두 개의 Cir00 객체의 중심이 같으면 같은 것으로 판별하도록 한다.

public static void main(String[] args) {
        Cir00 a = new Cir00(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
        Cir00 b = new Cir00(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
        System.out.println(""원 a : "" + a);
        System.out.println(""원 b : "" + b);
        if(a.equals(b))
                System.out.println(""같은 원"");
        else 
                System.out.println(""서로 다른 원"");
}
//====================
원 a : Cir00(2,3)반지름5
원 b : Cir00(2,3)반지름30
같은 원"
 */

class Cir00{
	int x,y;
	double r;
	
	Cir00(int x, int y, double r){
		this.x = x;
		this.y = y;
		this.r = r;
	}

	@Override
	public boolean equals(Object obj) {
		if( this.x == ((Cir00)obj).x && this.y == ((Cir00)obj).y )
			return true;
		else
			return false;
	}
	
	@Override public String toString() {
		return "Cir00(" + x + "," + y + ")반지름" + r;
	}
}

public class HS_076 {

	public static void main(String[] args) {
		Cir00 a = new Cir00(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
        Cir00 b = new Cir00(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        if(a.equals(b))
                System.out.println("같은 원");
        else 
                System.out.println("서로 다른 원");
	}

}
