package programas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entidades.Produtos;

public class ProgramaComparatorLambda {

	public static void main(String[] args) {
		
		
		List<Produtos> p = new ArrayList<>();
		
		
		p.add(new Produtos("Tv", 100.00));
		p.add(new Produtos("Notebook", 2000.00));
		p.add(new Produtos("Play 5", 5000.00));
		
		Comparator<Produtos> comp = (p1, p2) -> {
			return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
		};
		
		p.sort(comp);
		
		
		
		for(Produtos pd: p) {
			System.out.println(pd);
		}

	}

}
