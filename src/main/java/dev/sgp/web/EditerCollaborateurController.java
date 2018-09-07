package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {
	
	@SuppressWarnings("static-access")
	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse rep)throws
	ServletException, IOException {
		
		
		String matricule = req.getParameter("matricule");
		
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		

		
		rep.setContentType("text/html");

		rep.getWriter().write
		("<h1>Edition de collaborateur </h1>" +"<ul> "
				+ matricule+" </li> "+ " <li>" 
				+ titre+" </li> " + " </ul> "
				+ nom + " </li> " + " </ul> "
				+ prenom + "<li> " + " </ul>" );
		
		if (matricule == null || titre == null || nom == null || prenom == null)
		{
			rep.getWriter().write("les parametres suivants sont incorrect");
			rep.sendError(rep.SC_BAD_REQUEST);
		}
		else {
			rep.getWriter().write("creation d'un collaboooooo avec les informations suivantes  ");
			rep.setStatus(rep.SC_CREATED);
		}

}
}
