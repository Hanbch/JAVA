package summary;


//06/02
/*
1. 아래의 액션태그에 대하여 설명하시오.
  - useBean :객체를 생성하는 액션태그이다.
  - setProperty : 인스턴스를 값을 셋팅하는 태그이다.
  - getProperty : 인스턴스를 값을불러오는 태그이다.
2.빈 이란 무엇인가여?
  - 1) 특정한 정보(id, password, name, job)을 가지고 있는 클래스를 표현하는 하나의 규칙이며
   데이터를 표현하기 위한 목적을 지니고 있다. 이 규칙을 지닌 클래스를 Java Bean이라고 한다
	 * 반드시 클래스는 패키지 되어야 함
	 * 멤버변수는 프로퍼티(property)라고 함.
	 * 멤버변수는 private로 지정하고, 외부접근을 위한 get, set 메소드 정의해야 한다.
	 * Get, set 메소드는 public으로 지정한다.

3.예외 페이지를 만들기 위한 2가지 방법은?
  - 에러가 나는 페이지에서 <%@ page erroPage="erroPage.jsp"  %> 이 태그를 작성해주고
  	erroPage.jsp 페이지에 <%@ page isErrorPage="true" %><!-- 에러가났을떄 -->
 						<% response.setStatus(200); //정상처리 %> 
 	위의 두개의태그를 작성하고 에러시 보여줄 화면은 작성한다.
 	
  - xml파일을 만들어 
	  <error-page>
	  	<error-code>404</error-code>
	  	<location>/error404.jsp</location>
	  </error-page>
	  
	  <error-page>
	  	<error-code>500</error-code>
	  	<location>/error505.jsp</location>
	  </error-page>	
	  에러 내용에맞게 코드작성후 파일을 만들어 에러떄 표시할 화면을 작성해준다.

4.web.xml 에 대하여 설명하시오.
  -web.xml
	web.xml 파일은 웹 어플리케이션의 배포 설명자로, 각 어플리케이션의 환경을 설정하는 역할을 한다.
	서버가 처음 로딩될 때 읽어들이고, 해당 환경설정에 대해 tomcat에 적용하여 서버를 시작한다.


5. 아래의 에러 번호에 대하여 설명하시오.
- 200 : 요청이 정상적으로 처리된다.
- 400 : 임시로 페이지가 리다이렉트된다.
- 404 : 지정된 URL을 처리하기 위한 자원이 존재하지 않는다.
- 405 : 요천된 메서드가 허용되지 않는다.
- 500 : 서버 내부의 에러이다.

*/


