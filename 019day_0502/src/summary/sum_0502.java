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
		
		//1. 아래의 프로그램을 참고 하여 Box class 를 짜시오.
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
		2.상속을 UML로 표기해 보세요.//ai파일 참고

		3.부모클래스와 자식클래스의 다른 용어들은?
		  - 부모 클래스는 슈퍼클래스(Super Class)라고 부르며
			자식 클래스는 서브클래스( Sub Class)라고 부른다.

		4.super 키워드와 this 키워드의 차이는 무엇인가요?
		  - super는 부모클래스의 객체를 가리키고 this는 현재 클래스의객체를 가리킨다.

		5.  아래를 메모리를 그리시오. //ai파일 참고
		class A{
			int a;
			pulbic A(){};
		}

		class B extends A{
			int b;
			pulbic B(){};
		}
		

		6. 아래의 소스 코드에서 결과 값을 예측하고, 그렇게 되는 이유를 설명하시오.
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
		
		
		결과// I'm Super Class
		      I'm Sub Class
		      
		이유// 상속을 받은 자식 클래스 생성자를 만들때 자동으로 부모클래스의 생성자가 생성된다.
		      그러므로 자식클래스의 생성자만 호출을해도 부모클래스의 생성자와 함께 호출되는 것이다.      
		*/

	}

}
