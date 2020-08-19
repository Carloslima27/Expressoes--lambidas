package entidades;

public class Produtos3 {
	private String nome;
	private Double preco;
	
	public Produtos3(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public static boolean staticoProdutoPredicado(Produtos3 p) {
		return p.getPreco() >= 100;
	}
	public boolean naoStaticoProdutoPredicado() {
		return preco >=100;
	}
	public String toString() {
		return String.format("%s: %.2f", nome, preco);
	}
}
