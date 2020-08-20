package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entidades.Funcionarios;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		List<Funcionarios> f = new ArrayList<>();
		
		String caminho = "C:\\Users\\Luzia\\Documents\\Texto Java\\new paste\\Funcionarios.csv";
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
				String linha = br.readLine();
				while(linha != null) {
					String[] separa = linha.split(",");
					f.add(new Funcionarios(separa[0], separa[1], Double.parseDouble(separa[2])));
					linha = br.readLine();
				}
				System.out.print("Funcionarios pela Salario: ");
				Double salario = leitor.nextDouble();
				
				List<String> email = f.stream().filter(x -> x.getSalario() > salario).map(x -> x.getEmail()).sorted((a, b) -> a.toUpperCase().compareTo(b.toUpperCase())).collect(Collectors.toList());
				System.out.println("Email dos funcionarios cujo salario é maior do que o valor Informado:");
				email.forEach(System.out::println);
				double soma = f.stream().filter(x -> x.getNome().toUpperCase().substring(0, 1).equals("M")  ).map(x -> x.getSalario()).reduce(0.0, (x, y)-> x + y);
				System.out.println("Soma dos salarios dos funcionarios que começam com a letra M :"+String.format("%.2f", soma));
				
		}catch(IOException e) {
			
		}

	}

}
