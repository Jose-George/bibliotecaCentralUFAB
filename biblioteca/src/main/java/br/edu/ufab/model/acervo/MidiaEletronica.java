package br.edu.ufab.model.acervo;

import java.util.Date;
/*
 * @author Jose George
 * Classe MidiaEletronica
 * implementa ItemAcervo
 * */

import br.edu.ufab.model.acervo.enumerador.MidiaEnum;

public class MidiaEletronica extends ItemDeAcervo{


	private MidiaEnum tipo;
 	private int id;
 	
	public MidiaEletronica(MidiaEnum tipo, String titulo, Date dataGravacao) {
		this.tipo = tipo;
		this.titulo = titulo;
		this.dataPublicacao = (java.sql.Date) dataGravacao;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public MidiaEnum getTipo() {
		return tipo;
	}


	public void setTipo(MidiaEnum tipo) {
		this.tipo = tipo;
	}

	
}
