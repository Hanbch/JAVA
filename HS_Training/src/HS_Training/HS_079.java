package HS_Training;
/* 79.
 "public static void main(String[] args) {
   Box005<Apple> aBox005 = new Box005<Apple>();    // T�� Apple�� ����
   Box005<Orange> oBox005 = new Box005<Orange>();    // T�� Orange�� ����

   aBox005.set(new Apple());   // ����� ���ڿ� ��´�.
   oBox005.set(new Orange());   // �������� ���ڿ� ��´�.
   
   Apple ap = aBox005.get();   // ����� �����µ� �� ��ȯ ���� �ʴ´�.
   Orange og = oBox005.get();   // �������� �����µ� �� ��ȯ ���� �ʴ´�.

   System.out.println(ap);
   System.out.println(og);
}
"
*/

class Apple02 {
	public String toString() {
		return "apple";
	}
}

class Orange{
	public String toString() {
		return "orange";
	}
}

class Box005<T>{
	T ob;
	
	void set(T ob) {
		this.ob = ob;
	}
	
	T get() {
		return ob;
	}
	
	public String toString() {
		
		return ob.toString();
	}
}
public class HS_079 {

	public static void main(String[] args) {
		Box005<Apple02> aBox005 = new Box005<Apple02>(); // T�� Apple�� ����
		Box005<Orange> oBox005 = new Box005<Orange>(); // T�� Orange�� ����

		aBox005.set(new Apple02()); // ����� ���ڿ� ��´�.
		oBox005.set(new Orange()); // �������� ���ڿ� ��´�.

		Apple02 ap = aBox005.get(); // ����� �����µ� �� ��ȯ ���� �ʴ´�.
		Orange og = oBox005.get(); // �������� �����µ� �� ��ȯ ���� �ʴ´�.

		System.out.println(ap);
		System.out.println(og);
	}

}
