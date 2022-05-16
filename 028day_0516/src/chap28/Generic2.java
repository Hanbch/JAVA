package chap28;




class Box01<L, R>{
	private L left;
	private R right;
	
	public void set(L o,R r) {
		left = o;
		right = r;
	}
	
	@Override
	public String toString() {
		return left + "&" + right;
	}
}

public class Generic2 {

	public static void main(String[] args) {
		
		Box01<String, Integer> box = new Box01<String, Integer>();
		box.set("Apple", 25);
		System.out.println(box);
	}

}
