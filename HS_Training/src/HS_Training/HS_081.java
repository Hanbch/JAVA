package HS_Training;
/* 81.
 �Ʒ��� ������ �ǵ��� ���α׷��� ¥�ÿ�.(�߿�)
public static void main(String[] args) {
   Box003<Integer> iBox003 = new Box003<>(); 
   iBox003.set(24);

   Box003<Double> dBox003 = new Box003<>(); 
   dBox003.set(5.97); 
 
}"
*/
class Box003<T extends Number>{
	T ob;
	
	public void set(T ob) {
		this.ob = ob;
	}
	
	
}
public class HS_081 {

	public static void main(String[] args) {
		Box003<Integer> iBox003 = new Box003<>();
		iBox003.set(24);

		Box003<Double> dBox003 = new Box003<>();
		dBox003.set(5.97);
	}

}
