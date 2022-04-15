package chap05;

public class Workspace {

	public static void main(String[] args) {

		// - 1과 1000 사이의 숫자중 3의 배수 이자 5의 배수인 첫번재 수는?
		// - 없다면 없다고 출력 할것.

		boolean search = false;
		int rst = 0;

		for (int i = 1; i < 1000; i++) {
			if ((i % 3) == 0 && (i % 5) == 0) {
				search = true;
				rst = i;
				break;
			}

		}
		if (search) {
			System.out.println("결과갑은" + rst + "입니다.");
		} else
			System.out.println("없습니다.");

		// 구구단을 출력하시오.

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
			System.out.println('\n');
		}

		// 3의 배수인 단만 출력하시오.
		for (int i = 2; i < 10; i++) {
			if (i % 3 != 0)
				continue;
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
			System.out.println('\n');
		}
		
		//90, 70 100  세 수중  max  값을 구하시오.
		
		int num1 = 90;
		int num2 = 70;
		int num3 = 100;
		
		int max = num1;
		
		if(num2 > max)
			max = num2;
		if(num3 > max)
			max = num3;
		
		System.out.println(max);
		
		//1부터 100까지의 짝수의 합은
		int sum = 0;
		for(int i=0; i<=100; i++) {
			if((i%2) != 0) 
				continue;
			sum += i;
		}
		System.out.println(sum);
		
		int sum2 = 0;
		for(int i=0; i<=100; i++) {
			if((i%2) == 0) 
				sum2 += i;
		}
		System.out.println(sum2);

		// 국어:80 수학:80 영어:60        
		// 총점과 평균을 출력하고, 평균에 따른 수우미양가를 출력하시오 "
		
		int kor = 80;
		int math = 80;
		int eng = 60;
		
		int total = kor + math + eng;
		double avr = total/3.0;
		
		if(avr >= 90)
			System.out.println("수");
		else if( avr >= 80 )
			System.out.println("우");
		else if( avr >= 70 )
			System.out.println("미");
		else if( avr >= 60 )
			System.out.println("양");
		else
			System.out.println("가");
		
	}

}
