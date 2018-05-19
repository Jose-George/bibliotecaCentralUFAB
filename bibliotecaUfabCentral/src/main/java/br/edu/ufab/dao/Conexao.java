package br.edu.ufab.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	/*Essa classe � responsavel por fazer a conex�o do Software(JAVA) ao Banco(MySQL)
	 * Temos um metodo estatico getConexao(), que abre conex�o com banco. 
	 * 
	 * @author Jos� George*/

	public static Connection getConexao() {
			
		Connection conn = null;
		
		try {
			String url = "jdbc:mysql://localhost/biblioteca";
			conn = DriverManager.getConnection(url, "root", "");
			
		} catch (SQLException e) {
			System.out.println("Erro ao conectar");
		}
		return conn;
		
	}

}
