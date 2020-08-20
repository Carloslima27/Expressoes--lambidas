package programas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class principal {

	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(3, 4, 5, 6);
		Stream<Integer> str1 = lista.stream();
		System.out.println(Arrays.toString(str1.toArray()));
		System.out.println();
		Stream<String> str2 = Stream.of("Maria", "jos�", "Ana");
		System.out.println(Arrays.toString(str2.toArray()));
		System.out.println();
		Stream<Integer> str3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(str3.limit(10).toArray()));
		
		Stream<Long> str4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]} ).map(p -> p[0]);
		
		System.out.println(Arrays.toString(str4.limit(10).toArray()));
  		

	}

}
