package chap19;

class TV{
	private int size;
	
	public TV(int size) {this.size = size;}
	
	protected int getSize() {return size; }//자식 클래스에서 private인 size에 접근하기위해
	
}

class ColorTV extends TV{
	
	 private int color; 
	
	ColorTV(int size, int color){
		super(size);
		this.color = color;
		
	}
	
	protected int getColor(){return color;}
	
	
	void printProperty(){
		System.out.println(getSize() +"인치" + this.color + "컬러");
	}
}

class IPTV extends ColorTV{
	private int adress;
	
	IPTV(int adress, int size, int color){
		super(size,color);
		this.adress = adress;
	}
	
	void printProperty(){
		System.out.println( this.adress+ "주소의 " + getSize() +"인치 " + getColor() + "컬러");
	}
	
}

public class Exe01 {

	public static void main(String[] args) {
		
		ColorTV myTv = new ColorTV(32,1024);
		myTv.printProperty();
		
		IPTV ip = new IPTV(192,32,1024);
		ip.printProperty();
		
	
	}

}
