package util;

import java.util.function.Function;

import entidades.Produtos4;

public class UpperCaseNome implements Function<Produtos4, String>{

	@Override
	public String apply(Produtos4 p) {
	
		return p.getNome().toUpperCase();
	}

}
