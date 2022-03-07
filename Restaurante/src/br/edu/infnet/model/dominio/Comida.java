package br.edu.infnet.model.dominio;

public class Comida extends Produto {
	private boolean gelada;
	private float tamanho;
	private String marca;
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
