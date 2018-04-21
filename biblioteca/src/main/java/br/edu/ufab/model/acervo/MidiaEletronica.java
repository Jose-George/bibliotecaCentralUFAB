package br.edu.ufab.model.acervo;

import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Enum para especificar tipos de midia eletronica*/


/**
 * @author Jose George
 * Classe MidiaEletronica
 * implementa ItemAcervo
 * */

public class MidiaEletronica extends ItemDeAcervo{
	
	public enum MidiaEnum {
		CD,DVD;
	}

	private MidiaEnum tipo;
 	private int id;
 	
 	private static final Logger logger = Logger.getLogger(MidiaEletronica.class);
 	
	public MidiaEletronica(MidiaEnum tipo, String titulo, Date dataGravacao) {
		this.tipo = tipo;
		this.titulo = titulo;
		this.dataPublicacao = (java.sql.Date) dataGravacao;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		logger.info("setando"+id);
		this.id = id;
	}


	public MidiaEnum getTipo() {
		return tipo;
	}


	public void setTipo(MidiaEnum tipo) {
		logger.info("setando"+tipo);
		this.tipo = tipo;
	}

	
}
