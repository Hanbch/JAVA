package HS_Training;
/* 76.
 "�߽��� ��Ÿ���� ���� x, y�� ������ radius �ʵ带 ������ Cir00 Ŭ������ �ۼ��ϰ��� �Ѵ�. 
�����ڴ� 3���� ����(x, y, raidus)�� �޾� �ش� �ʵ带 �ʱ�ȭ�ϰ�, 
equals() �޼ҵ�� �� ���� Cir00 ��ü�� �߽��� ������ ���� ������ �Ǻ��ϵ��� �Ѵ�.

public static void main(String[] args) {
        Cir00 a = new Cir00(2, 3, 5); // �߽� (2, 3)�� ������ 5�� ��
        Cir00 b = new Cir00(2, 3, 30); // �߽� (2, 3)�� ������ 30�� ��
        System.out.println(""�� a : "" + a);
        System.out.println(""�� b : "" + b);
        if(a.equals(b))
                System.out.println(""���� ��"");
        else 
                System.out.println(""���� �ٸ� ��"");
}
//====================
�� a : Cir00(2,3)������5
�� b : Cir00(2,3)������30
���� ��"
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
		return "Cir00(" + x + "," + y + ")������" + r;
	}
}

public class HS_076 {

	public static void main(String[] args) {
		Cir00 a = new Cir00(2, 3, 5); // �߽� (2, 3)�� ������ 5�� ��
        Cir00 b = new Cir00(2, 3, 30); // �߽� (2, 3)�� ������ 30�� ��
        System.out.println("�� a : " + a);
        System.out.println("�� b : " + b);
        if(a.equals(b))
                System.out.println("���� ��");
        else 
                System.out.println("���� �ٸ� ��");
	}

}
