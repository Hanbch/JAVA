package chap31;


import java.io.*;

public class FileReaderStream {

	public static void main(String[] args) throws IOException  {
		char[] cbuf = new char[10];
		int readCnt;
		
		Reader in = new FileReader("C:\\HB/Simple.txt");
		readCnt = in.read(cbuf, 0, cbuf.length);
		
		for(int i=0; i<readCnt; i++) {
			System.out.print(cbuf[i]);
		}
		
		in.close();
	}

}
