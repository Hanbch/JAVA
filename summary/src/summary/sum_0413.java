/*
 04/13요약정리
1. 삼항연산자에 대하여 설명하시오.
  -  int a = 1; int b =2;
     int comp = (a > b) ? a : b; // 조건식이 참일때 ":" 앞의 값 리턴 거짓일때 뒤에 값 리턴  

2.아래를 삼항연산자를 사용하여 프로그래밍 하시오. 80, 33 ,55 = 최대값을 출력하시오.
	

  -  int a = 80;
     int b = 33;
     int c = 90;
		
     int comp = (a > b) ? a : b;
     int rst = ( comp > c ) ? comp : c;


3.switch 문에서 '걸어서 하늘까지' 를 설명하시오.
  - switch 문에서 break를 걸어주지않으면 해당 case 이하로 전부 실행된다.


4.아래를 프로그래밍 하시오.
- int num = -10 을 할당후 해당 정수에 대한 절대값을 출력하는 프로그램을 작성하시오.
  - int num = -10;
    num = (num > 0) ? num : (-num);
    System.out.println(num);

5.반복문에서 while 문과 do while 문의 차이는?
  - while 문은 (조건식) 을 먼저 돌리고 참일때 { }안의 내용을 실행하는데 
    do while 문은 먼저 do{ }를 실행하고 뒤에서 while( )조건을 돌린다.

6.for 문에서 for 문이 실행되는 순서를 설명하시오.
  - for( int i = 0; i<10; i++){
    for문 ( ) 안에서 초기화 -> 조건식 참/거짓 판단 -> 참일경우 { }안의 코드 실행 -> i++ i증가
    -> 조건식 참/거짓 판단 -  참일경우 { }안의 코드 실행 - i++ i증가 -> 조건식 거짓일경우 for문 탈출   
    }
    
7. 구구단을 출력하는 프로그램을 만드시오.(while 문 사용할것)
  - int n = 2;
	
	while(n < 10) {
		
		int j = 1;
			
		while(j < 10) {
				
			System.out.println( n + "X" + j + "=" + j * n);
			j++;
		}
		n++;
		System.out.println("");
	}

8.1부터 100까지의 합을 구하시오.
  - int sum = 0;
  for(int = 0; i<=100; i++){
       sum += i;
   } //5050

9.반복문에서의 break 를 설명하시오.
  - 반복문에서 break를 만나면 반복문을 빠져나온다.
    
10.1부터 100까지의 홀수들의 합을 구하시오.
  - int sum = 0;
    for( int = 0; i <=100; i++ ){
        if( (i % 2) == 1 ){
	sum += i;
         }
    }

11. 1과 1000 사이의 숫자중 2의 배수 이자 3의 배수인 수는 모두 몇개인가?
  - int sum =0;
		for(int i = 0; i <1000; i++) {
			if((i%2) == 0 && (i%3) == 0) {
				sum +=1;
			}
				
		}
		System.out.println(sum); //167

12.화폐매수 구하기?
	=126500 의 금액을 한국화폐으로 바꾸었을 때 각각 몇 개의 화폐가 필요한지 계산해서 출력하라.
	예) int 126500;

   -	int price = 126500;
		
		int m1, m2, m3, m4, m5, m6;
		
		m1 = price/50000;
		m2 = (price%50000)/10000;
		m3 = (price%10000)/5000;
		m4 = (price%5000)/1000;
		m5 = (price%1000)/500;
		m6 = (price%500)/100;
		
		
		System.out.println("오만원권: " + m1);
		System.out.println("만원권: " + m2);
		System.out.println("오천원권: " + m3);
		System.out.println("천원권: " + m4);
		System.out.println("오백원권: " + m5);
		System.out.println("백원권: " + m6);

출력)
   오만원 : 2장
   만원:    2장
   오천원짜리 :1장
   천원짜리: 1
   오백원짜리 1개
   백원짜리 0개
*/