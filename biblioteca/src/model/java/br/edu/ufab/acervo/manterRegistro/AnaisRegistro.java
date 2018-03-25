package br.edu.ufab.acervo.manterRegistro;

import java.util.ArrayList;

import br.edu.ufab.acervo.AnaisCongresso;

public class AnaisRegistro implements ItemAcervo {

	public static ArrayList<AnaisCongresso> listaAcervo;

	public AnaisRegistro() {
		listaAcervo = new ArrayList<AnaisCongresso>();
	}

	public void adicionarItem(Object item) {
		listaAcervo.add((AnaisCongresso) item);

	}

	public void excluirItem(Object item) {
		if (listaAcervo.contains(item)) {
			listaAcervo.remove(item);
		}
	}

	public void editarItem(Object itemAtual, Object novoItem) {
		if (listaAcervo.contains(itemAtual)) {
			listaAcervo.remove(itemAtual);
			adicionarItem(novoItem);
		}
		

	}

}
