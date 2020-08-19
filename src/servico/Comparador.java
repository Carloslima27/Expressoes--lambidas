package servico;

import java.util.Comparator;

import entidades.Produtos;

public class Comparador implements Comparator<Produtos>{

	@Override
	public int compare(Produtos p1, Produtos p2) {
		
		return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
	}



}
