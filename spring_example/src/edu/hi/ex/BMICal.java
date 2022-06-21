package edu.hi.ex;

public class BMICal {

	private double lowWeigth;
	private double normal;
	private double overWeight;
	private double obesity;
	
	BMICal(){}

	public BMICal(double lowWeigth, double normal, double overWeight, double obesity) {
		
		this.lowWeigth = lowWeigth;
		this.normal = normal;
		this.overWeight = overWeight;
		this.obesity = obesity;
	}
	
	public void bmicalculation(double weight, double height) {
	      
      double h = height * 0.01 ;
      double result = weight / (h*h);
      
      System.out.println("BMI ���� : " + (int)result);
      
      if(result > obesity) {
         System.out.println("�� �Դϴ�.");
      } else if(result > overWeight) {
         System.out.println("��ü�� �Դϴ�.");
      }else if(result > normal) {
         System.out.println("���� �Դϴ�.");
      }else {
         System.out.println("��ü�� �Դϴ�.");
      }
   }

	public double getLowWeigth() {
		return lowWeigth;
	}

	public void setLowWeigth(double lowWeigth) {
		this.lowWeigth = lowWeigth;
	}

	public double getNormal() {
		return normal;
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public double getOverWeight() {
		return overWeight;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public double getObesity() {
		return obesity;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	
	

}
