package br.edu.ufab.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import br.edu.ufab.dao.CursoDao;

import br.edu.ufab.model.Curso;

/**
* CRUD de Cursos
*
* @author  Caio Silva e Jose George
* @version 1.0
* @since   2018-05-15
*/

@Transactional
@Service
@Configuration
public class CursoService implements IService<Curso> {

	private static final Logger logger = LogManager.getLogger(CursoService.class);
	
	@Autowired
	private CursoDao cursoDao;
	
	public void setCursoDao(CursoDao cursoDao) {
		this.cursoDao = cursoDao;
	}
	
	public List<Curso> listAllRegisters() {
		logger.info("listando cursos");
		return cursoDao.listAllRegisters();
	}

	public void addRegister(Curso curso) {
		logger.info("inserindo"+curso);
		cursoDao.addRegister(curso);
		
	}

	public void updateRegister(Curso curso) {
		logger.info("update em"+curso);
		cursoDao.addRegister(curso);		
	}

	public Curso getRegisterById(int id) {
		logger.info("obtendo Curso apartir do registro"+id);
		return cursoDao.getRegisterById(id);		
	}

	public void removeRegister(int id) {
		logger.info("removendo curso de id "+id);
		cursoDao.removeRegister(id);
		
	}

}
