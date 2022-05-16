
//05/16
/*
1. 다음과 같이 +로 연결된 덧셈식을 입력받아 덧셈 결과를 출력하는 프로그램을 작성하라. 
StringTokenizer와 Integer.parseInt(). 
String의 trim()을 활용하라.

입력 : 2 + 5 + 6 + 7
출력 : 합은 23 

2. 지네릭(Generic)이란?
  - 데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법이다.

3.아래가 컴파일 되도록 프로그래밍 하시오.<중요>

public static void main(String[] args) {
   Box<Apple> aBox = new Box<Apple>();    // T를 Apple로 결정
   Box<Orange> oBox = new Box<Orange>();    // T를 Orange로 결정

   aBox.set(new Apple());   // 사과를 상자에 담는다.
   oBox.set(new Orange());   // 오렌지를 상자에 담는다.
   
   Apple ap = aBox.get();   // 사과를 꺼내는데 형 변환 하지 않는다.
   Orange og = oBox.get();   // 오렌지를 꺼내는데 형 변환 하지 않는다.

   System.out.println(ap);
   System.out.println(og);
}

4.아래가 컴파일 되도록 프로그램을 짜시오.(중요)

public static void main(String[] args) {
   DBox<String, Integer> box = new DBox<String, Integer>();
   box.set("Apple", 25);
   System.out.println(box);
}

출력 : Apple 25

5.아래가 컴파일 되도록 프로그램을 짜시오.(중요)
public static void main(String[] args) {
   Box<Integer> iBox = new Box<>(); 
   iBox.set(24);

   Box<Double> dBox = new Box<>(); 
   dBox.set(5.97); 
 
}

 */

package summary;

//3번문제 
class Apple {
	@Override
	public String toString() {
		return "apple";
	}
}

class Orange {
	@Override
	public String toString() {
		return "orange";
	}
}

class Box<T> {
	T ob;

//	Box(T ob){   
//		this.ob = ob;
//	}

	public void set(T ob) {
		this.ob = ob;
	}

	public T get() {
		return this.ob;
	}

}

//4번;
class Dbox<T, O> {
	T a;
	O b;

	public void set(T a, O b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return a + " " + b;
	}
}

//5번
class Box03<T> {
	T ob;
	
	public void set(T ob) {
		this.ob = ob;
	}
	
	@Override
	public String toString() {
		return ob +"";
	}
}


public class sum_0516 {
	public static void main(String[] args) {

		// 3번
		Box<Apple> aBox = new Box<Apple>(); // T를 Apple로 결정
		Box<Orange> oBox = new Box<Orange>(); // T를 Orange로 결정

		aBox.set(new Apple()); // 사과를 상자에 담는다.
		oBox.set(new Orange()); // 오렌지를 상자에 담는다.

		Apple ap = aBox.get(); // 사과를 꺼내는데 형 변환 하지 않는다.
		Orange og = oBox.get(); // 오렌지를 꺼내는데 형 변환 하지 않는다.

		System.out.println(ap);
		System.out.println(og);
		System.out.println();

		// 4번
		Dbox<String, Integer> box = new Dbox<String, Integer>();
		box.set("Apple", 25);
		System.out.println(box);

		// 5번
		Box03<Integer> iBox = new Box03<>();
		iBox.set(24);

		Box03<Double> dBox = new Box03<>();
		dBox.set(5.97);
		
		System.out.println(iBox + " " + dBox);

	}
}
