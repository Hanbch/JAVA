package chap32;


import java.io.*;

public class FileWriterStream {

	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("C:\\HB/Simple.txt"));
		
		out.write("�ƾƾ�");
		out.newLine(); //���� OS�� �°� ����ó��
		out.write("����");
		out.newLine();
		
		out.close();
	}

}
