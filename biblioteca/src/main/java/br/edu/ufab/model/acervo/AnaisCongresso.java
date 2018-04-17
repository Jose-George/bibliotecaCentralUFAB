package br.edu.ufab.model.acervo;

import java.sql.Date;

import br.edu.ufab.model.acervo.enumerador.AnaisEnum;

/*
 * @author Jose George
 * Classe AnaisCogresso
 * implementa interface ItemAcervo
 * */
public class AnaisCongresso extends ItemDeAcervo{

	private AnaisEnum tipo;
	private String autor; 
	private String nomeDoCongresso; 
	private String local;    
	private int id;
	
	
	public AnaisCongresso(AnaisEnum tipo, String nomeDoCongresso, String titulo, String autor, Date anoPublicacao,
			String local) {
		this.tipo = tipo;
		this.nomeDoCongresso = nomeDoCongresso;
		this.titulo = titulo;
		this.autor = autor;
		this.dataPublicacao = anoPublicacao;
		this.local = local;
	}


	public AnaisEnum getTipo() {
		return tipo;
	}


	public void setTipo(AnaisEnum tipo) {
		this.tipo = tipo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getNomeDoCongresso() {
		return nomeDoCongresso;
	}


	public void setNomeDoCongresso(String nomeDoCongresso) {
		this.nomeDoCongresso = nomeDoCongresso;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
