package br.edu.ufab.model.acervo;

import java.sql.Date;

//import java.util.Date;

/*
 * @author Jose George
 * Classe Revista
 * implementa ItemAcervo
 * */

public class Revista extends ItemDeAcervo{

	
	private String editora; 
	private int edicao; 
	private int numeroPagina;
	
	public Revista(String titulo, String editora, Date dataPublicacao, int edicao, int numeroPagina) {
		this.titulo = titulo;
		this.editora = editora;
		this.dataPublicacao = dataPublicacao;
		this.edicao = edicao;
		this.numeroPagina = numeroPagina;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public int getNumeroPagina() {
		return numeroPagina;
	}

	public void setNumeroPagina(int numeroPagina) {
		this.numeroPagina = numeroPagina;
	}

	
}

