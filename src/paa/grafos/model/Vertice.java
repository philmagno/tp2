package paa.grafos.model;

import java.util.ArrayList;
import java.util.List;

public class Vertice {
	No valor;
	
	List<Aresta> arestas = new ArrayList<Aresta>();
	
	public Vertice(No valor){
		this.valor = valor;
	}
	
	public void adicionarAresta(No vertice1, No vertice2){
		arestas.add(new Aresta(vertice1, vertice2));
	}

	public void adicionarAresta(No vertice) {
		arestas.add(new Aresta(this.valor, vertice));
	}

	@Override
	public String toString() {
		return "Vertice [valor=" + valor + ", arestas=" + arestas + "]";
	}
	
}