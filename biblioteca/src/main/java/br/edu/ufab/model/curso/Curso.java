package br.edu.ufab.model.curso;

public class Curso {

	public enum CursoEnum {
		GRADUACAO, POS_GRADUACAO;
	}

	private String nome;
	private String area;
	private CursoEnum tipo;

	public Curso(String nome, String area, CursoEnum tipo) {
		this.nome = nome;
		this.area = area;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public CursoEnum getTipo() {
		return tipo;
	}

	public void setTipo(CursoEnum tipo) {
		this.tipo = tipo;
	}

}
