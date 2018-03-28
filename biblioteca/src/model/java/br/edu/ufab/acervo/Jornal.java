package br.edu.ufab.acervo;

import java.util.Date;

public class Jornal implements ItemAcervo {

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

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public int getEdicao() {
		return edicao;
	}


}
