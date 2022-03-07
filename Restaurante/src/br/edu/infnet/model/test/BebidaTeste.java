package br.edu.infnet.model.test;

import br.edu.infnet.model.dominio.Bebida;

public class BebidaTeste {

	public static void main(String[] args) {
		Bebida b1 = new Bebida();
		b1.setNome("Suco");
		b1.setValor(10);
		b1.setCodigo(1);
		b1.setPeso(300);
		b1.setVegano(false);
		b1.setIngredientes("Laranja; Água");
		System.out.println(b1);
	}

}
