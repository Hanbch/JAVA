package HS_Training;
/* 79.
 "public static void main(String[] args) {
   Box005<Apple> aBox005 = new Box005<Apple>();    // T를 Apple로 결정
   Box005<Orange> oBox005 = new Box005<Orange>();    // T를 Orange로 결정

   aBox005.set(new Apple());   // 사과를 상자에 담는다.
   oBox005.set(new Orange());   // 오렌지를 상자에 담는다.
   
   Apple ap = aBox005.get();   // 사과를 꺼내는데 형 변환 하지 않는다.
   Orange og = oBox005.get();   // 오렌지를 꺼내는데 형 변환 하지 않는다.

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
		Box005<Apple02> aBox005 = new Box005<Apple02>(); // T를 Apple로 결정
		Box005<Orange> oBox005 = new Box005<Orange>(); // T를 Orange로 결정

		aBox005.set(new Apple02()); // 사과를 상자에 담는다.
		oBox005.set(new Orange()); // 오렌지를 상자에 담는다.

		Apple02 ap = aBox005.get(); // 사과를 꺼내는데 형 변환 하지 않는다.
		Orange og = oBox005.get(); // 오렌지를 꺼내는데 형 변환 하지 않는다.

		System.out.println(ap);
		System.out.println(og);
	}

}
