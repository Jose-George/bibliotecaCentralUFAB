package br.edu.ufab.acervo;

public class AnaisCongresso {

	private String tipo; /*artigo, pôster, resumo*/
	private String nomeDoCongresso; 
	private String titulo; 
	private String autor; 
	private int anoPublicacao; 
	private String local;
	
	public AnaisCongresso(String tipo, String nomeDoCongresso, String titulo, String autor, int anoPublicacao,
			String local) {
		this.tipo = tipo;
		this.nomeDoCongresso = nomeDoCongresso;
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.local = local;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNomeDoCongresso() {
		return nomeDoCongresso;
	}

	public void setNomeDoCongresso(String nomeDoCongresso) {
		this.nomeDoCongresso = nomeDoCongresso;
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

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
}
