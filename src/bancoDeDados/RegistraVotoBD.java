package bancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Voto;

public class RegistraVotoBD {
	
	public void registraVoto(Voto voto) {
		Connection connection = ConectaAoBancoDeDados.realizaConexao();
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
