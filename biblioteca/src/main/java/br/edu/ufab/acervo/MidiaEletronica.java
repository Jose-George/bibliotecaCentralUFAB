package br.edu.ufab.acervo;

import java.util.Date;

public class MidiaEletronica {

	private String tipo; /*CD, DVD*/
 	private String titulo; 
 	private Date dataGravacao;
 	
	public MidiaEletronica(String tipo, String titulo, Date dataGravacao) {
		this.tipo = tipo;
		this.titulo = titulo;
		this.dataGravacao = dataGravacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataGravacao() {
		return dataGravacao;
	}

	public void setDataGravacao(Date dataGravacao) {
		this.dataGravacao = dataGravacao;
	} 
 	
	
 	
 	
}
