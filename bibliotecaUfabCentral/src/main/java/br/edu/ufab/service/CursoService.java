package br.edu.ufab.service;

import java.util.List;



import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.edu.ufab.dao.CursoDao;
import br.edu.ufab.dao.interfaces.ICursoDao;
import br.edu.ufab.dao.interfaces.IGenericDao;
import br.edu.ufab.model.Curso;
import br.edu.ufab.service.exception.DuplicateItemException;
import br.edu.ufab.service.interfaces.ICursoService;

/**
 * CRUD de Cursos
 *
 * @author Caio Silva e Jose George
 * @version 1.0
 * @since 2018-05-15
 */

@Transactional
@Service
@Configuration
public class CursoService extends GenericServiceImplementation<Curso> implements ICursoService {

	private static final Logger logger = LogManager.getLogger(CursoService.class);
	
	private ICursoDao cursoDao;
    
	public CursoService(){
 
    }
    @Autowired
    public CursoService(
            @Qualifier("cursoDao") IGenericDao<Curso> genericDao) {
        super(genericDao);
        this.cursoDao = (ICursoDao) genericDao;
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
	public boolean removeCurso(String nome) {
    	return cursoDao.removeCurso(nome);
	}
    
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public boolean isCursoRegistered(String nome) {
    	return cursoDao.isCursoRegistered(nome);
	}

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public Curso getAdmin(String nome) {
    	return cursoDao.getCurso(nome);
	}

	
}
