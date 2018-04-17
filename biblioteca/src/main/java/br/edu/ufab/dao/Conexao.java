package br.edu.ufab.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.tools.ant.Main;

public class Conexao {

	public static Connection getConexao() {

		Connection conn = null;

		try {
			String url = "jdbc:mysql://localhost/biblioteca";
			conn = DriverManager.getConnection(url, "root", "");
			System.out.println("Conexão aberta!");

		} catch (SQLException e) {
			System.err.println("Falha ao conectar com banco de dados\n" + e.getMessage());
		}
		return conn;
	}

	public static void main(String[] args) throws SQLException {

		Conexao.getConexao();
		// System.out.println("Conexão aberta!");

	}

}
