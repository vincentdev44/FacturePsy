package models;

import java.sql.Date;

public class Utilisateur {
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
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getLieuxDeNaissance() {
		return lieuxDeNaissance;
	}
	public void setLieuxDeNaissance(String lieuxDeNaissance) {
		this.lieuxDeNaissance = lieuxDeNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getNumeroTelephone() {
		return numeroTelephone;
	}
	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}
private int id;
private String nom;
private String prenom;
private Date dateNaissance;
private String lieuxDeNaissance;
private String adresse;
private String mail;
private String numeroTelephone;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
