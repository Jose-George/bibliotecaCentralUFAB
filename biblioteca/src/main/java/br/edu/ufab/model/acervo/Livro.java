package br.edu.ufab.model.acervo;

import java.sql.Date;

/**
 * @author Jose George
 * Classe Livro
 * implementa ItemAcervo
 * */
public class Livro extends ItemDeAcervo{

	private String isbn; 
	private String autor; 
	private String editora;  
	private int edicao; 
	private int numeroPagina; 
	private String areaDoConhecimento; 
	private String tema;
	
	public Livro(String isbn, String titulo, String autor, String editora, Date dataPublicacao, int edicao,
			int numeroPagina, String areaDoConhecimento, String tema) {
		
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.dataPublicacao = dataPublicacao;
		this.edicao = edicao;
		this.numeroPagina = numeroPagina;
		this.areaDoConhecimento = areaDoConhecimento;
		this.tema = tema;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
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

	public String getAreaDoConhecimento() {
		return areaDoConhecimento;
	}

	public void setAreaDoConhecimento(String areaDoConhecimento) {
		this.areaDoConhecimento = areaDoConhecimento;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	
}
