package paa.grafos;

import java.util.ArrayList;
import java.util.List;

public class Vertice {
	Celula celula;
	
	List<Aresta> arestas = new ArrayList<Aresta>();
	
	public Vertice(Celula valor){
		this.celula = valor;
	}
	
	public void adicionarAresta(Vertice vertice){
		Aresta aresta = new Aresta(this, vertice);
		arestas.add(aresta);
	}

	@Override
	public String toString() {
		return celula.toString();
	}
	
	
}