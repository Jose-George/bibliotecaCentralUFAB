package br.edu.ufab.model.acervo;


import java.sql.Date;

import org.apache.log4j.Logger;

import br.edu.ufab.model.enumerador.AnaisEnum;



/**
 * @author Jose George e Caio Silva
 * Classe AnaisCogresso
 * implementa interface ItemAcervo
 * */

public class AnaisCongresso extends ItemDeAcervo{

	
	
	private AnaisEnum tipo;
	private String autor; 
	private String nomeDoCongresso; 
	private String local;    
	
	public AnaisCongresso(int codigo,AnaisEnum tipo, String nomeDoCongresso, String titulo, String autor, Date anoPublicacao,
			String local){
		
		this.tipo = tipo;
		this.nomeDoCongresso = nomeDoCongresso;
		this.titulo = titulo;
		this.autor = autor;
		this.dataPublicacao = anoPublicacao;
		this.local = local;
		this.codigo = codigo;
	}
	
	public AnaisCongresso(){
		
	}
	
	private static final Logger logger = Logger.getLogger(AnaisCongresso.class);

	public AnaisEnum getTipo(){
		logger.info("getTipo sendo chamado");
		return tipo;
	}

	
	public void setTipo(AnaisEnum tipo) {
		logger.info("passando"+tipo);
		this.tipo = tipo;
	}


	public String getAutor() {
		logger.info("getAutor sendo chamado");
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



	
	
	
}
