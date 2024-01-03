package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbIntegrityException;
import model.entidades.Funcionario;

public class SelectNoBanco {

	public static void main(String[] args) {
		Statement st = null;
		Connection conn = null;
		//Funcionario func = new Funcionario();
		
		String consulta = "SELECT * FROM funcionario";
		try {
			conn = DB.getConnection();

			st = conn.createStatement();

			ResultSet resultado = st.executeQuery(consulta);
			List<Funcionario> list = new ArrayList<>();
			Funcionario f = new Funcionario();
			if (resultado != null) {
				while (resultado.next()) {
					f = new Funcionario();
					f.setFunCodigo(resultado.getInt(1));
					f.setFunNome(resultado.getString(2));
					f.setFunSexo(resultado.getString(3));
					f.setFunDataCadastro(resultado.getDate(4));
					list.add(f);
				}
			} else {
				System.out.println("Nulo..");
			}
			for (Funcionario f1 : list) {
				//System.out.println(f1);
				System.out.println("Codigo " + f1.getFunCodigo() +
				" Nome " + f1.getFunNome() +
				" Sexo " + f1.getFunSexo() +
				" Data " + f1.getFunDataCadastro());
			}
			System.out.println("EXECUTOU O SELECT ");
		}
		catch (SQLException e) {
			System.out.println("Entrou no erro ");
			throw new DbIntegrityException(e.getMessage());
		} 
		finally {
			System.out.println("Fechou o banco ");
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
