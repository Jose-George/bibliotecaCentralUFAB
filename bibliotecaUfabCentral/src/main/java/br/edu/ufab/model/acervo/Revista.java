package br.edu.ufab.model.acervo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.log4j.Logger;

/**
 * @author Jose George e Caio Silva
 * Classe Revista
 * implementa ItemAcervo
 * */

@Entity
public class Revista extends ItemDeAcervo{
	
	@Id
	private int id;
	private String editora; 
	private int edicao; 
	private int numeroPagina;
	
	private static final Logger logger = Logger.getLogger(Revista.class);
	
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

