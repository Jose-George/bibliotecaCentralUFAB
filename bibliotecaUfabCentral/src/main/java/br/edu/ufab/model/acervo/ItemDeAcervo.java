package br.edu.ufab.model.acervo;

import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.log4j.Logger;


/**
 * Classe usada como classe Pai de todas as classes do acervo
 * 
 * @author	Jose George e Caio Silva	 
 * */
@MappedSuperclass
public class ItemDeAcervo {
	
	private static final Logger logger = Logger.getLogger(ItemDeAcervo.class);
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected int id;
	
	protected String titulo;
	
	@Temporal(TemporalType.DATE)
	protected Date dataPublicacao;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		logger.info("passando"+id);
		this.id = id;
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
	
	
	
	
}
