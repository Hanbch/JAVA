<%@page import="dedu.hi.ex.Student"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="student" class="dedu.hi.ex.Student"></jsp:useBean><!-- ��ü���� -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- �׼� �±׷� set,get -->
	<jsp:setProperty property="name" name="student" value="ȫ�浿"/>
	<jsp:setProperty property="age" name="student" value="13"/>
	<jsp:setProperty property="grade" name="student" value="6"/>
	<jsp:setProperty property="studentNum" name="student" value="100"/>
	
	�̸�:<jsp:getProperty property="name" name="student" /><br>
	����:<jsp:getProperty property="age" name="student"/><br>
	�г�:<jsp:getProperty property="grade" name="student"/><br>
	��ȣ:<jsp:getProperty property="studentNum" name="student"/><br>
	<br>
	<%
		//���� �׼��±׿� ����
		Student student1 = new Student(); 
		student1.setName("ȫ�浿");
		student1.setAge(13);
		student1.setGrade(6);
		student1.setStudentNum(100);
		
		out.print("�̸�: " + student1.getName() + "<br>");
		out.print("����: " + student1.getAge() + "<br>");
		out.print("�г�: " + student1.getGrade() + "<br>");
		out.print("��ȣ: " + student1.getStudentNum() + "<br>");

	%>
	

	
</body>
</html>