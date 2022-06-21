package edu.hi.ex;

public class Cal {

	private int firstNum;
	private int secondNum;
	
	public Cal() {}
	
	public Cal(int firstNum, int secondNum) {
		
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public int add () {
		return firstNum + secondNum;
	}
	
	public int add (int num, int num2) {
		return num + num2;
	}
	

}
