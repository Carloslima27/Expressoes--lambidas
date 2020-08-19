package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entidades.Predicado;
import entidades.Produtos3;

public class ProgramaPredicado {

	public static void main(String[] args) {
		
		List<Produtos3> p = new ArrayList<>();
		p.add(new Produtos3("Tv", 900.00));
		p.add(new Produtos3("Notebook", 80.00));
		p.add(new Produtos3("Iphone", 50.00));
		//Implementa��o da Interface predicate!
		p.removeIf(new Predicado());
		//Referencia de metodo com metodo statico!
		p.removeIf(Produtos3::staticoProdutoPredicado);
		//Referencia de metodo com metodo n�o statico!
		p.removeIf(Produtos3::naoStaticoProdutoPredicado);
		//express�o Lambda declarada!
		Predicate<Produtos3> pd = x -> 	x.getPreco() >= 100;
		p.removeIf(pd);
		
		//Express�o Lambda em uma linha!
		p.removeIf(x -> x.getPreco() >= 100);
		
		p.forEach(System.out::println);
	}

}
