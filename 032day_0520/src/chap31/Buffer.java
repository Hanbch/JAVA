package chap31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Buffer {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\HB/Buffer.txt");
		OutputStream out = new FileOutputStream("C:\\HB/Buffercopied.txt");
		
		int copyByte=0;
		int readLen;
		
		byte buf[] = new byte[1024];
		
		while(true) {
			readLen = in.read(buf);
			if(readLen == -1)
				break;
			
			out.write(buf, 0, readLen);
			
			copyByte += readLen;
		}
		
		in.close();
		out.close();
		
		System.out.println("복사된 파일크기" + copyByte);

	}

}
