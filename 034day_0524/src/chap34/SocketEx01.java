package chap34;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class SocketEx01 {

	public static void main(String[] args)throws Exception {
		
		Socket socket = new Socket("www.kocw.net",80);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		PrintStream out = new PrintStream(socket.getOutputStream());
		
		
        // ��û����
        out.println("GET / HTTP/1.1");

        // �������
        out.println("Host: www.kocw.net");
        out.println("User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_0)"
                + " AppleWebKit/537.36 (KHTML, like Gecko)"
                + " Chrome/30.0.1599.101 Safari/537.36");
        // �������
        out.println();

        // ���� ����
        String line = null;
        while((line = in.readLine()) != null) {
            System.out.println(line);
        }

        in.close();
        out.close();
        socket.close();
		
		
		
		
	}

}
