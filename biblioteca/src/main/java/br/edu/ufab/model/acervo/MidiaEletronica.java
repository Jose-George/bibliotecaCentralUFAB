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
 	
 	
	public MidiaEletronica(MidiaEnum tipo, String titulo, Date dataGravacao) {
		this.tipo = tipo;
		this.titulo = titulo;
		this.dataPublicacao = (java.sql.Date) dataGravacao;
	}


	public MidiaEnum getTipo() {
		return tipo;
	}


	public void setTipo(MidiaEnum tipo) {
		this.tipo = tipo;
	}

	
}
