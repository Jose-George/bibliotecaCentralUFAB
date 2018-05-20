package br.edu.ufab.model.acervo;



import java.sql.Date;

import org.apache.log4j.Logger;
import br.edu.ufab.model.enumerador.TrabalhoEnum;;

/**
 * Enum especificando tipos de trabalho de conclusão*/

/**
 * @author Jose George e Caio Silva
 * Classe TrabalhoDeConclusão
 * implementa ItemAcervo
 * */


public class TrabalhoDeConclusao extends ItemDeAcervo{
	
	private TrabalhoEnum tipo; 
	private String autor; 
	private String Orientador; 
	private String local;
	
	private static final Logger logger = Logger.getLogger(TrabalhoDeConclusao.class);


	public TrabalhoDeConclusao(int codigo,TrabalhoEnum tipo, String orientador, String titulo, String autor, Date anoDefesa,
			String local) {
		this.codigo = codigo;
		this.tipo = tipo;
		Orientador = orientador;
		this.titulo = titulo;
		this.autor = autor;
		this.dataPublicacao = anoDefesa;
		this.local = local;
	}
	
	public TrabalhoDeConclusao(){
		
	}
	
	
	public TrabalhoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TrabalhoEnum tipo) {
		logger.info("setando"+tipo);
		this.tipo = tipo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		logger.info("setando"+autor);
		this.autor = autor;
	}

	public String getOrientador() {
		return Orientador;
	}

	public void setOrientador(String orientador) {
		logger.info("setando"+orientador);
		Orientador = orientador;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		logger.info("setando"+local);
		this.local = local;
	}	

}
