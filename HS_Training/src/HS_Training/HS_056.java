package HS_Training;

// 55.
/*
 "���� TV Ŭ������ �ִ�.

	class TV{
	   private int size;
	   public TV(int size) { this.size = size; }
	   protected int getSize() { return size; }
	}
	
	
	[1��] ���� main() �޼ҵ�� ���� ����� �����Ͽ� TV�� 
	��ӹ��� ColorTV Ŭ������ �ۼ��϶�.
	
	public static void main(String[] args) {
	   ColorTV myTV = new ColorTV(32, 1024);
	   myTV.printProperty();
	}
	32��ġ 1024�÷�"
 * */
//class TV{
//	   private int size;
//	   public TV(int size) { this.size = size; }
//	   protected int getSize() { return size; }
//	}
//	
//	class ColorTV extends TV{
//		int color;
//		
//		ColorTV(int size, int color){
//			super(size);
//			this.color = color;
//			
//		}
//		
//		void printProperty(){
//			
//			System.out.println("������: "+ getSize() + "�÷�: "+ this.color);
//		}
//		
//		
//	}

public class HS_056 {
	

	public static void main(String[] args) {
		   ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty();
	}

}
