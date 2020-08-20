package programa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal1 {

	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(2, 5 , 4, 8);
		Stream<Integer> str1 = lista.stream().map(x -> x * 2);
		System.out.println(Arrays.toString(str1.toArray()));
		
		
		int soma = lista.stream().reduce(0, (x, y) -> x + y );
		System.out.println("Soma: "+soma);
		
		List<Integer> newList = lista.stream().filter(x -> x % 2 == 0).map(x -> x * 2).collect(Collectors.toList());
		
		System.out.println(Arrays.toString(newList.toArray()));
 	}

}
