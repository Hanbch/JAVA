package prac.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prac.dao.Bdao;
import prac.dto.Bdto;

public class BListcommand implements Bcommand{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		Bdao dao = new Bdao();
		ArrayList<Bdto> dtos = dao.list();
		
		request.setAttribute("dtos", dtos);
		
	}
	
}
