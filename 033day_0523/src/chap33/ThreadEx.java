package chap33;

class MyThread1 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
		}
	}
}

class MyThread2 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
		}
	}
}

public class ThreadEx {

	public static void main(String[] args) {
		MyThread1  th1 = new MyThread1();
		MyThread2  th2 = new MyThread2();
		th1.start();
		th2.start();
	}

}
