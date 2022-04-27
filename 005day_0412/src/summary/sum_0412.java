package summary;
/*
 04/12요약정리 
 
  1.조건문의 3가지 종류를 나열하고 설명하시오.
  - if 문 
    if( 조건식1 ){
	조건식1이 참일때 중괄호안의 명령어 실행
     } else if ( 조건식2 ){
	조건식1이 거짓일때 조건식2 진행 조건식2가 참일때 중괄호안의 명령어 실행
     }else{
           조건식1과 조건식2의 참값이외의 값일때 중괄호안 실행 
     }

    switch 문 
    int a = 3;

    switch( a ){
        case 1: 
	a가 1일때 출력
            System.out.println("1");
            break;
        case 2:
	a가 2일때 출력
            System.out.println("2");
            break;
        case 3 :
	a가 3일때 출력
            System.out.println("3");
            break;
        default :
            System.out.println("그 외의 숫자");
    }
    

	2.아래의 프로그램을 짜시오.
	   국어:80 수학:80 영어:60        
	   점과 평균을 출력하고, 평균에 따른 수우미양가를 출력하시오 

  	  - int kor = 80;
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
		

	3. 결합 방향과 우선순위에 대하여 설명하시오.
	  - 연산시 각 연산부호마다 우선순위가있다.
	
	4. "1초과 100미만인가?" 를 코딩 하면?
	  - int a = 0;
	    boolean rst = ( a > 1 ) && ( a <100 );
	    System.out.print(rst);
	 
	5. "2의 배수 또는 3의 배수?" 를 코딩 하면?
	  - int a = 2;
	     boolean rst = ( (a%2) == 0 ) || ( (b%3) == 0 );
	     System.out.print(rst);
	     
	6. && 와 || 설명하시오.
	  - &&(and)는 두개의 조건이 둘다 참이여야 true반환 
	    ||(or)는 두개의 조건식중 하나만 참이라도 true반환
	
	7. 아래의 프린트 결과를 예측해 보고, 코딩 후 결과를 확인 하시오.
	class SCE {
	
		public static void main(String[] args) {
		
			int num1 = 0;
			
			int num2 = 0;
			
			boolean result;
			
			 
			
			result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
			
			System.out.println("result = " + result); // false
			
			System.out.println("num1 = " + num1); // 10
			
			System.out.println("num2 = " + num2 + '\\n'); // 0
			 
			
			result = ((num1 += 10) > 0) || ((num2 += 10) > 0);
			
			System.out.println("result = " + result); // true
			
			System.out.println("num1 = " + num1); // 20
			
			System.out.println("num2 = " + num2); // 0
			
		}
		
	}

  - 결과 값이 위와 같이 나오는 이유는 &&과 ||는 앞에 연산식에서 결과만으로 반환값이 
    결정될 때 뒤의 연산식을 계산을 안한다.
    그러므로 && 연산에서 앞의 식이 false 일때 앞은 연산이 되고 뒤의 num2 =+10; 은 계산이
    된지 않는다. 그러므로 num1 += 10 은 num1 dl 10 되고  num2는 그대로 0이다.
    || 부호도 마찬가지로 앞의 값이 true 이면 뒤의 연산식과 관계없이 true 반환 그러므로 위아같이 
    num1에만 연산이된다 . 

	8. 아래가 에러가 나는 이유를 설명하고, 수정 하시오.
		short num1 = 1;
		short num = -num1;
	
	  - short num = -num은 -1*num으로 표현할수있고 
	    이렇게  되면 자동형변환이 일어나므로 int 으로 바뀐다.
	
	
	 9. 전위 증가 연산자와 후위 증가 연산자의 차이는?
	  - 전위 증가는 연산 후 값은 출력하고 후위 증가는 값을 출력 후 연산을한다.
	
	10. 아래의 비트 연산자 4가지를 설명하시오.
	  - 각각의 비트를 대상으로 연산을 진행하고, 각 비트를 대상으로 진행된 연산 결과를 묶어서 하나의 연산 결과 반환한다.
	
		&  비트연산을 할때 둘다 1이면 1 둘중 하나라도 0 이면 0
		|   비트연산을 할때 둘다 0이면 0 둘중 하나라도 1 이면 1
		^  비트연산을 할때 둘이 같은 수면 1 아니면 0
		~  반대값 출력 (0이면 1 출력 )
	 
	11. 아래의 연산자에 대하여 설명하시오.
	
	class AssignSteResult {
	
	public static void main(String[] args) {
	
			int num1 = 10, num2 = 20, num3 = 30;
		
			num1 = num2 = num3;
		}
	}
	
	  - num1 num2 num3에 모두 30의 값이 대입되어있는 것을 확인해 볼 수 있습니다.
	
	    대입연산자 = 의 연산 방향은 <- 이므로 
	
	    ⅰ. num2 = num3;
	
	     ⅱ. num2 = 30;
	
	     ⅲ. num1 = num2;
	
	     ⅳ. num1 = 30;
	
	  으로 값이 선언되기 때문에 num1, num2, num3의 값이 모두 num3의 값인 30이 선언되게 됩니다.
	
	 
	
	 12. 아래의 출력값을 예측하시오.
		class AddNum {
		
			public static void main(String[] args) {
			
				int result = 3 + 6;
				
				System.out.println("3 + 6 = " + result); // 9
				
				 
				
				result += 9;
				
				System.out.println("3 + 6 + 9 = " + result); // 18
				
				 
				
				result += 12;
				
				System.out.println("3 + 6 + 9 + 12 = " + result); // 30
		
			}
	
		}
	
	13. 아래를 프로그래밍 하시오.
		가로 80 세로 70.3 직사각형 넓이 구하는 프로그램
	
	  -  int hor = 80;
	     double ver = 70.3;
	
	     double area = hor * ver;
	
	14. 아래를 프로그래밍 하시오.
		가로 10 높이  70.3 삼각형 넓이 구하는 프로그램
	
	  - int hor = 10;
	    double height = 70.3;
	
	    double area = (hor*height)/2  


 */
