package edu.hi.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormEx
 */
@WebServlet("/formex")
public class FormEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");// �ѱ� ���ڵ�
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
		
		String[]  hobbys = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String protocol = request.getParameter("protocol");
		
		
		System.out.println("���̵� Ȯ�� " + id);
		System.out.println("�̸� Ȯ�� " + name);
		System.out.println("pw Ȯ�� " + pw);
		System.out.println("hobbys Ȯ�� " + hobbys);
		System.out.println("major Ȯ�� " + major);
		System.out.println("protocol Ȯ�� " + protocol);
		
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		out.print("���̵� Ȯ�� " + id + "<br>");
		out.print("�̸� Ȯ�� " + name + "<br>");
		out.print("pw Ȯ�� " + pw + "<br>");
		out.print("hobbys Ȯ�� " + Arrays.toString(hobbys) + "<br>");
		out.print("major Ȯ�� " + major + "<br>");
		out.print("protocol Ȯ�� " + protocol + "<br>");
		
		
	}

}
