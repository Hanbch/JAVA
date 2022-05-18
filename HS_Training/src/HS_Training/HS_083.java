package HS_Training;
/* 83.
아래가 컴파일 되도록 하시오.
public static void main(String[] args) {
        Box2<String> sBox2 = Box2Factory.makeBox2(""Sweet"");
        System.out.println(sBox2.get());

        Box2<Double> dBox2 = Box2Factory.makeBox2(7.59);
        System.out.println(dBox2.get());
    }"
*/

class Box2<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

class Box2Factory{
	
	public static <T> Box2<T> makeBox2(T o){
		Box2<T> Box2 = new Box2<T>();
		Box2.set(o);
		return Box2;
	}
	
}


public class HS_083 {

	public static void main(String[] args) {
		Box2<String> sBox2 = Box2Factory.makeBox2("Sweet");
        System.out.println(sBox2.get());

        Box2<Double> dBox2 = Box2Factory.makeBox2(7.59);
        System.out.println(dBox2.get());
	}

}
