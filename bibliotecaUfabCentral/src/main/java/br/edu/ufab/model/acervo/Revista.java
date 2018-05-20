package br.edu.ufab.model.acervo;



import java.sql.Date;

import org.apache.log4j.Logger;

/**
 * @author Jose George e Caio Silva
 * Classe Revista
 * implementa ItemAcervo
 * */


public class Revista extends ItemDeAcervo{
	
	
	private String editora; 
	private int edicao; 
	private int numeroPagina;
	
	private static final Logger logger = Logger.getLogger(Revista.class);
	
	public Revista(int c, String titulo, String editora, Date dataPublicacao, int edicao, int numeroPagina) {
		logger.info("iniciando construtor");
		this.codigo =c;
		this.titulo = titulo;
		this.editora = editora;
		this.dataPublicacao = dataPublicacao;
		this.edicao = edicao;
		this.numeroPagina = numeroPagina;
	}


	
	public Revista(){
		
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

