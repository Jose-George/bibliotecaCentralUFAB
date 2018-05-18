package br.edu.ufab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.log4j.Logger;

import br.edu.ufab.model.enumerador.CursoEnum;

/**
 * 
 * 
 * @author Jose George e Caio Silva
 * */
@Entity
public class Curso {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String nome;
	private String area;
	@Column(unique = true, name = "SiglaCurso")
	private String siglaNomeCurso;
	
	private CursoEnum tipo;
	
	private static final Logger logger = Logger.getLogger(Curso.class);
	
	public int getId() {
		return id;
	}
	
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
