package br.edu.ufab.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import br.edu.ufab.dao.curso.CursoDAO;


//import org.apache.tools.ant.Main;

public class Conexao {

	public static Connection getConexao() {
		Logger logger = Logger.getLogger(CursoDAO.class);		

		Connection conn = null;
		
		logger.info("iniciando conexão com Banco de dados");

		try {
			String url = "jdbc:mysql://localhost/biblioteca";
			conn = DriverManager.getConnection(url, "root", "");
			logger.info("Conexão aberta!");
			//System.out.println("Conexão aberta!");

		} catch (SQLException e) {
			logger.error("Falha ao conectar com banco de dados\n", e);
			//System.err.println("Falha ao conectar com banco de dados\n" + e.getMessage());
		}
		return conn;
	}

	public static void main(String[] args) throws SQLException {

		Conexao.getConexao();
		// System.out.println("Conexão aberta!");

	}

}
