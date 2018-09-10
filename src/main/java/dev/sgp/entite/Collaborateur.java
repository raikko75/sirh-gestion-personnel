package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {
	private String marticule;
	private String nom;
	private String prenom;
	
	private LocalDate dateDeNaissance;
	private String adresse;
	private String numeroSecuriteSocial;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHeureDeCreation;
	
	private boolean actif;
	
	
	
	

	
	public Collaborateur(String nom, String prenom, LocalDate dateDeNaissance, String adresse,
			String numeroSecuriteSocial) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.numeroSecuriteSocial = numeroSecuriteSocial;
	}
	public String getMarticule() {
		return marticule;
	}
	public Collaborateur(String nom) {
		super();
		this.nom = nom;
	}
	public void setMarticule(String marticule) {
		this.marticule = marticule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumeroSecuriteSocial() {
		return numeroSecuriteSocial;
	}
	public void setNumeroSecuriteSocial(String numeroSecuriteSocial) {
		this.numeroSecuriteSocial = numeroSecuriteSocial;
	}
	public String getEmailPro() {
		return emailPro;
	}
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public ZonedDateTime getDateHeureDeCreation() {
		return dateHeureDeCreation;
	}
	public void setDateHeureDeCreation(ZonedDateTime dateHeureDeCreation) {
		this.dateHeureDeCreation = dateHeureDeCreation;
	}
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
}
