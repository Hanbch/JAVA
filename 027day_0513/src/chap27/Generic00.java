package chap27;

import java.math.BigDecimal;
import java.util.Random;
import java.util.StringTokenizer;

class Apple {
	   public String toString() { return "I am an apple."; }
	}

class Orange {
	   public String toString() { return "I am an orange."; }
}

//���� ���ڴ� ����� �������� ���� �� �ִ�.
class Box {   // �����̵� �����ϰ� ���� �� �ִ� ����
	private Object ob;
	
	public void set(Object o) { ob = o; }
	public Object get() {return ob; }
}


public class Generic00{

	public static void main(String[] args) {
		Box aBox = new Box();    // ���� ����
		Box oBox = new Box();    // ���� ����

		aBox.set(new Apple());    // ���ڿ� ����� ��´�.
		oBox.set(new Orange());   // ���ڿ� �������� ��´�.

		Apple ap = (Apple)aBox.get();    // ���ڿ��� ����� ������.
		Orange og = (Orange)oBox.get();   // ���ڿ��� �������� ������.

		System.out.println(ap);
		System.out.println(og);
		
	}

}
