package entidades;

public class Produtos4 {
	private String nome;
	private Double preco;
	
	public Produtos4(String nome, Double preco) {
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
	public static String staticFunction(Produtos4 p) {
		return p.getNome().toUpperCase();
	}
	public String naoStaticFunction() {
		return nome.toUpperCase();
	}
	
	public String toString() {
		return nome+" - "+String.format("%.2f", preco);
	}
}
