package workspace;

import java.io.*;

import java.util.*;

/*
 "3. Sokcet ��ü�� �ҿ��Ͽ� �Ʒ��� ���α׷��� �Ͻÿ�.

- www.daum.net  ����
- �Ʒ��� ������ ������ ����
GET / HTTP/1.1
Host: www.daum.net
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_0)""
+ "" AppleWebKit/537.36 (KHTML, like Gecko)"" + "" Chrome/30.0.1599.101 Safari/537.36"");
���� ����

- �������� �޾ƿ� ����� html ��� "
 * */

public class Practice{
	
	public static void main(String[] args) throws IOException{
		int i;
		int group = (int)(Math.random()*5+1);
		System.out.print(group + "�� ");
		for( i=0; i<6; i++) {
			int num = (int)(Math.random()*9);
			System.out.print(num + " ");
		}
		
	}
}