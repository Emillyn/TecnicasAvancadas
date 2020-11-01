package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Voto;

public class Dao {
		
	public void registraVoto(Voto voto) {
		Connection connection = ConexaoMySQL.getConexao();
		String query = "insert into Votacao values (null,?)";
		
		try {
			PreparedStatement preparedStatement;
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, voto.getVoto());
			
			preparedStatement.executeUpdate();
			System.out.println(voto.getVoto());;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}













































