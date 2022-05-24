package HS_Training;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/* 90.
" + �� - �� 300 ���� ������� �����ÿ�.
*/

class ThreadEx01 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("+");
		}
	}
}

class ThreadEx02 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
		}
	}
}

class RunableEx01 implements Runnable{
	@Override
	public void run(){
		for(int i=0; i<300; i++) {
			System.out.print("-");
		}
	}
}

class RunableEx02 implements Runnable{
	@Override
	public void run(){
		for(int i=0; i<300; i++) {
			System.out.print("+");
		}
	}
}

public class HS_090 {

	public static void main(String[] args) {
		//Thread Ŭ������ ��ӹ޴� ���
		ThreadEx01 th1 = new ThreadEx01();
		ThreadEx02 th2 = new ThreadEx02();
		
		th1.start();
		th2.start();
		
		//Thread �������̽��� ��ӹ޴� ���
		RunableEx01 th3 = new RunableEx01();
		RunableEx02 th4 = new RunableEx02();
		new Thread(th3).start();
		new Thread(th4).start();
		
	}

}
