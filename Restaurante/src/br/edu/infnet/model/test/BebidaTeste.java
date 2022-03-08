package br.edu.infnet.model.test;

import br.edu.infnet.model.dominio.Bebida;

public class BebidaTeste {

	public static void main(String[] args) {
		Bebida b1 = new Bebida("Suco", 10, 1);
		b1.setPeso(300);
		b1.setVegano(false);
		b1.setIngredientes("Laranja; Água");
		System.out.println(b1);

		Bebida b2 = new Bebida("Suco2", 20, 2);
		b2.setPeso(300);
		b2.setVegano(false);
		b2.setIngredientes("Acerola; Água");
		System.out.println("Valor de venda:"+b2.calcularValorVenda());
	}

}
