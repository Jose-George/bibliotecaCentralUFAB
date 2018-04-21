package br.edu.ufab.model.acervo;

import java.sql.Date;

import org.apache.log4j.Logger;


/**
 * Essa Classe é usada para herença, todas as classes do acervo herdam ItemDeAcervo 
 * @author	José George	 
 * */

public class ItemDeAcervo {
	
	private static final Logger logger = Logger.getLogger(ItemDeAcervo.class);

	protected String titulo;
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
