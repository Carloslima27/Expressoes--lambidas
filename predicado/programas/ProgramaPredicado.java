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
		//Implementação da Interface predicate!
		p.removeIf(new Predicado());
		//Referencia de metodo com metodo statico!
		p.removeIf(Produtos3::staticoProdutoPredicado);
		//Referencia de metodo com metodo não statico!
		p.removeIf(Produtos3::naoStaticoProdutoPredicado);
		//expressão Lambda declarada!
		Predicate<Produtos3> pd = x -> 	x.getPreco() >= 100;
		p.removeIf(pd);
		
		//Expressão Lambda em uma linha!
		p.removeIf(x -> x.getPreco() >= 100);
		
		p.forEach(System.out::println);
	}

}
