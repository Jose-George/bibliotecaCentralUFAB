package br.edu.ufab.dao.implementation;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.ufab.dao.interfaces.IGenericDao;

@SuppressWarnings("unchecked")
@Repository
public abstract class GenericDaoImplementation<E> 
        implements IGenericDao<E> {
    @Autowired
    private SessionFactory sessionFactory;
     
    protected Class<E> daoType;
     
    /**
    * By defining this class as abstract, we prevent Spring from creating 
    * instance of this class If not defined as abstract, 
    * getClass().getGenericSuperClass() would return Object. There would be 
    * exception because Object class does not hava constructor with parameters.
    */
    public GenericDaoImplementation() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        daoType = (Class) pt.getActualTypeArguments()[0];
    }
     
    protected Session currentSession() {
        return sessionFactory.getCurrentSession();
    }
     
    public void add(E entity) {
        currentSession().save(entity);
    }
     
  
    public void saveOrUpdate(E entity) {
        currentSession().saveOrUpdate(entity);
    }
     

    public void update(E entity) {
        currentSession().saveOrUpdate(entity);
    }
     
    
    public void remove(E entity) {
        currentSession().delete(entity);
    }
     

    public E find(int key) {
        return (E) currentSession().get(daoType, key);
    }
     
   
    public List<E> getAll() {
        return currentSession().createCriteria(daoType).list();
    }
}
