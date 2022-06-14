package edu.hi.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.hi.ex.dao.BDao;

public class BModifyCommand implements BCommand{

   //�ڼ��� �����ϹǷ� interface�� �޼ҵ带 override�Ѵ�
   @Override
   public void execute(HttpServletRequest request, HttpServletResponse response) {
      
      System.out.println("BModifyCommand entry"); // -> ����빮��
      
      String bid = request.getParameter("bid");
      String bname = request.getParameter("bname");
      String btitle = request.getParameter("btitle");
      String bcontent = request.getParameter("bcontent");
      
      BDao dao = new BDao();
      dao.modify(bid,bname, btitle, bcontent);
      
   }
   
}