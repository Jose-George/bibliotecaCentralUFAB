package br.edu.ufab.service.interfaces;

import java.util.List;

public interface IGenericService <E> {
	public void saveOrUpdate(E entity);
    public List<E> getAll();
    public E get(int id);
    public void add(E entity);
    public void update(E entity);
    public void remove(E entity);
}
