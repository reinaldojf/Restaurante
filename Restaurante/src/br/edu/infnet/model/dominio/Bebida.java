package br.edu.infnet.model.dominio;

public class Bebida extends Produto {
	
	// OBS: O professor trocou os atributos de Bebida com os da Comida
	private float peso;
	private boolean vegano;
	private String ingredientes;

	public Bebida(String nome, float valor, int codigo) {
		super(nome, valor, codigo);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(peso);
		sb.append(";");
		sb.append(vegano);
		sb.append(";");
		sb.append(ingredientes);
		
		return sb.toString();
	}
	@Override
	public float calcularValorVenda() {
		// TODO Auto-generated method stub
		// Exemplo de implementação da filha abaixo
		return getValor() + 0.10f;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public boolean isVegano() {
		return vegano;
	}
	public void setVegano(boolean vegano) {
		this.vegano = vegano;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
}
