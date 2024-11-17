package controller;

import br.edu.fateczl.Arvore.*;

public class ArvoreController {

	public Arvore insereElemento(int[] vetor) {
		Arvore arvore = new Arvore();
		for (int valor : vetor) {
			arvore.insert(valor);
		}
		return arvore;
	}
	
	public void printElementos(Arvore arvore) {
		try {
			System.out.print("Prefix: ");
			arvore.prefixSearch();
			System.out.println();
			System.out.print("Infix: ");
			arvore.infixSearch();
			System.out.println();
			System.out.print("Postfix: ");
			arvore.postfixSearch();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
