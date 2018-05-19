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
	protected int codigo;
	
	protected String titulo;
	
	@Temporal(TemporalType.DATE)
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
	
	
	
	
}
