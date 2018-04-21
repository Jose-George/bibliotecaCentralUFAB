package br.edu.ufab.model.acervo;

import java.sql.Date;

import org.apache.log4j.Logger;

//import java.util.Date;

/**
 * @author Jose George
 * Classe Revista
 * implementa ItemAcervo
 * */

public class Revista extends ItemDeAcervo{

	private int id;
	private String editora; 
	private int edicao; 
	private int numeroPagina;
	
	private static final Logger logger = Logger.getLogger(Revista.class);
	
	public Revista(String titulo, String editora, Date dataPublicacao, int edicao, int numeroPagina) {
		logger.info("iniciando construtor");
		this.titulo = titulo;
		this.editora = editora;
		this.dataPublicacao = dataPublicacao;
		this.edicao = edicao;
		this.numeroPagina = numeroPagina;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		logger.info("setando"+id);
		this.id = id;
	}


	public String getEditora() {
		
		return editora;
	}

	public void setEditora(String editora) {
		logger.info("setando"+editora);
		this.editora = editora;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		logger.info("setando"+edicao);
		this.edicao = edicao;
	}

	public int getNumeroPagina() {
		return numeroPagina;
	}

	public void setNumeroPagina(int numeroPagina) {
		logger.info("setando"+numeroPagina);
		this.numeroPagina = numeroPagina;
	}

	
}

