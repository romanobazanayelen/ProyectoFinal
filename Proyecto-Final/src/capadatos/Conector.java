package capadatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;			
			
		String sURL = "jdbc:mysql://localhost:3306/proyectofinal?autoReconnect=true&useSSL=false&serverTimezone=UTC";
		
		con = DriverManager.getConnection(sURL,"root","3991");
		
		System.out.println(con.toString());
		
	
	}
}

