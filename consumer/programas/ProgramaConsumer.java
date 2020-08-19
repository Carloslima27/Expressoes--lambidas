package programas;

import java.util.ArrayList;
import java.util.List;

import entidades.ProdutosConsumer;

public class ProgramaConsumer {

	public static void main(String[] args) {
		
		List<ProdutosConsumer> p = new ArrayList<>();
		p.add(new ProdutosConsumer("Tv", 900.00));
		p.add(new ProdutosConsumer("Notebook", 80.00));
		p.add(new ProdutosConsumer("Iphone", 50.00));
		
		//implementacao do Consume na classe AtualizarPreco!
		//p.forEach(new AtualizarPreco());
		
		//referancia de metodo com metodo estatico!
		//p.forEach(ProdutosConsumer::staticoProdutosConsumer);
		//referancia de metodo com metodo n�o estatico!
		//p.forEach(ProdutosConsumer::naoStaticoProdutosConsumer);
		//Express�o Lambda declarada "Classe an�nima!"
		//Consumer<ProdutosConsumer> pd = t -> t.setPreco(t.getPreco() * 1.1);
		//p.forEach(pd);
		//Express�o Labda de uma linha!
		p.forEach(x -> x.setPreco(x.getPreco() * 1.1));
		
		p.forEach(System.out::println);
		
		
	}

}
