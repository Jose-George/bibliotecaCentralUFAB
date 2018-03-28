package br.edu.ufab.acervo;

public class AnaisCongresso implements ItemAcervo {

	private String tipo; /*artigo, pôster, resumo*/
	private String titulo; 
	private String autor; 
	private String nomeDoCongresso; 
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

	public String getNomeDoCongresso() {
		return nomeDoCongresso;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public String getLocal() {
		return local;
	}
	
}
