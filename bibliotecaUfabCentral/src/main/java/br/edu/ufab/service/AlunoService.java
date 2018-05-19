package br.edu.ufab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.edu.ufab.dao.interfaces.IAlunoDao;
import br.edu.ufab.dao.interfaces.IGenericDao;
import br.edu.ufab.model.Aluno;
import br.edu.ufab.service.interfaces.IAlunoService;


/**
 * CRUD de Alunos
 *
 * @author Caio Silva e Jose George
 * @version 1.0
 * @since 2018-05-15
 */

@Service
public class AlunoService extends GenericServiceImplementation<Aluno> implements IAlunoService {

	private IAlunoDao alunoDao;
    
	public AlunoService(){
 
    }
	
    @Autowired
    public AlunoService(		
            @Qualifier("alunoDao") IGenericDao<Aluno> genericDao) {
        super(genericDao);
        this.alunoDao = (IAlunoDao) genericDao;
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
	public boolean removeAluno(String matricula) {
    	return alunoDao.removeAluno(matricula);
	}
    
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public boolean isAlunoRegistered(String matricula) {
    	return alunoDao.isAlunoRegistered(matricula);
	}
    
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public Aluno getAluno(String matricula) {
    	return alunoDao.getAluno(matricula);
	}

	
}
