package br.edu.ufab.model.acervo;

import java.util.Date;

/*
 * @author Jose George
 * 
 * Classe Jornal
 * implementa interface ItemAcervo
 * */
public class Jornal extends ItemDeAcervo{

	private int id;
	private int edicao;
	
	
	public Jornal(String titulo, Date dataPublicacao, int edicao) {
		this.titulo = titulo;
		this.dataPublicacao = (java.sql.Date) dataPublicacao;
		this.edicao = edicao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
}
