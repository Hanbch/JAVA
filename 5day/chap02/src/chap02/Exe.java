package chap02;

public class Exe {

	public static void main(String[] args) {
		
		int kor = 80;
		int math = 80;
		int eng = 60;

		int sum = kor + math + eng;
		double avr = sum / (double) 3;

		System.out.println("총점 : " + sum + "점");
		System.out.println("평균 : " + avr + "점");

		if (avr >= 90) {
			System.out.println("성적 : 수");
		} else if (avr >= 80) {

			System.out.println("성적 : 우");

		} else if (avr >= 70) {

			System.out.println("성적 : 미");

		} else if (avr >= 60) {

			System.out.println("성적 : 양");

		} else {

			System.out.println("성적 : 가");

		}
		
		
//		if( avr >= 90 ) {
//			System.out.println("성적 : 수");
//		}
//		else if( (avr < 90) && (avr >= 80) ) {
//			
//			System.out.println("성적 : 우");
//			
//		}
//		else if( (avr < 80) && (avr >= 70) ) {
//			
//			System.out.println("성적 : 미");
//			
//		}
//		else if( (avr < 70) && (avr >= 60) ) {
//			
//			System.out.println("성적 : 양");
//			
//		}
//		else ( (avr < 60) && (avr >= 50) ) {
//			
//			System.out.println("성적 : 가");
//			
//		}
	}

}
