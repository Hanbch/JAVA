package summary;

class Gugudan{
	
	void printGugu(int num) {
		
		for(int i=1; i<= num; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
			System.out.print('\n');
		}
		
	}
	
	
}

public class sum_0421 {

	public static void main(String[] args) {
		/*
		  
		1. 참조형이란
		  - 참조형이란 메모리 주소를 참조하는 데이터 타입이다.  
		  
		2. BankAccount yoon 에서  변수 yoon 이 4바이트인 이유는?
		  - yoon은 참조현 변수이다. 참조형 변수는 4바이트인데 그 이유는 
		    JVM이 32bit체제 이므로 
		
		3.아래의 메모리를 그리시오.

		class BankAccount {
		    int balance = 0;     // 예금 잔액

		    public int deposit(int amount) {
		        balance += amount;
		        return balance;
		    }    

		    public int withdraw(int amount) {
		        balance -= amount;
		        return balance;
		    }

		    public int checkMyBalance() {
		        System.out.println("잔액 : " + balance);
		        return balance;
		    }
		}
			

		class DupRef {
		    public static void main(String[] args) {
		        BankAccount ref1 = new BankAccount();
		        BankAccount ref2 = ref1;

		        ref1.deposit(3000);
		        ref2.deposit(2000);

		        ref1.withdraw(400);
		        ref2.withdraw(300);

		        ref1.checkMyBalance();
		        ref2.checkMyBalance();  
		    }
		}
		

		4. 아래 메모리를 그리시오.

		class PassingRef {
		    public static void main(String[] args) {
		        BankAccount ref = new BankAccount();

		        ref.deposit(3000);
		        ref.withdraw(300);

		        check(ref);
		    }

		    public static void check(BankAccount acc ) {
		        acc.checkMyBalance();
		    }
		}
		
		3,4번 문제 chap09/instance.ai파일 참고

		5. 아래를 프로그래밍 하시오.
		 
		Gugudan gugudan = new Gugudan();
		gugudan.printGugu(10); //1단부터 10단까지 출력
		gugudan.printGugu(20); //1단부터 20단까지 출력
		
		*/
		Gugudan gugudan = new Gugudan();
		gugudan.printGugu(10); //1단부터 10단까지 출력
		
		
	}
}
