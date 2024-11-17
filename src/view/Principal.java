package view;

import br.edu.fateczl.Arvore.Arvore;
import controller.ArvoreController;

public class Principal {

	public static void main(String[] args) {
		ArvoreController arvCont = new ArvoreController();
		int[] vetor = { 7, 8, 3, 4, 2, 1, 6, 5 };
		
		Arvore arvore = arvCont.insereElemento(vetor);
		
		try {
			arvore.remove(7);
			arvore.remove(6);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		arvCont.printElementos(arvore);
		
	}
}
