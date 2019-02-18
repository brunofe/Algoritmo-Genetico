package algoritmo;

import java.util.ArrayList;
import java.util.List;

import core.Individuo;
import core.Produto;

public class Executar6 {
	public static void main(String Args[]) {
		List<Produto> listaProdutos = new ArrayList<>();
		
		listaProdutos.add(new Produto("Geladeira Dako", 0.751, 999.90));
		listaProdutos.add(new Produto("Iphone 6", 0.000089, 2911.99));
		listaProdutos.add(new Produto("TV 55", 0.400, 4346.99));
		listaProdutos.add(new Produto("TV 50", 0.290, 3999.90));
		listaProdutos.add(new Produto("TV 42", 0.200, 2999.0));
		listaProdutos.add(new Produto("Notebook Dell", 0.00350, 2499.90));
		listaProdutos.add(new Produto("Ventilador Panasonic", 0.496, 199.90));
		listaProdutos.add(new Produto("Microondas Eletrolux", 0.0424, 308.66));
		listaProdutos.add(new Produto("Microonds LG", 0.0544, 429.90));
		listaProdutos.add(new Produto("Geladeira Brastemp", 0.635, 849.00));
		listaProdutos.add(new Produto("Geladeira Consul", 0.870, 1199.89));
		listaProdutos.add(new Produto("Notebook Lenovo", 0.498, 1999.90));
		listaProdutos.add(new Produto("Notebook Asus", 0.527, 3999.00));		
		
		List espacos = new ArrayList<>();
		List valores = new ArrayList<>();
		List nomes = new ArrayList<>();
		for(Produto produto: listaProdutos) {
			espacos.add(produto.getEspaco());
			valores.add(produto.getValor());
			nomes.add(produto.getNome());
		}
		Double limite = 3.0;
		
		
	}
}