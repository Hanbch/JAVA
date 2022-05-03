package HS_Training;

// 56.
/*
 "���� main() �޼ҵ�� ���� ����� �����Ͽ� 
	ColorTV�� ��ӹ޴� IPTV Ŭ������ �ۼ��϶�.
	
	public static void main(String[] args) {
	   IPTV iptv = new IPTV(""192.1.1.2"", 32, 2048); //""192.1.1.2"" �ּҿ� 32��ġ, 2048�÷�
	   iptv.printProperty();
	}
	���� IPTV�� 192.1.1.2 �ּ��� 32��ġ 2048�÷�
	
	"
 * */
class TV{
	   private int size;
	   public TV(int size) { this.size = size; }
	   protected int getSize() { return size; }
	}
	
	class ColorTV extends TV{
		private int color;
		protected int getColor() { return color; }
		
		ColorTV(int size, int color){
			super(size);
			this.color = color;
			
		}
		
		void printProperty(){
			
			System.out.println("������: "+ getSize() + "�÷�: "+ this.color);
		}
		
		
	}
	
	class Iptv extends ColorTV{
		private int adress;
		
		Iptv(int size, int color, int adress){
			super(size, color);
			this.adress = adress;
		}
		
		void printProperty(){
			
			System.out.println("�ּ�: "+ this.adress +"������: "+ getSize() + "�÷�: "+ getColor() );
		}
		
	}

public class HS_055 {
	

	public static void main(String[] args) {
		   ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty();
	}

}
