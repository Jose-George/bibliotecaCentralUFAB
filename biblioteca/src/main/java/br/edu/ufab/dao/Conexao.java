package br.edu.ufab.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;


public class Conexao {
	
	/**
	 * Essa classe é responsavel por fazer a conexão do Software(JAVA) ao Banco(MySQL)
	 * Temos um metodo estatico getConexao(), que abre conexão com banco. 
	 * 
	 * @author José George*/
	
	private static final Logger logger = Logger.getLogger(Conexao.class);
	
	

	public static Connection getConexao() {		

		Connection conn = null;
		
		logger.info("iniciando conexão com Banco de dados");

		try {
			String url = "jdbc:mysql://localhost/biblioteca";
			conn = DriverManager.getConnection(url, "root", "");
			logger.info("Conexão aberta!");

		} catch (SQLException e) {
			logger.error("Falha ao conectar com banco de dados\n", e);
		}
		return conn;
		
	}


}
