package programas;

import java.util.ArrayList;
import java.util.List;

import entidades.Produtos;
import servico.Comparador;

public class ProgramaComparator {

	public static void main(String[] args) {
		
		
		List<Produtos> p = new ArrayList<>();
		
		
		p.add(new Produtos("Tv", 100.00));
		p.add(new Produtos("Notebook", 2000.00));
		p.add(new Produtos("Play 5", 5000.00));
		
		p.sort(new Comparador());
		
		
		
		for(Produtos pd: p) {
			System.out.println(pd);
		}

	}

}
