package chap32;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DopStream {

	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("data.in");
		DataOutputStream filterOut = new DataOutputStream(out); 
		filterOut.writeInt(275);
		filterOut.writeDouble(45.79);
		filterOut.close();
		
		InputStream in=new FileInputStream("data.in");
		DataInputStream filterIn=new DataInputStream(in);
		int num1=filterIn.readInt();
		double num2=filterIn.readDouble();
		filterIn.close();
		
		System.out.println(num1);
		System.out.println(num2);
		
				
	}

}
