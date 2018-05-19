package br.edu.ufab.dao.interfaces;

import br.edu.ufab.model.acervo.MidiaEletronica;

public interface IMidiaDao extends IGenericDao<MidiaEletronica> {
	public boolean removeMidia(int codigo);
    public boolean isMidiaRegistered(int codigo);
    public MidiaEletronica getMidia(int codigo);
}
