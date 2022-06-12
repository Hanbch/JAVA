package edu.hi.ex.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.hi.ex.command.BCommand;
import edu.hi.ex.command.BListCommand;

/**
 * Servlet implementation class bcontroller
 */
@WebServlet("*do")
public class Bcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");//����� ��
		actionDo(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");//����� ��
		actionDo(request,response);
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
	      System.out.println("actionDo");
	      request.setCharacterEncoding("UTF-8");//�ѱ� ó��
	      
	      //BCommand�� MVC���� Model2���� ��������κ� Command�� ���Ѵ�. 
	      //BCommand�� ���Ͽ� ���ǰ� �ʿ��Ͽ� �����߻�
	      String viewPage = null;
	      BCommand command = null;
	      
	      //�Ʒ� �� ���� http://localhost:8282/jsp_board/list.do���� "list.do"�� ������ ���� �ڵ��.
	      String uri = request.getRequestURI();
	      String conPath = request.getContextPath();
	      String com = uri.substring(conPath.length());
	      
	      System.out.println( "Ȯ��:" + uri + ":" + conPath + ":" + com);
	      
	      if(com.equals("/list.do")) {
	         
	         //BCommand�������̽��� ������ �ڼ��̹Ƿ� Ŭ����������
	         command = new BListCommand();
	         command.execute(request, response);
	         //execute�޼ҵ�� BListCommand���� request, response��ü�� �������� ���� �ǹ�
	         viewPage = "list.jsp";         
	      }
	      /*
	        Ŭ���̾�Ʈ���� list.do�� list.jsp�� forwarding�� ��Ű�ڴٴ� �ǹ��̴�.
	        forwarding�� BListCommandŬ�������� �޸𸮿� �ø� request, response ��ü ������ 
	        list.jsp���� ��밡���ϴٴ� �ǹ̴�. forwarding�ɶ����� ������ ����ֱ� �����̴�. 
	        ��� list.jsp���� forEach���� ����Ͽ� �����͸� ���� �� �ִ�.
	       */
	      
	      RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
	      dispatcher.forward(request, response);
	      

	   }
}
