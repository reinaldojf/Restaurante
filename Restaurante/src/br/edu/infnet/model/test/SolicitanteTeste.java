package br.edu.infnet.model.test;

import br.edu.infnet.model.dominio.Solicitante;

public class SolicitanteTeste {

	public static void main(String[] args) {
		Solicitante s1 = new Solicitante();
		s1.setNome("Reinaldo");
		s1.setCpf("222222222-22");
		s1.setEmail("teste@teste.com");
		System.out.println(s1);

	}

}
