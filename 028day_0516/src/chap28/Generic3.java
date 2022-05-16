package chap28;




class Box02<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

public class Generic3 {

	public static void main(String[] args) {
		
		Box02<Integer> box = new Box02<Integer>();
		box.set(25);
		System.out.println(box.get());
	}

}
