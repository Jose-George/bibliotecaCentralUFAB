package br.edu.ufab.acervo;

/*
 * @author Jose George
 * Classe TrabalhoDeConclusão
 * implementa ItemAcervo
 * */

public class TrabalhoDeConclusao implements ItemAcervo {
	
	private String tipo; /*TCC, tese ou Dissertação*/
	private String autor; 
	private String Orientador; 
	private String titulo; 
	private int anoDefesa; 
	private String local;
	
	public TrabalhoDeConclusao(String tipo, String orientador, String titulo, String autor, int anoDefesa,
			String local) {
		this.tipo = tipo;
		Orientador = orientador;
		this.titulo = titulo;
		this.autor = autor;
		this.anoDefesa = anoDefesa;
		this.local = local;
	}

	public String getTipo() {
		return tipo;
	}

	public String getOrientador() {
		return Orientador;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoDefesa() {
		return anoDefesa;
	}

	public String getLocal() {
		return local;
	}

}
