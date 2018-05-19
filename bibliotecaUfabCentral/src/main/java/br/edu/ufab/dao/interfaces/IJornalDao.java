package br.edu.ufab.dao.interfaces;


import br.edu.ufab.model.acervo.Jornal;

public interface IJornalDao extends IGenericDao<Jornal> {
    public boolean removeJornal(int code);
    public boolean isJornalRegistered(int code);
    public Jornal getJornal(int code );
}
