package HS_Training;

// 56.
/*
 "다음 main() 메소드와 실행 결과를 참고하여 
	ColorTV를 상속받는 IPTV 클래스를 작성하라.
	
	public static void main(String[] args) {
	   IPTV iptv = new IPTV(""192.1.1.2"", 32, 2048); //""192.1.1.2"" 주소에 32인치, 2048컬러
	   iptv.printProperty();
	}
	나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
	
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
			
			System.out.println("사이즈: "+ getSize() + "컬러: "+ this.color);
		}
		
		
	}
	
	class Iptv extends ColorTV{
		private int adress;
		
		Iptv(int size, int color, int adress){
			super(size, color);
			this.adress = adress;
		}
		
		void printProperty(){
			
			System.out.println("주소: "+ this.adress +"사이즈: "+ getSize() + "컬러: "+ getColor() );
		}
		
	}

public class HS_055 {
	

	public static void main(String[] args) {
		   ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty();
	}

}
