package paa.grafos;

public class Aresta {
	
	public Vertice origem, destino;
	
	public Aresta(Vertice origem, Vertice destino){
		this.origem = origem;
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "Aresta [origem=" + origem + ", destino=" + destino + "]";
	}
	
}