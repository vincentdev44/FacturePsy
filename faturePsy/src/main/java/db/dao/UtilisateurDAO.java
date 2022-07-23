package db.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.ConnectorDb;
import models.Utilisateur;

public class UtilisateurDAO {

private final String  SQL_INSERT_UTILISATEUR ="";	
private final String  SQL_UPDATE_UTILISATEUR ="";	
private final String  SQL_DELETE_UTILISATEUR ="";	
private final String  SQL_SELECT_UTILISATEUR ="";	
private final String SQL_SELECT_ALL_UTILISATEUR="";
private Connection connection = ConnectorDb.getConnection();
private Utilisateur createUtilisateur() {
	return null;
}
private Utilisateur updateUtilisateur() {
	return null;
}
private void deleteUtilisateur() {
}
public List<Utilisateur> getUtilisateurs() throws SQLException{
   List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
	Statement statement;
    statement = connection.createStatement();
    ResultSet resultSet;
    resultSet = statement.executeQuery(
        "select * from utilasteur");
    int code;
    String title;
    while (resultSet.next()) {
     Utilisateur utilisateur = new Utilisateur();
     utilisateur.setId( resultSet.getInt("code"));
     utilisateur.setPrenom( resultSet.getString("prenom"));
     utilisateur.setNom( resultSet.getString("nom"));
     utilisateur.setAdresse(resultSet.getString("adresse"));
 utilisateurs.add(utilisateur);
 
    }
    resultSet.close();
    statement.close();
    connection.close();
	return utilisateurs;

}
}
