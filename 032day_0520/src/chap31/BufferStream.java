package chap31;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferStream {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\HB/Buffer.txt");
		OutputStream out = new FileOutputStream("C:\\HB/Buffercopied.txt");
		
		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		int copyByte=0;
		int bData;
		
		while(true) {
			bData = bin.read();
			if(bData == -1)
				break;
			
			bout.write(bData);
			
			copyByte++;
		}
		
		bin.close();
		bout.close();
		
		System.out.println("복사된 파일크기" + copyByte);

	}

}
