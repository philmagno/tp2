package paa.grafos;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
	public Vertice raiz;
	
	List<Vertice> vertices = new ArrayList<Vertice>();
		
	public void adicionarVertice(Vertice novoVertice){
		vertices.add(novoVertice);
	}

	@Override
	public String toString() {
		return "Grafo [vertices=" + vertices + "]";
	}
	
	public void imprimirVertices(){
		for (Vertice vertice : vertices) {
			System.out.println(vertice.celula);
		}
	}

	public void adicionarAresta(Celula origem, Celula destino) {
		Vertice verticeOrigem = procurarVertice(origem);
		Vertice verticeDestino = procurarVertice(destino);
		
		if(verticeOrigem == null){ 		// Caso não for encontrado é adicionado o novo vertice, com a nova aresta.
			verticeOrigem = new Vertice(origem);
			vertices.add(verticeOrigem);
			
			if(verticeDestino == null){
				verticeDestino = new Vertice(destino);
				vertices.add(verticeDestino);
			}
			
			verticeOrigem.adicionarAresta(verticeDestino);
		}else{
			if(verticeDestino == null){
				verticeDestino = new Vertice(destino);
				vertices.add(verticeDestino);
			}
			verticeOrigem.adicionarAresta(verticeDestino);
		}
	}

	private Vertice procurarVertice(Celula origem) {
		Vertice verticeEncontrado = null;
		
		//procurar vertice com valor de origem
		for (Vertice vertice : vertices) {
			if(vertice.celula.valor == origem.valor){
				verticeEncontrado = vertice;
			}
		}
		return verticeEncontrado;
	}
}