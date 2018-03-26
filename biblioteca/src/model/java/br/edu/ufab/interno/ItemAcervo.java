package br.edu.ufab.interno;

public interface ItemAcervo {
	
	public void cadastrar(Object item);
	public void editar(Object item, Object novoItem) throws Exception;
	public void remover(Object item) throws Exception
	;
	
}
