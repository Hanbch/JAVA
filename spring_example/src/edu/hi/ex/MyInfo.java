package edu.hi.ex;

import java.util.ArrayList;

public class MyInfo {

	private String name;
	private double height;
	private double weight;
	private ArrayList<String> hobbys;
	private BMICal bmiCalculator;
	
	MyInfo(){}

	public MyInfo(String name, double height, double weight, ArrayList<String> hobbys, BMICal bmiCalculator) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.hobbys = hobbys;
		this.bmiCalculator = bmiCalculator;
	}
	
	public void getInfo() {
	      System.out.println("�̸� : " + name);
	      System.out.println("Ű : " + height);
	      System.out.println("������ : " + weight);
	      System.out.println("��� : " + hobbys);
	      bmiCalculator();

	   }

	
	public void bmiCalculator() {
		bmiCalculator.bmicalculation(weight, height);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public ArrayList<String> getHobbys() {
		return hobbys;
	}

	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}

	public BMICal getBmiCalculator() {
		return bmiCalculator;
	}

	public void setBmiCalculator(BMICal bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}

	
	
	

}
