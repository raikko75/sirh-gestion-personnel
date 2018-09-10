package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListerCollaborateursController extends HttpServlet {
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse rep)throws
	ServletException, IOException {
		List<Collaborateur> collaborateur = collabService.listCollaborateurs();
		
		
		
		req.setAttribute("ListeCollaborateur", collaborateur);
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, rep);
	
	}
}
