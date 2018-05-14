package br.edu.ufab.model.acervo;

import java.sql.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.log4j.Logger;


/**
 * Essa Classe é usada como classe Pai de todas as classes do acervo
 * 
 * @author	José George e Caio Silva	 
 * */

public class ItemDeAcervo {
	
	private static final Logger logger = Logger.getLogger(ItemDeAcervo.class);

	protected String titulo;
	
	@Temporal(TemporalType.DATE)
	protected Date dataPublicacao;
	
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
	
	
	
	
}
