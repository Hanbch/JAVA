package workspace;
/*
 "    1.아래가 컴파일 되도록 하시오.
public static void main(String[] args) {
        Box<String> sBox = BoxFactory.makeBox(""Sweet"");
        System.out.println(sBox.get());

        Box<Double> dBox = BoxFactory.makeBox(7.59);
        System.out.println(dBox.get());
    }"
 * */
class Box<T>{
	T ob;
	public void set(T ob){
		this.ob = ob;
	}
	
	public T get(){
		return ob;
	}
}

class BoxFactory{
	
	static <T> Box<T> makeBox(T ob){
		Box<T> b = new Box<>();
		b.set(ob);
		return b;
	}
	
}

public class Prac01 {
	public static void main(String[] args) {
		Box<String> sBox = BoxFactory.makeBox("Sweet");
        System.out.println(sBox.get());

        Box<Double> dBox = BoxFactory.makeBox(7.59);
        System.out.println(dBox.get());
	}

}
