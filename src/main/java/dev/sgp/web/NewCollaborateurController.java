package dev.sgp.web;

import java.io.IOException;
import java.net.NetworkInterface;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class NewCollaborateurController  extends HttpServlet{

	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	protected void doGet (HttpServletRequest req, HttpServletResponse rep)throws
	ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/collab/newCollaborateurs.jsp").forward(req, rep);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		
		String adresse = req.getParameter("adresse");
		String numeroSecuriteSocial = req.getParameter("numeroSecuriteSocial");
		String dateDeNaissance = req.getParameter("dateN");
		LocalDate date = LocalDate.parse(dateDeNaissance);

		
		collabService.sauvegarderCollaborateur(new Collaborateur(nom,prenom, date, adresse,numeroSecuriteSocial));
		resp.sendRedirect("lister");

	}


	/*
	 * Ajoute un message correspondant au champ spécifié à la map des erreurs.
	 */
	
	
	// toGet 
	/*
	@Override 
	protected void doPost(HttpServletRequest req, HttpServletResponse rep)throws
	ServletException, IOException {
	
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String dateDeNaissance = req.getParameter("dateDeNaissance");
		String adresse = req.getParameter("adresse");
		String numeroSecuriteSocial = req.getParameter("numeroSecuriteSocial");
	}
	*/

}
