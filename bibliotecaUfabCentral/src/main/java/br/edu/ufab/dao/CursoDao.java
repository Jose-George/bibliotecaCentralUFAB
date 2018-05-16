package br.edu.ufab.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import br.edu.ufab.model.Curso;

/**
* Classe que faz operacoes diretamente na Tabela Curso
* @author Caio Silva e Jose George
* @version 1.0
* @since   2018-05-13
*/
public class CursoDao implements IDao<Curso> {
	
	private HibernateTemplate hibernateTemplate;

	/**
	* Lista todos objetos da tabela Curso
	* @return List<Curso>
	*/
	@SuppressWarnings("unchecked")
	public List<Curso> listAllRegisters() {
		return (List<Curso>) hibernateTemplate.find("FROM Curso as curso ORDER BY curso.id");
	}
	/**
	* insere curso na tabela 
	* @return void
	*/
	public void addRegister(Curso curso) {		
		hibernateTemplate.save(curso);
	}
	
	/**
	* remove instancia de curso pelo id
	* @return void
	*/
	public void removeRegister(int id) {
		hibernateTemplate.delete(getRegisterById(id));
	}
	
	/**
	* Update no curso
	* @return void
	*/
	public void updateRegister(Curso curso) {		
		hibernateTemplate.update(curso);
	}
	
	/**
	* Lista registro pelo id
	* @return retorna um curso
	*/
	public Curso getRegisterById(int id) {
		return hibernateTemplate.get(Curso.class, id);
	}

}
