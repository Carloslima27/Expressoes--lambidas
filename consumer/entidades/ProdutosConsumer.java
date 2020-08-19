package entidades;

public class ProdutosConsumer {
	private String nome;
	private Double preco;
	
	public ProdutosConsumer(String nome, Double preco) {
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
	public static void staticoProdutosConsumer(ProdutosConsumer p) {
		p.setPreco(p.getPreco() * 1.1);
	}
	public void naoStaticoProdutosConsumer() {
		setPreco(getPreco() * 1.1);
	}
	public String toString() {
		return String.format("%s: %.2f", nome, preco);
	}
}
