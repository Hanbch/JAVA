package chap28;

class Apple {
	   public String toString() { return "I am an apple."; }
}

class Orange {
   public String toString() { return "I am an orange."; }
}


class Box<T>{
	private T ob;
	int num;
	
	Box(int num){
		this.num = num;
	}
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

public class Generic {

	public static void main(String[] args) {
		
		Box<Apple> aBox = new Box<Apple>(25);
		Box<Orange> oBox = new Box<Orange>(25);
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
	}

}
