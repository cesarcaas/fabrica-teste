package application;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import db.DbException;

public class LeituraProperties {

	public static void main(String[] args) {
		try {
			//Properties props = loadProperties();
			Properties props = new Properties();
			props.load(new FileInputStream("nome.properties"));
			String nome = props.getProperty("nome");
			String nasc = props.getProperty("nasc");
			String cpf = props.getProperty("cpf");
			System.out.println(nome);
			System.out.println(nasc);
			System.out.println(cpf);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}
	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("nome.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		}
		catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}

}
