package summary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//05/23
/*
1.  다음를 설명하시오.( 프로세스, 멀티 프로세스, 쓰레드 )

	- 프로세스는 운영체제로부터 자원을 할당받는 작업의 단위이고 
	스레드는 프로세스가 할당받은 자원을 이용하는 실행의 단위입니다.
	프로세스는 실행될 때 운영체제로부터 프로세서를 할당받고, 운영되기 위해 필요한 주소 공간, 메모리 등 자원을 할당받습니다. 
	스레드란 한 프로세스 내에서 동작되는 여러 실행의 흐름으로, 프로세스 내의 주소 공간이나 자원들을 같은 프로세스 내에 스레드끼리 	
	공유하면서 실행됩니다.	
	
	그러니까 프로세스와 스레드에 대한 질문은 결국에는 운영체제가 시스템의 자원을 어떤 단위로 할당하고, 
	프로세스와 스레드는 이 자원을 어떻게 사용하느냐를 알고 있냐에 대한 질문입니다.
	좀 여랍다면 다시 정리해볼께요.
	
	프로그램은
	어떤 작업을 위해 실행할 수 있는 파일 입니다.
	예를 들어, 개발을 할때 eclipse.exe 파일을 실행시켜야 하죠? 이 글을 읽는 분들은 이클립스툴을 알고계실꺼라 생각합니다.
	이클립스 프로그램 을 실행하는 겁니다.	
	
	프로세스는
	메모리에 올라와 CPU를 할당받고 프로그램이 실행되고 있는 상태
	또는 운영체제로부터 자원을 할당받는 작업의 단위. 쉽게 말해, 컴퓨터에서 실행중인 컴퓨터 프로그램을 의미합니다.
	
	즉, 프로세스는 동적인 개념으로 실행된 프로그램 을 말하는 겁니다.	
	예를 들어, 이클립스툴을 4개를 킨다고 해봅시다.
	
	이클립스툴 프로그램이 총 4번 실행되었고 그에 따라 총 4개의 프로세스가 메모리 상에 올라가 있는겁니다.
	
	
	
	그럼 이제 스레드란
	스레드는 프로세스가 할당받은 자원을 이용하는 실행의 단위 입니다.
	기본적으로 하나의 프로세스가 생성되면 하나의 스레드가 같이 생성되는데 이를 메인 스레드라고 부릅니다,
	스레드를 추가로 생성하지 않는 한모든 프로그램 코드는 메인 스레드에서 실행이 됩니다.
	또한, 프로세스는 여러개의 스레드를 가질 수 있는데 이를 멀티 스레드 라고 합니다.

	정리를 해보자면
	
	프로그램 은 어떤 작업을 위해 실행 하는 파일.
	
	프로세스 는 프로그램이 실행되고 있는 상태. 프로세스는 실행이 됐을때 운영체제 (OS)로 부터 자원(메모리와 같은 주소 공간)을 
	
	할당 을 받습니다. 스레드 는 한개의 프로세스 내에서 동작되는 여러 실행의 흐름.

	

2. 자바에서의 Thread를 구현 하는 두가지 방법은?
  - extends Thread와 같이 Thread를 상속받아 사용할 수 있고
 	implements runable과 같이 인터페이스를 implements로 사용할수 있다.

3. 아래와 같이 – 와 |를 300번씩 찍도록 쓰레드로 구현하시오.

|----------|||||||-||||||||||||||||----------------------------------

4. 아래의 프로그램에서 마이너스 금액이 찍히는 이유와 해결 방법은?
class RunnableEx21 implements Runnable {
	Account acc = new Account();

	@Override
	public void run() {
		
		while(acc.getBalance() > 0) {
			// 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			
			acc.withdraw(money);
			
			System.out.println("balance:" + acc.getBalance());
		}		
	} // run()
}

class Account {
	private int balance = 1000; //인스턴스 변수

	public  int getBalance() {
		return balance;
	}

	public void withdraw(int money){
		
		if(balance >= money) {
			try { 
					Thread.sleep(1000); // 1초간 멈춤 //따른 쓰레드를 실행 // 2가 멈춤 //
				} catch(InterruptedException e) {
					
				}
			balance -= money;
		}
		
	} // withdraw
}

class ThreadEx21 {
	public static void main(String args[]) {
		
		Runnable r = new RunnableEx21();
		new Thread(r).start(); // ThreadGroup에 의해 참조되므로 gc대상이 아니다.
		
		new Thread(r).start(); // ThreadGroup에 의해 참조되므로 gc대상이 아니다.
	}
}

  - 두개의 쓰레드가 하나의 인스턴스 변수 balance를 참조하므로 쓰레드 1일 sleep코드로 인해 1 초간 멈춰있을때 쓰레드2가 실행되면서 acc.getBalance() > 0의
  	조건밖의 결과가 출력될 수 있는것이다. 
  	
  	이런것을 방지하기 위해서는 실행되는 메서드에 synchronize를 붙여 쓰레드가 한번에 하나만 실행되도록해준다.
  	

5.쓰레드 동기화에 대하여 설명하시오.
  - 실행순서의 동기화
	쓰레드의 실행 순서를 정의하고, 이 순서에 반드시 따르도록 하는 것
	접근의 순서가 이미 정해져 있는 상황에서, 그 순서만 지켜지면 된다.
	
	메모리 접근에 대한 동기화
	메모리 접근에 있어서 동시접근을 막는 것
	예를 들어, 한 순간에 하나의 쓰레드에만 접근해야 하는 메모리 영역이 존재한다. 대표적으로 데이터 영역과 힙 영역이 있다.
	이 때, 데이터 영역에 할당된 변수를 둘 이상의 쓰레드가 동시에 접근할 때, 데이터가 덮어써지는 문제가 발생
	실행의 순서가 중요한 상황이 아니고, 한 순간에 하나의 쓰레드만 접근하면 되는 상황이다.
	어떠한 순서로 실행되는지는 중요하지 않지만, 메모리에 동시접근하는 문제점만 발생하지 않으면 된다.

*/

class Ex01 extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<300; i++)
			System.out.print("|");
	}
	
}

class Ex02 extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<300; i++)
			System.out.print("-");
	}
	
}

public class sum_0523 {
	public static void main(String[] args) {
		
		//3번
		Ex01 th1 = new Ex01();
		Ex02 th2 = new Ex02();
		th1.start();
		th2.start();
		
	
		
	}
}
