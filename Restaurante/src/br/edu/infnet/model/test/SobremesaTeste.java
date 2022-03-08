package br.edu.infnet.model.test;

import br.edu.infnet.model.dominio.Comida;
import br.edu.infnet.model.dominio.Sobremesa;

public class SobremesaTeste {

	public static void main(String[] args) {
//		Sobremesa s1 = new Sobremesa();
//		s1.setNome("Sorvete");
//		s1.setValor(20);
//		s1.setCodigo(3);
		Sobremesa s1 = new Sobremesa("Sorvete", 20, 3);
		s1.setQuantidade(20);
		s1.setDoce(true);
		s1.setInformacao("Flocos");
		System.out.println(s1);
	}

}
