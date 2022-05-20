package chap31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Stream {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\HB/Simple.txt");
		OutputStream out = new FileOutputStream("C:\\HB/Simplecopied.txt");
		
		int copyByte=0;
		int bData;
		
		while(true) {
			bData = in.read();
			if(bData == -1)
				break;
			
			out.write(bData);
			
			copyByte++;
		}
		
		in.close();
		out.close();
		
		System.out.println("복사된 파일크기" + copyByte);

	}

}
