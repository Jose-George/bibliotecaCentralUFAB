package br.edu.ufab.interno;

import java.util.ArrayList;

public class SistemaInternoAcervo implements ItemAcervo {

	public ArrayList<Object> listaAcervo = new ArrayList<Object>();

	public void cadastrar(Object item) {
		listaAcervo.add(item);
	}

	public void editar(Object item, Object novoItem) throws Exception {
		if(listaAcervo.contains(item)){
			remover(item);
			listaAcervo.add(novoItem);
		}
	}

	public void remover(Object item) throws Exception {
		
		listaAcervo.remove(item);
		
	}

}
