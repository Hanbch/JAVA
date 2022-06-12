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
		System.out.println("doGet");//디버깅 용
		actionDo(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");//디버깅 용
		actionDo(request,response);
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
	      System.out.println("actionDo");
	      request.setCharacterEncoding("UTF-8");//한글 처리
	      
	      //BCommand는 MVC패턴 Model2에서 로직실행부분 Command에 속한다. 
	      //BCommand에 대하여 정의가 필요하여 에러발생
	      String viewPage = null;
	      BCommand command = null;
	      
	      //아래 세 줄은 http://localhost:8282/jsp_board/list.do에서 "list.do"를 꺼내기 위한 코드들.
	      String uri = request.getRequestURI();
	      String conPath = request.getContextPath();
	      String com = uri.substring(conPath.length());
	      
	      System.out.println( "확인:" + uri + ":" + conPath + ":" + com);
	      
	      if(com.equals("/list.do")) {
	         
	         //BCommand인터페이스를 구현할 자손이므로 클래스생성必
	         command = new BListCommand();
	         command.execute(request, response);
	         //execute메소드는 BListCommand에서 request, response객체를 가져오는 것을 의미
	         viewPage = "list.jsp";         
	      }
	      /*
	        클라이언트에게 list.do는 list.jsp로 forwarding을 시키겠다는 의미이다.
	        forwarding은 BListCommand클래스에서 메모리에 올린 request, response 객체 정보를 
	        list.jsp에서 사용가능하다는 의미다. forwarding될때까지 정보가 살아있기 때문이다. 
	        고로 list.jsp에서 forEach문을 사용하여 데이터를 꺼낼 수 있다.
	       */
	      
	      RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
	      dispatcher.forward(request, response);
	      

	   }
}
