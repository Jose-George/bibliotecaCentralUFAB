package br.edu.ufab.acervo;

import java.util.Date;

public class Jornal {

	private String titulo;  
	private Date dataPublicacao;
	private int edicao;
	
	
	public Jornal(String titulo, Date dataPublicacao, int edicao) {
		this.titulo = titulo;
		this.dataPublicacao = dataPublicacao;
		this.edicao = edicao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

}
