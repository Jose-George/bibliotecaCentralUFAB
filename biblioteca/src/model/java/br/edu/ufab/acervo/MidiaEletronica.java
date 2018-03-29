package br.edu.ufab.acervo;

import java.util.Date;
/*
 * @author Jose George
 * Classe MidiaEletronica
 * implementa ItemAcervo
 * */

public class MidiaEletronica implements ItemAcervo {

	private String titulo; 
	private String tipo; /*CD, DVD*/
 	private Date dataGravacao;
 	
	public MidiaEletronica(String tipo, String titulo, Date dataGravacao) {
		this.tipo = tipo;
		this.titulo = titulo;
		this.dataGravacao = dataGravacao;
	}

	public String getTipo() {
		return tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public Date getDataGravacao() {
		return dataGravacao;
	}

}
