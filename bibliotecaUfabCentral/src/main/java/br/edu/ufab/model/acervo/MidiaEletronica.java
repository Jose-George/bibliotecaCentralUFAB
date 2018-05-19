package br.edu.ufab.model.acervo;



import org.apache.log4j.Logger;

import br.edu.ufab.model.enumerador.MidiaEnum;

/**
 * Enum para especificar tipos de midia eletronica*/


/**
 * @author Jose George e Caio Silva
 * Classe MidiaEletronica
 * implementa ItemAcervo
 * */

public class MidiaEletronica extends ItemDeAcervo{
	
	private MidiaEnum tipo;
	
 	
 	private static final Logger logger = Logger.getLogger(MidiaEletronica.class);

	public MidiaEnum getTipo() {
		return tipo;
	}


	public void setTipo(MidiaEnum tipo) {
		logger.info("setando"+tipo);
		this.tipo = tipo;
	}

	
}
