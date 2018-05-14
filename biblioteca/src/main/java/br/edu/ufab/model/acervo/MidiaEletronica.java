package br.edu.ufab.model.acervo;


import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.log4j.Logger;

import br.edu.ufab.model.enumerador.MidiaEnum;

/**
 * Enum para especificar tipos de midia eletronica*/


/**
 * @author Jose George e Caio Silva
 * Classe MidiaEletronica
 * implementa ItemAcervo
 * */

@Entity
public class MidiaEletronica extends ItemDeAcervo{
	
	private MidiaEnum tipo;
	@Id
	private int id;
 	
 	private static final Logger logger = Logger.getLogger(MidiaEletronica.class);
	
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
