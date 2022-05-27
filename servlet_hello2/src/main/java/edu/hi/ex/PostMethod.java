package edu.hi.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/PostMethod")
public class PostMethod extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PostMethod() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hello World~~");

		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		for(int i=2; i<10; i++) {
			 for(int j=1; j<10; j++) {
				 out.print(i + "x" + j + "=" + i*j + "<br>" );
			 }
			 out.print("<br>");
		}
//
//		out.print("<html>");
//		out.print("<head>");
//		out.print("</head>");
//		out.print("<body>");
//		out.print("");
//		out.print("</body>");
//		out.print("</html>");
	}

}
