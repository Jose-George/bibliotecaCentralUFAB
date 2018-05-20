package br.edu.ufab.model;



import org.apache.log4j.Logger;

import br.edu.ufab.model.enumerador.CursoEnum;

/**
 * 
 * 
 * @author Jose George e Caio Silva
 * */

public class Curso {
	
	
	
	private int id;
	private int codigo;
	private String nome;
	private String area;
	
	private String siglaNomeCurso;
	
	private CursoEnum tipo;
	
	private static final Logger logger = Logger.getLogger(Curso.class);
	
	public Curso(){
		
	}
	
	public Curso(int cod,String nome, String area,String sigla ,CursoEnum tipo) {
		logger.info("iniciando construtor");
		this.codigo = cod;
		this.nome = nome;
		this.area = area;
		this.siglaNomeCurso = sigla;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}
	
	public static Logger getLogger() {
		return logger;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
