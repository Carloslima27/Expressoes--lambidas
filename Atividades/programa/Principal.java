 package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import entidades.ProdutosNew;

public class Principal {

	public static void main(String[] args) {
		List<ProdutosNew> p = new ArrayList<>();
		
		String caminho = "C:\\Users\\Luzia\\Documents\\Texto Java\\new paste\\Produtos.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
			String linha = br.readLine();
			while(linha != null) {
				String[] separa = linha.split(",");
				p.add(new ProdutosNew(separa[0], Double.parseDouble(separa[1])));
				linha = br.readLine();
				
			}
			
			double media =  p.stream().map(x -> x.getPreco()).reduce( 0.0, (x, y)-> x + y) / p.size();
			System.out.printf("Media: %.2f%n",media);
			
			Comparator<String> comp = (a, b)-> a.toUpperCase().compareTo(b.toUpperCase());
			Stream<String> str1 = p.stream().filter(x -> x.getPreco() < media).map(x -> x.getNome()).sorted(comp.reversed());
			
			str1.forEach(System.out::println);
		}catch(IOException e) {
			System.out.println("Erro"+ e);
		}

	}

}
