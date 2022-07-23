package models;

import java.util.List;

public class UtilisateurFacture {

	private int id;
	private List<Integer> utilisateurIds;
private int factureId;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public List<Integer> getUtilisateurIds() {
	return utilisateurIds;
}
public void setUtilisateurIds(List<Integer> utilisateurIds) {
	this.utilisateurIds = utilisateurIds;
}
public int getFactureId() {
	return factureId;
}
public void setFactureId(int factureId) {
	this.factureId = factureId;
}

}
