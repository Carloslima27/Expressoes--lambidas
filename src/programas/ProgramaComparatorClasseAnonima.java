package programas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entidades.Produtos;

public class ProgramaComparatorClasseAnonima {

	public static void main(String[] args) {
		
		
		List<Produtos> pd = new ArrayList<>();
		
		
		pd.add(new Produtos("Tv", 100.00));
		pd.add(new Produtos("Notebook", 2000.00));
		pd.add(new Produtos("Play 5", 5000.00));
		
		Comparator<Produtos> comp = new Comparator<Produtos>() {

			@Override
			public int compare(Produtos p1, Produtos p2) {
				
				return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
			}
			
		};
		
		pd.sort(comp);
		
		
		
		for(Produtos ps: pd) {
			System.out.println(ps);
		}

	}

}
