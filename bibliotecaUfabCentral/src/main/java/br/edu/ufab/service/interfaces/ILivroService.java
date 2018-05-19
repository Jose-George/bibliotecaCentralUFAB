package br.edu.ufab.service.interfaces;

import br.edu.ufab.model.acervo.Livro;

public interface ILivroService extends IGenericService<Livro> {
	public boolean removeLivro(int codigo);
    public boolean isLivroRegistered(int codigo);
    public Livro getAdmin(int codigo);
}
