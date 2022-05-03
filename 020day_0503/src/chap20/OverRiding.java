package chap20;
//자바에서는 단일 상속만가능

class Cake {
	   public void yummy() {
	      System.out.println("Yummy Cake");
	   }
	}

	class CheeseCake extends Cake {
	   public void yummy() { // 오버라이딩 :상속관계에서 body(내용)만 다른 함수.
	      System.out.println("Yummy Cheese Cake");
	   }
	}
	
	class StrawberryCheeseCake extends CheeseCake {
		   public void yummy() {
			   System.out.println("Yummy StrawberryCheese Cake");
		   }    // 그리고 CheeseCake의 yummy를 오버라이딩
		}




public class OverRiding { 

	public static void main(String[] args) {
		Cake c1 = new StrawberryCheeseCake();
		CheeseCake c2 = new StrawberryCheeseCake();
		StrawberryCheeseCake c3 = new StrawberryCheeseCake();
		
		c1.yummy(); 
		c2.yummy(); 
		c3.yummy(); 
		System.out.println();
		
		
		Cake c4 = new Cake();
		CheeseCake c5 = new CheeseCake();
		StrawberryCheeseCake c6 = new StrawberryCheeseCake();
		   
		c4.yummy(); 
		c5.yummy(); 
		c6.yummy(); 


	}

}
