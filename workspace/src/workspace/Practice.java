package workspace;

import java.io.*;
import java.util.*;

class Apple{
	@Override
	public String toString() {
		return "This is Apple";
	}
}

class Peach{
	@Override
	public String toString() {
		return "This is Peach";
	}
}

class Fruit<T>{
	T ob;
	
	void set(T ob) {
		this.ob = ob;
	}
	
	T get() {
		return this.ob;
	}
	
	@Override
	public String toString() {
		return this.ob + "";
	}
	
}
public class Practice{
	
	public static void main(String[] args) {
		Fruit<Apple> f1 = new Fruit<>();
		Fruit<Peach> f2 = new Fruit<>();
		
		f1.set(new Apple());
		f2.set(new Peach());
		System.out.println(f1);
		System.out.println(f2);
	}

}
