package chap13;

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
			grade = "수";
		}else if (avg >= 80) {
			grade ="우";
		}else if (avg >= 70) {
			grade ="미";
		}else if (avg >= 60) {
			grade ="양";
		}else {
			grade ="가";
		}
		return grade;
		
	}
	
}

public class Review {
	public static void main(String[] args) {
		//"아래를 프로그래밍 하시오.
		 
		Gugudan gugudan = new Gugudan();
		gugudan.printGugu(10); //1단부터 10단까지 출력
		
		//1 부터 num 까지 합을 구하는 class 를 작성하도록 하시오.
		Sum sm = new Sum();
		System.out.println(sm.getSum(100));
		
		//성적표
		Grade HB = new Grade();
		
		HB.initGrade(100, 30, 80);
		System.out.println(HB.getGrade());
		
		String ch = "choi";
		System.out.println(ch);
		
	}

}
