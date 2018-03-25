package br.edu.ufab.acervo.manterRegistro;

import java.util.ArrayList;

public interface ItemAcervo {
	
	/*public ArrayList<Object> itemAcervo = new ArrayList<Object>();*/
	public void adicionarItem(Object item); 
	public void editarItem(Object itemAtual, Object novoItem);
	public void excluirItem(Object item); 
	
}
