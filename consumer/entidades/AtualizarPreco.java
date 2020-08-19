package entidades;

import java.util.function.Consumer;

public class AtualizarPreco implements Consumer<ProdutosConsumer>{

	@Override
	public void accept(ProdutosConsumer p) {
		p.setPreco(p.getPreco() * 1.1);
		
	}


	

	

}
