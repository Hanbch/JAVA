package HS_Training;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/* 89.
"�Ʒ��� ���α׷����� �ۼ��Ͻÿ�.

�̹��� ���� a.jpg�� b.jpg�� �����ϴ� ���α׷��� �ۼ��϶�. 
�� ���� 1KB ������ �����͸� �����϶�. a.jpg�� ������Ʈ ���� �ؿ� �־�� �Ѵ�."
*/

public class HS_089 {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\HB/bg.png");
		OutputStream out = new FileOutputStream("C:\\HB/aaa.png");
		
	
		int c;
		
		while( (c = in.read()) != -1 ) {
			out.write(c);
		}
		
		in.close();
		out.close();
		
		//System.out.println("����� ����ũ��" + copyByte);



	}

}
