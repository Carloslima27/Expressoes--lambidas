package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entidades.Produtos4;



public class ProgramaFuncao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Produtos4> listaP = new ArrayList<>();
		
		listaP.add(new Produtos4("Tv", 900.00));
		listaP.add(new Produtos4("Notebook", 1550.00));
		listaP.add(new Produtos4("Iphone", 3355.00));
		listaP.add(new Produtos4("Tablet", 1000.00));
		//implementação da interface Function em uma classe e instanciando em Map
		//List<String> nome = listaP.stream().map(new UpperCaseNome()).collect(Collectors.toList());
		
		// referência de metodo com metodo estatico
		//List<String> nome = listaP.stream().map(Produtos4::staticFunction).collect(Collectors.toList());
		
		//referência de metodo com metodo não estatico
		//List<String> nome = listaP.parallelStream().map(Produtos4::naoStaticFunction).collect(Collectors.toList());
		
		//Expressão Lambda declarada
		//Function<Produtos4, String> ps = p -> p.getNome().toUpperCase();
		//List<String> nome = listaP.stream().map(ps).collect(Collectors.toList());
		
		//Expressão Lambda em uma linha
		List<String> nome = listaP.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());
		
		nome.forEach(System.out::println);
		
		
		
		

	}

}
