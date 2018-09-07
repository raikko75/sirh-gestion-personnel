package dev.sgp.web;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListerCollaborateursController extends HttpServlet {


	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse rep)throws
	ServletException, IOException {
		req.setAttribute("listNoms", Arrays.asList("robert","jean","hugues"));
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, rep);
	
	}
}
