package br.edu.infnet.model.dominio;

public class Sobremesa extends Produto {
	private float quantidade;
	private boolean doce;
	private String informacao;
	
	public Sobremesa(String nome, float valor, int codigo) {
		super(nome, valor, codigo);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(quantidade);
		sb.append(";");
		sb.append(doce);
		sb.append(";");
		sb.append(informacao);
		
		return sb.toString();
	}
	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	public boolean isDoce() {
		return doce;
	}
	public void setDoce(boolean doce) {
		this.doce = doce;
	}
	public String getInformacao() {
		return informacao;
	}
	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
	@Override
	public float calcularValorVenda() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
