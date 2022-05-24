package chap34;

import java.net.HttpURLConnection;
import java.net.URL;

public class URL_Ex01 {

	public static void main(String[] args) {
		String domain = "http://www.naver.com";
		
		try {
			URL url = new URL(domain);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("Head");
			
			System.out.println(connection);
		} catch(Exception e){
			e.printStackTrace();
		}

	}

}
