package workspace;

import java.io.*;

import java.util.*;

/*
 "3. Sokcet 객체를 할용하여 아래를 프로그래밍 하시오.

- www.daum.net  접속
- 아래의 문구를 서버로 접속
GET / HTTP/1.1
Host: www.daum.net
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_0)""
+ "" AppleWebKit/537.36 (KHTML, like Gecko)"" + "" Chrome/30.0.1599.101 Safari/537.36"");
한줄 공백

- 서버에서 받아온 헤더및 html 출력 "
 * */

public class Practice{
	
	public static void main(String[] args) throws IOException{
		int i;
		int group = (int)(Math.random()*5+1);
		System.out.print(group + "조 ");
		for( i=0; i<6; i++) {
			int num = (int)(Math.random()*9);
			System.out.print(num + " ");
		}
		
	}
}