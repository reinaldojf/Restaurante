package br.edu.infnet.model.dominio;

public class Comida extends Produto {
	private boolean gelada;
	private float tamanho;
	private String marca;

	public Comida(String nome, float valor, int codigo) {
		super(nome, valor, codigo);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(gelada);
		sb.append(";");
		sb.append(tamanho);
		sb.append(";");
		sb.append(marca);
		
		return sb.toString();
	}
	@Override
	public float calcularValorVenda() {
		// TODO Auto-generated method stub
		return 0;
	}
	public boolean isGelada() {
		return gelada;
	}
	public void setGelada(boolean gelada) {
		this.gelada = gelada;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
}
