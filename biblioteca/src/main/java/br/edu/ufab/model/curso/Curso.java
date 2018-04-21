package br.edu.ufab.model.curso;

public class Curso {

	public enum CursoEnum {
		GRADUACAO, POS_GRADUACAO, MESTRADO, ESPECIALIZACAO, DOUTORADO;
	}

	private String nome;
	private String area;
	private String siglaNomeCurso;
	
	private CursoEnum tipo;

	public Curso(String nome, String area,String sigla ,CursoEnum tipo) {
		this.nome = nome;
		this.area = area;
		this.siglaNomeCurso = sigla;
		this.tipo = tipo;
	}

	
	public String getSiglaNomeCurso() {
		return siglaNomeCurso;
	}

	public void setSiglaNomeCurso(String siglaNomeCurso) {
		this.siglaNomeCurso = siglaNomeCurso;
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
