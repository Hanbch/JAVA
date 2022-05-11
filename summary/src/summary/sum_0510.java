
//05/10
/*
1. �ڹٿ����� �⺻���� ���� ��Ŀ������?
 
2. try ~ catch �� ���Ͽ� �����Ͻÿ�.
  - ����ó�� �ҋ� ���Ǹ� ������ ����Ǵºκп� tryó���� ���ְ� ������ ������ catch���� ������ ����ȴ�.
    


4.    �Ʒ� �κп��� �ǽð� ������ ���� ������ �޸𸮸� �׷� �����Ͻÿ�.
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

ebd1�� BoardŸ���� ��ü�̹Ƿ� �޸𸮻� PBoardŬ���� ������ ���������ʴ´�. �׷��Ƿ� ����ȯ�� ����������. 

5.�Ʒ��� ���� ��ü�� ���Ͽ� �����Ͻÿ�.

-ArrayIndexOutOfBoundsException
-ClassCastException
-NullPointerException



6. �Ʒ��� ���α׷��� �Ͻÿ�. 
abstract class Fruit {
	abstract void print();  
}

main(){
Fruit fAry[] = {new Grape(), new Apple(), new Pear());
for(Fruit f : fAry)
f.print();
}

- ���
���� �����̴�.
���� ����̴�.
���� ���̴�.

 */

package summary;
 
abstract class Fruit{
	abstract void print();
	
}

class Grape extends Fruit{
	void print() {
		System.out.println("���� �����̴�.");
	}
}

class Apple extends Fruit{
	void print() {
		System.out.println("���� ����̴�.");
	}
}

class Pear extends Fruit{
	void print() {
		System.out.println("���� ���̴�.");
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
