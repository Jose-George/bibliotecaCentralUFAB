package br.edu.ufab.model.acervo;

import java.util.Date;

import org.apache.log4j.Logger;

/**
 * @author Jose George
 * 
 * Classe Jornal
 * implementa interface ItemAcervo
 * */
public class Jornal extends ItemDeAcervo{

	private int id;
	private int edicao;
	
	private static final Logger logger = Logger.getLogger(Jornal.class);
	
	public Jornal(String titulo, Date dataPublicacao, int edicao) {
		this.titulo = titulo;
		this.dataPublicacao = (java.sql.Date) dataPublicacao;
		this.edicao = edicao;
	}

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
