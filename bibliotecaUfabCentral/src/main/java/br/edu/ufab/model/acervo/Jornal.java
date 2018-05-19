package br.edu.ufab.model.acervo;


import org.apache.log4j.Logger;

/**
 * @author Jose George e Caio Silva
 * 
 * Classe Jornal
 * implementa interface ItemAcervo
 * */


public class Jornal extends ItemDeAcervo{

	private int edicao;
	
	private static final Logger logger = Logger.getLogger(Jornal.class);
	


	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		logger.info("passando"+edicao);
		this.edicao = edicao;
	}
	
}
