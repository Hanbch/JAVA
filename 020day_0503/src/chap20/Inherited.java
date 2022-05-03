package chap20;
//자바에서는 단일 상속만가능

class MobilePhone {
	   protected String number;     // 전화번호
	   
	   public MobilePhone(String num) {
	      number = num;
	   }
	   public void answer() {
	      System.out.println("Hi~ from " + number);
	   }
	}


class SmartPhone extends MobilePhone {
	   private String androidVer;   // 안드로이드 운영체제 네임(버전)

	   public SmartPhone(String num, String ver) {
	      super(num);
	      androidVer = ver;
	   }
	   public void playApp() {
	      System.out.println("App is running in " + androidVer);
	   }
	}


public class Inherited {

	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone("010-555-777", "Nougat");
		
		
		// 다형성(polymorphism)
		// 부모 = 자식( without 형변환 )
		MobilePhone ph2 = new SmartPhone("010-999-333", "Nougat");
		
		ph1.answer();
		ph1.playApp();
		System.out.println();

		ph2.answer();
		//ph2.playApp();

	}

}
