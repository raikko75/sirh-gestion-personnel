package dev.sgp.service;


import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.*;
public class CollaborateurService {
	  List<Collaborateur> listCollaborateurs = new ArrayList();
	
	public List <Collaborateur> listCollaborateurs()
	{
		return listCollaborateurs;
	
	}
	
	public void sauvegarderCollaborateur(Collaborateur collab)
	{
		 listCollaborateurs.add(collab);
	}
}
