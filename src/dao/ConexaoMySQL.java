package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
	private static Connection connetion = null;

	public ConexaoMySQL(){}
	
	public static Connection getConexao(){
		String servername = "localhost";
		String database = "ProvaPOOII";
		String user = "root";
		String password = "123456";
		String url = "jdbc:mysql://"+servername+":3306/"+database+"?useTimezone=true&serverTimezone=UTC";
		
		try {
			connetion=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connetion;	
	}
	
	public static boolean fecharConexao(){	
		try {
			connetion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
}