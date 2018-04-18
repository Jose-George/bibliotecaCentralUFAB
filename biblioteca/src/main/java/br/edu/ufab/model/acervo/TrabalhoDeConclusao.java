package br.edu.ufab.model.acervo;

import java.sql.Date;

import br.edu.ufab.model.acervo.enumerador.TrabalhoEnum;

/*
 * @author Jose George
 * Classe TrabalhoDeConclusão
 * implementa ItemAcervo
 * */

public class TrabalhoDeConclusao extends ItemDeAcervo{
	
	private int id;
	private TrabalhoEnum tipo; 
	private String autor; 
	private String Orientador; 
	private String local;
	
	public TrabalhoDeConclusao(TrabalhoEnum tipo, String orientador, String titulo, String autor, Date anoDefesa,
			String local) {
		this.tipo = tipo;
		Orientador = orientador;
		this.titulo = titulo;
		this.autor = autor;
		this.dataPublicacao = anoDefesa;
		this.local = local;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TrabalhoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TrabalhoEnum tipo) {
		this.tipo = tipo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getOrientador() {
		return Orientador;
	}

	public void setOrientador(String orientador) {
		Orientador = orientador;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	
	
	

}
