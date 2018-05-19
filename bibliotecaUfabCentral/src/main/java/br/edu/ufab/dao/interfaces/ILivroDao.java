package br.edu.ufab.dao.interfaces;

import br.edu.ufab.model.acervo.Livro;

public interface ILivroDao extends IGenericDao<Livro> {
    public boolean removeLivro(int id);
    public boolean isLivroRegistered(int id);
    public Livro getLivro(int id);

}
