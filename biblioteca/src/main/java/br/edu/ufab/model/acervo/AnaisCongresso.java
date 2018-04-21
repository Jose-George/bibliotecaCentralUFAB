package br.edu.ufab.model.acervo;

import java.sql.Date;

import org.apache.log4j.Logger;



/**
 * @author Jose George
 * Classe AnaisCogresso
 * implementa interface ItemAcervo
 * */
public class AnaisCongresso extends ItemDeAcervo{

	public enum AnaisEnum {
	ARTIGO, POSTER, RESUMO;
	}
	
	private AnaisEnum tipo;
	private String autor; 
	private String nomeDoCongresso; 
	private String local;    
	private int id;
	
	private static final Logger logger = Logger.getLogger(AnaisCongresso.class);
	
	
	public AnaisCongresso(AnaisEnum tipo, String nomeDoCongresso, String titulo, String autor, Date anoPublicacao,
			String local) {
		logger.info("iniciando construtor");
		this.tipo = tipo;
		this.nomeDoCongresso = nomeDoCongresso;
		this.titulo = titulo;
		this.autor = autor;
		this.dataPublicacao = anoPublicacao;
		this.local = local;
	}


	public AnaisEnum getTipo(){
		return tipo;
	}

	
	public void setTipo(AnaisEnum tipo) {
		logger.info("passando"+tipo);
		this.tipo = tipo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		logger.info("passando"+autor);
		this.autor = autor;
	}


	public String getNomeDoCongresso() {
		return nomeDoCongresso;
	}


	public void setNomeDoCongresso(String nomeDoCongresso) {
		logger.info("passando"+nomeDoCongresso);
		this.nomeDoCongresso = nomeDoCongresso;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		logger.info("passando"+local);
		this.local = local;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		logger.info("passando"+id);
		this.id = id;
	}
	
	
	
}
