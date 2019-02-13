package core;

public class Produto {
	private String nome;
	private double espaco;
	private double valor;
	
	public Produto(String nome, double espaço, double valor) {
		super();
		this.nome = nome;
		this.espaco = espaço;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getEspaco() {
		return espaco;
	}

	public void setEspaco(double espaco) {
		this.espaco = espaco;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
