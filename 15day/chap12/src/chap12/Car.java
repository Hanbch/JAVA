package chap12;

public class Car{
	void myCar() {
		System.out.println("This is my car");
		
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.myCar();
		Boat t = new Boat();
		t.myBoat();
	}
}
class Boat{
	void myBoat() {
		System.out.println("This is my boat");
	}
}

class Person {
	private int regiNum;
	private int passNum;
	
	Person(int rnum, int pnum){
		regiNum = rnum;
		passNum = pnum;
	}
	
	Person(int rnum) {
		//regiNum = rnum;
		//passNum = 0;
		this(rnum,0);// Person(rnum, 0) 생성자 호출할때
		
	}
	
	void showpersonInfo() {}
	
	
}
