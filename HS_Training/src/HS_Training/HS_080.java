package HS_Training;
/* 80.
 "public static void main(String[] args) {
   DBox<String, Integer> box = new DBox<String, Integer>();
   box.set(""Apple"", 25);
   System.out.println(box);
}

Ãâ·Â : Apple 25"
*/

class DBox02<T, O>{
	T ob;
	O ob2;
	
	public void set(T ob,O ob2){ 
		this.ob = ob; 
		this.ob2 = ob2;
	}
	
	public String toString() {
		return ob + " " + ob2;
	}
	
}

public class HS_080 {

	public static void main(String[] args) {
		DBox02<String, Integer> box = new DBox02<String, Integer>();
		   box.set("Apple", 25);
		   System.out.println(box);
	}

}
