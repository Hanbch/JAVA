package chap33;

import javax.swing.JOptionPane;

class ThreadEx01 extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());// ������� Ȯ��
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			}catch(Exception e){}
		}
	}
}

public class MultiThreadTest {

	public static void main(String[] args) {
		ThreadEx01 th1 = new ThreadEx01();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		
	}

}
