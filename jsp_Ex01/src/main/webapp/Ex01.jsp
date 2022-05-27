<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! //선언
		int  i=10;
		String str = "abcde";
		
		public int sum(int a, int b){//메서드 선언
			return a+b;
		}
	
	%>
	<%
		int i = 0;
		while(true){
			i++;
			out.print("2*" + i + "=" + (2*i) + "<br />");
			
	%>
	<%
		if(i >= 9)
			break;
		}
	%>
</body>
</html>