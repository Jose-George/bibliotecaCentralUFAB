package br.edu.ufab.acervo;

public class Livro {

	private String isbn; 
	private String titulo; 
	private String autor; 
	private String editora; 
	private int anoPublicacao; 
	private int edicao; 
	private int numeroPagina; 
	private String areaDoConhecimento; 
	private String tema;
	
	public Livro(String isbn, String titulo, String autor, String editora, int anoPublicacao, int edicao,
			int numeroPagina, String areaDoConhecimento, String tema) {
		
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
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
