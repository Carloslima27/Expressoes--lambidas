package entidades;

import java.util.function.Predicate;

public class Predicado implements Predicate<Produtos3>{

	@Override
	public boolean test(Produtos3 p) {
		
		return p.getPreco() >= 100;
	}

	

}
