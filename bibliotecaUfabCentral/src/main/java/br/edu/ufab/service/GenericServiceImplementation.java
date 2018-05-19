package br.edu.ufab.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.edu.ufab.dao.interfaces.IGenericDao;
import br.edu.ufab.service.interfaces.IGenericService;

@Service
public abstract class GenericServiceImplementation<E> 
        implements IGenericService<E> {
 
    private IGenericDao<E> genericDao;
 
    public GenericServiceImplementation(IGenericDao<E> genericDao) {
        this.genericDao=genericDao;
    }
 
    public GenericServiceImplementation() {
    }
 
   
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveOrUpdate(E entity) {
        genericDao.saveOrUpdate(entity);
    }
 

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<E> getAll() {
        return genericDao.getAll();
    }
 
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public E get(int id) {
        return genericDao.find(id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void add(E entity) {
        genericDao.add(entity);
    }
 
    @Transactional(propagation = Propagation.REQUIRED)
    public void update(E entity) {
        genericDao.update(entity);
    }
 
    @Transactional(propagation = Propagation.REQUIRED)
    public void remove(E entity) {
        genericDao.remove(entity);
    }
}
