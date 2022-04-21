package chap09;

class Circle{
	int radius;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		final double PI = 3.14;
		return radius*radius*PI;
	}
}

class Rectangle {
	int width, height;
	
	void initRec(int width,int height) {
		this.width = width;
		this.height = height;
	}
	
	int getArea() {
		return width*height;
	}
}

class Grade{
	int kor,math,eng;
	
	void initGrade(int kor, int math,int eng) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	int getTotal() {
		return kor+math+eng;
	}
	
	double getAvg() {
		return getTotal()/3.0;
		
	}
	
	String getGrade() {
		double avg = getAvg();
		String grade;
		
		if(avg >=90 ) {
			grade = "��";
		}else if(avg >= 80) {
			grade = "��";
		}else if(avg >= 70) {
			grade = "��";
		}else if(avg >= 60) {
			grade = "��";
		}else {
			grade = "��";
		}
		
		return grade;
		
	}	
	
}

class Human{
	int eye;
	
	void setEye(int eye) {
		this.eye = eye;
	}
	
	void getEye() {
		System.out.println("���� " + eye + "�� �Դϴ�.");
	}
}

class Sum{
	
	
	int adding(int num) {
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		return sum;
	}
}


public class Review {

	public static void main(String[] args) {
		// "���� ���̴� ���ϴ� ���α׷��� �Ʒ��� ���� �ۼ��Ͻÿ�.
		//-��Ŭ������ �����
		//-���� �޼ҵ带 ���� �ٸ� Ŭ�������� �� ��ü�� �����Ұ�"
		Circle cir = new Circle();
		
		cir.setRadius(13);
		System.out.println(cir.getArea());
		
		//"�簢���� ���̴� ���ϴ� ���α׷��� �Ʒ��� ���� �ۼ��Ͻÿ�.
		// -�簢�� Ŭ������ �����
		// -���� �޼ҵ带 ���� �ٸ� Ŭ�������� �簢�� ��ü�� �����Ұ�"
		Rectangle rec = new Rectangle();
		rec.initRec(20,30);
		System.out.println(rec.getArea());
		
		//- ������ ���� Ŭ���� ����  Grade  ��ü �����ؼ� 
		// 90,70,80  �� ���� ����̾簡 �� ����ϼ���.
		Grade gr = new Grade();
		gr.initGrade(90, 70, 60 );
		System.out.println(gr.getGrade());
		
		////"Ŭ���� Human ,   ���� eye ���� ��  set  �Լ� ����� set   �Լ���  2�� ����ְ� eye  ��� �Ͻÿ�.
		Human hm = new Human();
		hm.setEye(2);
		hm.getEye();
		
		//1 ���� num ���� ���� ���ϴ� class �� �ۼ��ϵ��� �Ͻÿ�.
		Sum s1 = new Sum();
		System.out.println(s1.adding(100));
	}

}
