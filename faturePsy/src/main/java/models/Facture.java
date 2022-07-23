package models;

import java.sql.Date;

public class Facture {

public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Date getDateDeConsultation() {
		return dateDeConsultation;
	}
	public void setDateDeConsultation(Date dateDeConsultation) {
		this.dateDeConsultation = dateDeConsultation;
	}
	public Date getDateDuPaiement() {
		return dateDuPaiement;
	}
	public void setDateDuPaiement(Date dateDuPaiement) {
		this.dateDuPaiement = dateDuPaiement;
	}
	public int getReglementId() {
		return reglementId;
	}
	public void setReglementId(int reglementId) {
		this.reglementId = reglementId;
	}
private int Id;
private Date dateDeConsultation;
private Date dateDuPaiement;
private int  reglementId;
}

