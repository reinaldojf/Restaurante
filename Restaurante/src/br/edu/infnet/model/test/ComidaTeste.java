package br.edu.infnet.model.test;

import br.edu.infnet.model.dominio.Comida;

class ComidaTeste {

	public static void main(String[] args) {
		Comida c1 = new Comida();
		c1.setNome("Drumete");
		c1.setValor(10);
		c1.setCodigo(2);
		c1.setGelada(false);
		c1.setTamanho(1000);
		c1.setMarca("Perdigão");
		System.out.println(c1);
	}

}
