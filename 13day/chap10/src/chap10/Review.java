package chap10;

class Gugudan{
	
	void printGugu(int dan) {
		for(int i=1; i<=dan; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
			System.out.println('\n');
		}
	}
	
}

class Sum{
	int getSum(int num) {
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum += i;
		}
		return sum;
	}
	
	
}

class Grade{
	int kor, math,eng;
	
	void initGrade(int kor,int math, int eng) {
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
		
		if(avg >= 90) {
			grade = "��";
		}else if (avg >= 80) {
			grade ="��";
		}else if (avg >= 70) {
			grade ="��";
		}else if (avg >= 60) {
			grade ="��";
		}else {
			grade ="��";
		}
		return grade;
		
	}
	
}

public class Review {
	public static void main(String[] args) {
		//"�Ʒ��� ���α׷��� �Ͻÿ�.
		 
		Gugudan gugudan = new Gugudan();
		gugudan.printGugu(10); //1�ܺ��� 10�ܱ��� ���
		
		//1 ���� num ���� ���� ���ϴ� class �� �ۼ��ϵ��� �Ͻÿ�.
		Sum sm = new Sum();
		System.out.println(sm.getSum(100));
		
		//����ǥ
		Grade HB = new Grade();
		
		HB.initGrade(100, 30, 80);
		System.out.println(HB.getGrade());
		
		String ch = "choi";
		System.out.println(ch);
		
	}

}