package br.edu.ufab.model.acervo;

import java.sql.Date;

public class ItemDeAcervo {

	protected String titulo;
	protected Date dataPublicacao;
	
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
	
	
	
	
}
