package br.edu.ufab.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import br.edu.ufab.dao.AlunoDao;
import br.edu.ufab.model.Aluno;
import br.edu.ufab.service.exception.DuplicateItemException;
import javassist.NotFoundException;

/**
 * CRUD de Alunos
 *
 * @author Caio Silva e Jose George
 * @version 1.0
 * @since 2018-05-15
 */

@Transactional
@Service
@Configuration
public class AlunoService implements IService<Aluno> {

	private static final Logger logger = LogManager.getLogger(AlunoService.class);

	@Autowired
	private AlunoDao alunoDao;

	public void setAlunoDao(AlunoDao alunoDao) {
		this.alunoDao = alunoDao;
	}

	public List<Aluno> listAllRegisters() {
		logger.info("listando alunos");
		return alunoDao.listAllRegisters();
	}

	public boolean addRegister(Aluno aluno){
		if (alunoDao.isItemExist(aluno.getMatricula())) {
			try {
				throw new DuplicateItemException("aluno cadastrado");
			} catch (DuplicateItemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		logger.info("inserindo" + aluno);
		alunoDao.addRegister(aluno);
		return true;
	}

	public void updateRegister(Aluno aluno){
		logger.info("update em" + aluno);
		alunoDao.addRegister(aluno);
	}

	public Aluno getRegisterById(int id){
		logger.info("obtendo Aluno apartir do registro" + id);
		return alunoDao.getRegisterById(id);
	}

	public void removeRegister(int id){
		logger.info("removido aluno de id " + id);
		alunoDao.removeRegister(id);
	}

}
