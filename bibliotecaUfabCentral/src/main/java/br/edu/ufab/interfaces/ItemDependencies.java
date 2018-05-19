package br.edu.ufab.interfaces;

import java.util.ArrayList;

public interface ItemDependencies<T> {
	public boolean create(T item); 
	public boolean remove(T item); 
	public boolean update(T item); 
	public ArrayList<T> searchAll(String id);
}
