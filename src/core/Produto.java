package core;

public class Produto {
	private String nome;
	private double espaço;
	private double valor;
	
	public Produto(String nome, double espaço, double valor) {
		super();
		this.nome = nome;
		this.espaço = espaço;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getEspaço() {
		return espaço;
	}

	public void setEspaço(double espaço) {
		this.espaço = espaço;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
