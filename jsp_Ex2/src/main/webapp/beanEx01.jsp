<%@page import="dedu.hi.ex.Student"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="student" class="dedu.hi.ex.Student"></jsp:useBean><!-- 객체생성 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 액션 태그로 set,get -->
	<jsp:setProperty property="name" name="student" value="홍길동"/>
	<jsp:setProperty property="age" name="student" value="13"/>
	<jsp:setProperty property="grade" name="student" value="6"/>
	<jsp:setProperty property="studentNum" name="student" value="100"/>
	
	이름:<jsp:getProperty property="name" name="student" /><br>
	나이:<jsp:getProperty property="age" name="student"/><br>
	학년:<jsp:getProperty property="grade" name="student"/><br>
	번호:<jsp:getProperty property="studentNum" name="student"/><br>
	<br>
	<%
		//위의 액션태그와 동일
		Student student1 = new Student(); 
		student1.setName("홍길동");
		student1.setAge(13);
		student1.setGrade(6);
		student1.setStudentNum(100);
		
		out.print("이름: " + student1.getName() + "<br>");
		out.print("나이: " + student1.getAge() + "<br>");
		out.print("학년: " + student1.getGrade() + "<br>");
		out.print("번호: " + student1.getStudentNum() + "<br>");

	%>
	

	
</body>
</html>