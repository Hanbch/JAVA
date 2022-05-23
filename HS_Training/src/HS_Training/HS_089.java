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
"아래의 프로그래밍을 작성하시오.

이미지 파일 a.jpg를 b.jpg로 복사하는 프로그램을 작성하라. 
한 번에 1KB 단위로 데이터를 복사하라. a.jpg는 프로젝트 폴더 밑에 있어야 한다."
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
		
		//System.out.println("복사된 파일크기" + copyByte);



	}

}
