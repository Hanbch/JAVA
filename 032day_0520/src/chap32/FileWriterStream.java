package chap32;


import java.io.*;

public class FileWriterStream {

	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("C:\\HB/Simple.txt"));
		
		out.write("아아아");
		out.newLine(); //각각 OS에 맞게 개행처리
		out.write("우우우");
		out.newLine();
		
		out.close();
	}

}
