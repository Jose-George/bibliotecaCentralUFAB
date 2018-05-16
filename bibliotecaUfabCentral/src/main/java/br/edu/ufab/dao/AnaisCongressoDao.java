package br.edu.ufab.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import br.edu.ufab.model.acervo.AnaisCongresso;

public class AnaisCongressoDao implements IDao<AnaisCongresso> {
	
	private HibernateTemplate hibernateTemplate;
	
	/**
	* Lista todos objetos da tabela Curso
	* @return List<Curso>
	*/
	@SuppressWarnings("unchecked")
	public List<AnaisCongresso> listAllRegisters() {
		return (List<AnaisCongresso>) hibernateTemplate.find("FROM AnaisCongresso as anais ORDER BY anais.id");
	}
	
	/**
	* insere curso na tabela 
	* @return void
	*/
	public void addRegister(AnaisCongresso anais) {
		hibernateTemplate.save(anais);
		
	}
	
	/**
	* Update no curso
	* @return void
	*/
	public void updateRegister(AnaisCongresso anais) {
		hibernateTemplate.update(anais);	
	}
	
	/**
	* Retorna registro pelo id
	* @return retorna um Anal de Congresso
	*/
	public AnaisCongresso getRegisterById(int id) {
		return hibernateTemplate.get(AnaisCongresso.class, id);
	}
	
	/**
	* remove instancia de curso pelo id
	* @return void
	*/
	public void removeRegister(int id) {
		hibernateTemplate.delete(getRegisterById(id));
		
	}

}
