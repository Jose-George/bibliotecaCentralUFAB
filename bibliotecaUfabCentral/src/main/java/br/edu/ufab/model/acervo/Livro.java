package br.edu.ufab.model.acervo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.log4j.Logger;

/**
 * @author Jose George e Caio Silva
 * Classe Livro
 * implementa ItemAcervo
 * */

@Entity
public class Livro extends ItemDeAcervo{
	
	private String isbn; 
	private String autor; 
	private String editora;  
	private int edicao; 
	private int numeroPagina; 
	private String areaDoConhecimento; 
	private String tema;
	
	private static final Logger logger = Logger.getLogger(Livro.class);

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		logger.info("setando"+isbn);
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		logger.info("setando"+autor);
		this.autor = autor;
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

	public String getAreaDoConhecimento() {
		return areaDoConhecimento;
	}

	public void setAreaDoConhecimento(String areaDoConhecimento) {
		logger.info("setando"+areaDoConhecimento);
		this.areaDoConhecimento = areaDoConhecimento;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		logger.info("setando"+tema);
		this.tema = tema;
	}
	
	
}
