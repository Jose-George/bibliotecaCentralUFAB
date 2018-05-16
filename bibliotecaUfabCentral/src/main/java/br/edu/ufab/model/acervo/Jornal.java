package br.edu.ufab.model.acervo;

import javax.persistence.Entity;
import org.apache.log4j.Logger;

/**
 * @author Jose George e Caio Silva
 * 
 * Classe Jornal
 * implementa interface ItemAcervo
 * */

@Entity
public class Jornal extends ItemDeAcervo{

	private int edicao;
	
	private static final Logger logger = Logger.getLogger(Jornal.class);
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		logger.info("passando"+id);
		this.id = id;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		logger.info("passando"+edicao);
		this.edicao = edicao;
	}
	
}
