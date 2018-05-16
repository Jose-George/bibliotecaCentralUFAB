package br.edu.ufab.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import br.edu.ufab.model.acervo.Livro;

public class LivroDao implements IDao<Livro> {
	
	private HibernateTemplate hibernateTemplate;

	/**
	* Lista todos objetos da tabela Livro
	* @return List<Livro>
	*/
	@SuppressWarnings("unchecked")
	public List<Livro> listAllRegisters() {
		return (List<Livro>) hibernateTemplate.find("FROM Livro as livro ORDER BY livro.id");
	}
	/**
	* insere Livro na tabela 
	* @return void
	*/
	public void addRegister(Livro livro) {		
		hibernateTemplate.save(livro);
	}
	
	/**
	* remove instancia de Livro pelo id
	* @return void
	*/
	public void removeRegister(int id) {
		hibernateTemplate.delete(getRegisterById(id));
	}
	
	/**
	* Update no Livro
	* @return void
	*/
	public void updateRegister(Livro livro) {		
		hibernateTemplate.update(livro);
	}
	
	/**
	* Lista registro pelo id
	* @return retorna um Livro
	*/
	public Livro getRegisterById(int id) {
		return hibernateTemplate.get(Livro.class, id);
	}
}
