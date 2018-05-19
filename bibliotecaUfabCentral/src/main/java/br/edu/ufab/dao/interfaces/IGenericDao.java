package br.edu.ufab.dao.interfaces;

import java.util.List;

public interface IGenericDao<E> {
	public void add(E entity) ;
    public void saveOrUpdate(E entity) ;
    public void update(E entity) ;
    public void remove(E entity);
    public E find(int key);
    public List<E> getAll() ;
}
