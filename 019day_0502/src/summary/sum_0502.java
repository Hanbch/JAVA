package summary;

class Box{
	private int num;
	private String str;
	
	Box(int num, String str){
		this.num  = num;
		this.str = str;
	}
	
	public int getBoxNum(){return num;}
	
}

public class sum_0502 {

	public static void main(String[] args) {
		
		//1. �Ʒ��� ���α׷��� ���� �Ͽ� Box class �� ¥�ÿ�.
			Box[] ar = new Box[5];
			ar[0] = new Box(101, "Coffee");
			ar[1] = new Box(202, "Computer");
			ar[2] = new Box(303, "Apple");
			ar[3] = new Box(404, "Dress");
			ar[4] = new Box(505, "Fairy-tale book");

			for (Box e : ar) {
				if (e.getBoxNum() == 505)
					System.out.println(e);
			}
		/*
		2.����� UML�� ǥ���� ������.//ai���� ����

		3.�θ�Ŭ������ �ڽ�Ŭ������ �ٸ� ������?
		  - �θ� Ŭ������ ����Ŭ����(Super Class)��� �θ���
			�ڽ� Ŭ������ ����Ŭ����( Sub Class)��� �θ���.

		4.super Ű����� this Ű������ ���̴� �����ΰ���?
		  - super�� �θ�Ŭ������ ��ü�� ����Ű�� this�� ���� Ŭ�����ǰ�ü�� ����Ų��.

		5.  �Ʒ��� �޸𸮸� �׸��ÿ�. //ai���� ����
		class A{
			int a;
			pulbic A(){};
		}

		class B extends A{
			int b;
			pulbic B(){};
		}
		

		6. �Ʒ��� �ҽ� �ڵ忡�� ��� ���� �����ϰ�, �׷��� �Ǵ� ������ �����Ͻÿ�.
		class SuperCLS {
		    public SuperCLS () {
		        System.out.println("I'm Super Class");
		    }
		}

		class SubCLS extends SuperCLS {	
			
		    public SubCLS () {
		    	super();
		        System.out.println("I'm Sub Class");
		    }
		}

		class SuperSubCon {
		    public static void main(String[] args) {
		       new SubCLS ();
		    }
		}
		
		
		���// I'm Super Class
		      I'm Sub Class
		      
		����// ����� ���� �ڽ� Ŭ���� �����ڸ� ���鶧 �ڵ����� �θ�Ŭ������ �����ڰ� �����ȴ�.
		      �׷��Ƿ� �ڽ�Ŭ������ �����ڸ� ȣ�����ص� �θ�Ŭ������ �����ڿ� �Բ� ȣ��Ǵ� ���̴�.      
		*/

	}

}
