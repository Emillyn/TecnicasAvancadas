package bancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaAoBancoDeDados {
	private static Connection connetion = null;
	
	public ConectaAoBancoDeDados(){}
	
	public static Connection realizaConexao(){
		String nomeServidor = "localhost";
		String database = "ProvaPOOII";
		String usuario = "root";
		String senha = "123456";
		String url = "jdbc:mysql://"+nomeServidor+":3306/"+database+"?useTimezone=true&serverTimezone=UTC";
		
		try {
			connetion=DriverManager.getConnection(url, usuario, senha);
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
