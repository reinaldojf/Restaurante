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
//		pedido.setData(data);
		pedido.setWeb(false);
		
//		Solicitante solicitante = new Solicitante();
//		solicitante.setNome("Reinaldo");
//		solicitante.setCpf("111111111-11");
//		solicitante.setEmail("teste@teste.com.br");
		Solicitante solicitante = new Solicitante("Reinaldo", "111111111-11", "teste@teste.com.br");
		pedido.setSolicitante(solicitante);
		
		Bebida b1 = new Bebida("xxx", 10, 1);
		b1.setPeso(0);
		b1.setVegano(false);
		b1.setIngredientes(null);
		
		Comida c1 = new Comida("xxx", 10, 1);
		c1.setGelada(true);
		c1.setTamanho(10);
		c1.setMarca("xxx");

		Sobremesa s1 = new Sobremesa("xxx", 10, 1);
		s1.setQuantidade(10);
		s1.setDoce(true);
		s1.setInformacao("xxx");
		
		// Incluir comida e sobremesa
		
		List<Produto> colecaoProdutos = new ArrayList<Produto>();
		colecaoProdutos.add(b1);
		colecaoProdutos.add(c1);
		colecaoProdutos.add(s1);

		pedido.setProdutos(colecaoProdutos);

		System.out.println(pedido);	
	}

}
