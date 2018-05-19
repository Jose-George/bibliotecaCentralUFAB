package br.edu.ufab.model.acervo;

import java.sql.Date;
import org.apache.log4j.Logger;


/**
 * Classe usada como classe Pai de todas as classes do acervo
 * 
 * @author	Jose George e Caio Silva	 
 * */

public class ItemDeAcervo {
	
	private static final Logger logger = Logger.getLogger(ItemDeAcervo.class);
	
	protected int codigo;
	protected int id;
	protected String titulo;
	
	
	protected Date dataPublicacao;
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		logger.info("passando"+codigo);
		this.codigo = codigo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		logger.info("passando"+titulo);
		this.titulo = titulo;
	}
	
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	
	public void setDataPublicacao(Date dataPublicacao) {
		logger.info("passando"+dataPublicacao);
		this.dataPublicacao = dataPublicacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
