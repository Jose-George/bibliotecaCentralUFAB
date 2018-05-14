package br.edu.ufab.model.curso;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.apache.log4j.Logger;

import br.edu.ufab.model.enumerador.CursoEnum;

/**
 * A classe curso, ela contem um tipo de curso, que é um ENUM.
 * o tipo pode ser: graduação, pos-graduacao, mestrado, especializacao e doutorado.
 * 
 * Contém ainda os metódos gets e sets
 * 
 * @author José George e Caio Silva
 * */
@Entity
public class Curso {


	private String nome;
	private String area;
	@Column(unique = true, name = "SiglaCurso")
	private String siglaNomeCurso;
	
	private CursoEnum tipo;
	
	private static final Logger logger = Logger.getLogger(Curso.class);
	
	public String getSiglaNomeCurso() {
		return siglaNomeCurso;
	}

	public void setSiglaNomeCurso(String siglaNomeCurso) {
		logger.info("passando"+siglaNomeCurso);
		this.siglaNomeCurso = siglaNomeCurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		logger.info("passando"+nome);
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		logger.info("passando"+area);
		this.area = area;
	}

	public CursoEnum getTipo() {
		return tipo;
	}

	public void setTipo(CursoEnum tipo) {
		logger.info("passando"+tipo);
		this.tipo = tipo;
	}

}
