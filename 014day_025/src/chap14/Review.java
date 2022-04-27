package chap14;
class myTV{
	private String brand;
	private int year;
	private int inch;
	
	public myTV(String brand, int  year, int inch){
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	void show(){
		System.out.println(brand + "에서만든 " + year + "년형" + inch + "인치 TV");
	}
	
}

public class Review {

	public static void main(String[] args) {
	
		myTV tv = new myTV("LG", 2017, 32);
		 tv.show();
	}

			
}
