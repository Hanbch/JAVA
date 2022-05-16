package HS_Training;
/* 77.
 "1.���� main()�� ����Ǹ� �Ʒ� ���ÿ� ���� ��µǵ��� 
MyPoint00 Ŭ������ �ۼ��϶�.

public static void main(String [] args) {
        MyPoint00 p = new MyPoint00(3, 50);
        MyPoint00 q = new MyPoint00(4, 50);

        System.out.println(p);

        if(p.equals(q)) System.out.println(""���� ��"");
        else System.out.println(""�ٸ� ��"");                        
}


Point00(3,50)
�ٸ���

 */
class Point00{
	int x,y;
	
	Point00(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( this.x == ((Point00)obj).x && this.y == ((Point00)obj).y )
			return true;
		else
			return false;
	}
		
	@Override 
	public String toString() {
		return "Point00(" + x + "," + y + ")";
	}
	
}

public class HS_077 {

	public static void main(String[] args) {
		Point00 p = new Point00(3, 50);
        Point00 q = new Point00(4, 50);

        System.out.println(p);

        if(p.equals(q)) System.out.println("���� ��");
        else System.out.println("�ٸ� ��");  
	}

}
