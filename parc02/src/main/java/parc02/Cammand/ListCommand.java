package parc02.Cammand;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import parc02.dao.Dao;
import parc02.dto.Dto;

public class ListCommand implements Command {
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Dao dao = new Dao();
		
		ArrayList<Dto> dtos = dao.list();
		request.setAttribute("list",dtos);
	}
}
