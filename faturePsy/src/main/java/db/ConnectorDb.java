package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public final class ConnectorDb  {

	private ConnectorDb(){
		
	}
	private static final int port =  3306;
	private static final String serverDb ="localhost";
			
	private static final String nameDb = "foobar";
	private static final String nameUser = "root";
	private static String passwordUser = "root";
public static final Connection getConnection() throws SQLException, ClassNotFoundException {

		Connection connection = null;
	    Class.forName("com.mysql.cj.jdbc.Driver");
        try {
			connection = DriverManager.getConnection(
			    "jdbc:mysql://"+serverDb+":"+port+"/"+nameDb,nameUser
			    ,passwordUser);
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
	return connection; 
        }
        
}
