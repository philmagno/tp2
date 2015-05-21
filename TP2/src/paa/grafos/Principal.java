package paa.grafos;

import paa.grafos.model.Grafo;

public class Principal {
	public static void main(String[] args) {
		ExtrairGrafos extrator = new ExtrairGrafos();
		Grafo grafo = extrator.extrairArquivo("files/inGB.txt");
		
		grafo.imprimirVertices();	
	}
}