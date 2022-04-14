
1.반복문에서의 break 와 continue 를 설명하시오.
  - 반복문에서 break를 만나는 순간 반복문이 종료 된다.
    continue는 조건식이 참일때 반복문으로 돌아가고 거짓일때는 밑에 코드를 실행한다.

2. 아래를 프로그래밍 하시오.
  - 1과 1000 사이의 숫자중 3의 배수 이자 5의 배수인 첫번재 수는?
  -  없다면 없다고 출력 할것.
	boolean search=false;

	for(int i=1; i<1000; i++){
		if((i%3) == 0 && (i%5) == 0){
			sysout(i);
			search = true;
			break;
		}
			
	}
	if(search == false)
		sysout("없다.");
		

3.반복문 3가지의 무한루프 만드는 방법은?
  - while(true){
  
    }

    do{
    
    }while(true)

    for(;;;){
    
    }

4.구구단 출력을 하시오.

  - for(int i=0; i<2; i++){
	for(int j=0; j<10; j++){
		sysout(i + "x" + j + "=" + "i*j");
	}  
 }

5.짝수단만 찍으시오.
  - for(int i=0; i<2; i++){
	if(i%2 != 0){
		continue;
	}
	for(int j=0; j<10; j++){
		sysout(i + "x" + j + "=" + "i*j");
	}  
 }
6. 3의 배수인 단만 출력하시오.(3.6.9단만 출력)
  - for(int i=0; i<2; i++){
	if(i%6 != 0){
		continue;
	}
	for(int j=0; j<10; j++){
		sysout(i + "x" + j + "=" + "i*j");
	}  
 }
7.while  문을 사용하여, 구구단을 출력하시오.
  - 
	int i= 2;

	while( i > 10){
		int j = 1; 
		while( j > 10 ){
			sysout(i + "x" + j + "=" + "i*j");
			j++;
		}
		i++;
	}
8.아래가 의도하지 않은 결과를 나타내는 이유를 설명하시오.
char ch = '가';
System.out.println(ch + '\n')
  - ch와 \n 이 연산이 되면서 int 형으로 형변환이되어 코드값으로 계산된다.

9.구구단중 짝수의 갯수는?

 -
10.구구단중 11의 배수는 없으면 없다고 출력하시오.
  - boolean t_f = false;
		int count = 0;
		for(int i=2; i<10; i++) {
			
			
			for(int j=1; j<10; j++) {
				if((i*j)%2 == 0) {
					t_f = true;
					System.out.println(i+"x"+j+"="+ i*j);
					count++;
				}
			}
			
				
		}
		System.out.println(count);
		if (t_f) {
			System.out.println("갑잉 있다");
		}else {
			System.out.println("갑이 없다");
		}
11.구구단을 9단부터 출력 하시오.
  - for(int i=9; i>1; i--) {
			 for(int j=9; j>0; j--) {
				 System.out.println(i + "x" + j + "=" + i*j);
			 }
		 }



