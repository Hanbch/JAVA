package workspace;
/*
 "2.�߽��� ��Ÿ���� ���� x, y�� ������ radius �ʵ带 ������ Circle Ŭ������ �ۼ��ϰ��� �Ѵ�. �����ڴ� 3���� ����(x, y, raidus)�� �޾� �ش� �ʵ带 �ʱ�ȭ�ϰ�, equals() �޼ҵ�� �� ���� Circle ��ü�� �߽��� ������ ���� ������ �Ǻ��ϵ��� �Ѵ�.

public static void main(String[] args) {
        Circle a = new Circle(2, 3, 5); // �߽� (2, 3)�� ������ 5�� ��
        Circle b = new Circle(2, 3, 30); // �߽� (2, 3)�� ������ 30�� ��
        System.out.println(""�� a : "" + a);
        System.out.println(""�� b : "" + b);
        if(a.equals(b))
                System.out.println(""���� ��"");
        else 
                System.out.println(""���� �ٸ� ��"");
}
//====================
�� a : Circle(2,3)������5
�� b : Circle(2,3)������30
���� ��"
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
			System.out.println("�� a: " + "Circle(" + c1.x + "," + c1.y + ")"  );
			System.out.println("�� b: " + "Circle(" + c2.x + "," + c2.y + ")"  );
			System.out.println("���� ��");
		
		
   }
}
