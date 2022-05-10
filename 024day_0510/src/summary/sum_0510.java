
//05/10
/*
1. 자바에서의 기본적인 에러 메커니즘은?
 
2. try ~ catch 에 대하여 설명하시오.
  - 예외처리 할떄 사용되며 에러가 예상되는부분에 try처리를 해주고 에러가 났을때 catch안의 내용이 실행된다.
    


4.    아래 부분에서 실시간 에러가 나는 이유를 메모리를 그려 설명하시오.
class Board { }
class PBoard extends Board { }

class ClassCast {
   public static void main(String[] args) {
      Board pbd1 = new PBoard();
      PBoard pbd2 = (PBoard)pbd1;   // OK!

      System.out.println(".. intermediate location .. ");
      Board ebd1 = new Board();
      PBoard ebd2 = (PBoard)ebd1;   // Exception!
   }
}

ebd1은 Board타입의 객체이므로 메모리상에 PBoard클래스 내용이 존재하지않는다. 그러므로 형변환시 오류가난다. 

5.아래의 예외 객체에 대하여 설명하시오.

-ArrayIndexOutOfBoundsException
-ClassCastException
-NullPointerException



6. 아래를 프로그래밍 하시오. 
abstract class Fruit {
	abstract void print();  
}

main(){
Fruit fAry[] = {new Grape(), new Apple(), new Pear());
for(Fruit f : fAry)
f.print();
}

- 결과
나는 포도이다.
나는 사과이다.
나는 배이다.

 */

package summary;
 
abstract class Fruit{
	abstract void print();
	
}

class Grape extends Fruit{
	void print() {
		System.out.println("나는 포도이다.");
	}
}

class Apple extends Fruit{
	void print() {
		System.out.println("나는 사과이다.");
	}
}

class Pear extends Fruit{
	void print() {
		System.out.println("나는 배이다.");
	}
}

public class sum_0510 {
	public static void main(String[] args) {
		
		Fruit[] fru = {new Grape(),new Apple(),new Pear()};
		
		for(Fruit f:fru) {
			f.print();
		}
		
	}
}
