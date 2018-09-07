package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListerCollaborateursController extends HttpServlet {


	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse rep)throws
	ServletException, IOException {
		rep.getWriter().write("hello lister LOL collaborateurController");
		String avecPhotoParam = req.getParameter("avecPhoto");
		String departementParam = req.getParameter("departement");
		rep.setContentType("text/html");

		rep.getWriter().write
		("<h1>liste des collabos </h1>" +"<ul> "+ "<li> avec photo" 
				+ avecPhotoParam+" </li> "+ " <li> dep" 
				+ departementParam+" </li> " + " </ul> ");



	}
}
