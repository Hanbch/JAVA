package edu.hi.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BCommand {
   //�������̽��Ƿ� �޼ҵ弱�� �����ϴ�. ������ �ڼ��� �Ѵ�. 
   void execute(HttpServletRequest request, HttpServletResponse response);
   
}