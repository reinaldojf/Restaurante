package br.edu.infnet.model.dominio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Pedido {
	private String descricao;
	private LocalDateTime data;
	private boolean web;
	private Solicitante solicitante;
	private List<Produto> produtos;
	
	public Pedido() {
		data = LocalDateTime.now();
		descricao = "Pedido web";
		web = true;
	}
	@Override
	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm");
		
		return String.format("%s;%s;%s,%d", 
				descricao, 
				data.format(formato), 
				web ? "internet":"loja",
				produtos.size());
	}
	
	public Solicitante getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDateTime getData() {
		return data;
	}
//	public void setData(LocalDateTime data) {
//		this.data = data;
//	}
	public boolean isWeb() {
		return web;
	}
	public void setWeb(boolean web) {
		this.web = web;
	}
	
}
