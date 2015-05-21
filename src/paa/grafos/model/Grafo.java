package paa.grafos.model;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
	List<Vertice> vertices = new ArrayList<Vertice>();
		
	public void adicionarVertice(Vertice vertice){
		vertices.add(vertice);
	}

	@Override
	public String toString() {
		return "Grafo [vertices=" + vertices + "]";
	}
	
	public void imprimirVertices(){
		for (Vertice vertice : vertices) {
			System.out.println(vertice.valor);
		}
	}
	
}