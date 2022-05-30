package dedu.hi.ex;

public class Grade {

		int kor,math,eng;
		
		
		public void setGrade(int kor, int math, int eng){
			this.kor = kor;
			this.math = math;
			this.eng = eng;
		}
		
		public String getGrade() {
			int total = kor+math+eng;
			double avr = total/3.0;
			
			if(avr >= 90) {
				return "수";
			}else if( avr >= 80) {
				return "우";
			}else if( avr >= 70) {
				return "미";
			}else if( avr >= 60) {
				return "양";
			}else {
				return "가";
			}
			
		}

}
