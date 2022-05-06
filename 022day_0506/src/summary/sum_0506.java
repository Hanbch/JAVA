
//05/06
/*
 1. class�̸� �� �Լ����� final�� �ǹ̴�?
   -class�� final�� �ٸ� Ŭ������ �� class�� ��� �� �� ������ �ǹ��Ѵ�.
   - �޼����� final�� �������̵��� �ȵǴ°��� �ǹ��Ѵ�.

2. interface �� class �� ���̴�?
  - interface���� �߻��Լ��� �ü��ְ� ���߻���� �����ϴ� �׸��� implement�� ��밡���ϴ�
  - class�� ���� ��Ӹ� �����ϰ� Ŭ�������� ��� ���� �Լ� �����ڰ� �����ϴ�.

3. @Override �� ���Ͽ� �����Ͻÿ�.
  - @ Override Ű����� ���� Ŭ������ �޼ҵ带 �������̵� �ϴ� ���� �����̶�� ����! 
	�������̵��� �ϴ� ���°� �ƴϸ� �����Ϸ��� ���� �޽��� ����.
	java 1.7���� ���� �����ϴ�.


4. abstract Ű���忡 ���Ͽ� �����Ͻÿ�.
  - abstract�� �߻��̶�� ������ �߻��Լ� �տ� �ٴ´�. interface������ class�� ����Ʈ ���� 
  	abstract�̴�.

5. �Ʒ��� ��� ����� �Ʒ��� ���� �������� ���α׷��� �Ͻÿ�.
Object obj = new Circle(10);

System.out.println(obj); 

//���: ���̴� 100 �Դϴ�. (����)

 * */

package summary;

import java.util.Scanner;


//5�� class

class Circle{
	double rad;
	
	Circle(double rad){this.rad = rad;}
	
	public String toString() {
		return "���̴� " + (rad*rad*Math.PI) + "�Դϴ�.";
	}
	
}

public class sum_0506 {
	public static void main(String[] args) {
		
		Object obj = new Circle(10);
		System.out.println(obj);
		
	}
}
