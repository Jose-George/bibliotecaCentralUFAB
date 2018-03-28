package br.edu.ufab.acervo;

public class Livro implements ItemAcervo {

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

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditora() {
		return editora;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public int getEdicao() {
		return edicao;
	}

	public int getNumeroPagina() {
		return numeroPagina;
	}

	public String getAreaDoConhecimento() {
		return areaDoConhecimento;
	}

	public String getTema() {
		return tema;
	}

}
