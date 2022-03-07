package br.edu.infnet.model.test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.model.dominio.Bebida;
import br.edu.infnet.model.dominio.Comida;
import br.edu.infnet.model.dominio.Pedido;
import br.edu.infnet.model.dominio.Produto;
import br.edu.infnet.model.dominio.Sobremesa;
import br.edu.infnet.model.dominio.Solicitante;

public class PedidoTeste {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		pedido.setDescricao("Compra 1");
		LocalDateTime data = LocalDateTime.now();
		pedido.setData(data);
		pedido.setWeb(true);
		
		Solicitante solicitante = new Solicitante();
		solicitante.setNome("Reinaldo");
		solicitante.setCpf("111111111-11");
		solicitante.setEmail("teste@teste.com.br");
		pedido.setSolicitante(solicitante);
		
		Comida com1 = new Comida();
		Bebida beb1 = new Bebida();
		Sobremesa sob1 = new Sobremesa();
		
		Comida com2 = new Comida();
		Bebida beb2 = new Bebida();
		Sobremesa sob2 = new Sobremesa();
		
		List<Produto> colecaoProdutos = new ArrayList<Produto>();
		colecaoProdutos.add(com1);
		colecaoProdutos.add(beb1);
		colecaoProdutos.add(sob1);
		colecaoProdutos.add(com2);
		colecaoProdutos.add(beb2);
		colecaoProdutos.add(sob2);

		pedido.setProdutos(colecaoProdutos);

		System.out.println(pedido);	
	}

}
