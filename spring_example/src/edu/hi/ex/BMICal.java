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
      
      System.out.println("BMI 지수 : " + (int)result);
      
      if(result > obesity) {
         System.out.println("비만 입니다.");
      } else if(result > overWeight) {
         System.out.println("과체중 입니다.");
      }else if(result > normal) {
         System.out.println("정상 입니다.");
      }else {
         System.out.println("저체중 입니다.");
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
