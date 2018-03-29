package br.edu.ufab.acervo;

//import java.util.Date;

/*
 * @author Jose George
 * Classe Revista
 * implementa ItemAcervo
 * */

public class Revista implements ItemAcervo {

	private String titulo; 
	private String editora; 
	private String dataPublicacao;
	private int edicao; 
	private int numeroPagina;
	
	public Revista(String titulo, String editora, String dataPublicacao, int edicao, int numeroPagina) {
		this.titulo = titulo;
		this.editora = editora;
		this.dataPublicacao = dataPublicacao;
		this.edicao = edicao;
		this.numeroPagina = numeroPagina;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getEditora() {
		return editora;
	}

	public String getDataPublicacao() {
		return dataPublicacao;
	}

	public int getEdicao() {
		return edicao;
	}

	public int getNumeroPagina() {
		return numeroPagina;
	}
	
}

