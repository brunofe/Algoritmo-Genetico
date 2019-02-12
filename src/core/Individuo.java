package core;

import java.util.ArrayList;
import java.util.List;

public class Individuo {
	private List espacos = new ArrayList<>();
	private List valores = new ArrayList<>();
	private Double limiteEspacos;
	private Double notaAvaliacao;
	private int geracao;
	private List cromossomo = new ArrayList<>();
	
	public Individuo(List espacos, List valores, Double limiteEspacos) {
		this.espacos =espacos;
		this.valores = valores;
		this.limiteEspacos = limiteEspacos;
		this.notaAvaliacao = 0.0;
		this.geracao = 0;
		
		for(int i=0;i<this.espacos.size();i++) {
			if(java.lang.Math.random()<0.5) {
				this.cromossomo.add("0");
			}else {
				this.cromossomo.add("1");
			}
		}
		
		
	}

	public List getEspacos() {
		return espacos;
	}

	public void setEspacos(List espacos) {
		this.espacos = espacos;
	}

	public List getValores() {
		return valores;
	}

	public void setValores(List valores) {
		this.valores = valores;
	}

	public Double getLimiteEspacos() {
		return limiteEspacos;
	}

	public void setLimiteEspacos(Double limiteEspacos) {
		this.limiteEspacos = limiteEspacos;
	}

	public Double getNotaAvaliacao() {
		return notaAvaliacao;
	}

	public void setNotaAvaliacao(Double notaAvaliacao) {
		this.notaAvaliacao = notaAvaliacao;
	}

	public int getGeracao() {
		return geracao;
	}

	public void setGeracao(int geracao) {
		this.geracao = geracao;
	}

	public List getCromossomo() {
		return cromossomo;
	}

	public void setCromossomo(List cromossomo) {
		this.cromossomo = cromossomo;
	}
}
