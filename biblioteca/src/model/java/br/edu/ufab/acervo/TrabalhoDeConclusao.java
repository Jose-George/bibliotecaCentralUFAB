package br.edu.ufab.acervo;

public class TrabalhoDeConclusao {
	
	private String tipo; /*TCC, Dissertação*/
	private String Orientador; 
	private String titulo; 
	private String autor; 
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

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOrientador() {
		return Orientador;
	}

	public void setOrientador(String orientador) {
		Orientador = orientador;
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

	public int getAnoDefesa() {
		return anoDefesa;
	}

	public void setAnoDefesa(int anoDefesa) {
		this.anoDefesa = anoDefesa;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

}
