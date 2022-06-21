package edu.hi.ex;

public class Pencil6BWithEraser extends Pencil6B implements Pencil{
	@Override
	public void use() {
		super.use();
		System.out.println("Pencil6BWithEraser 연필입니다.");
	}
	

}
