package paa.grafos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExtrairGrafos {
	
	public Grafo extrairArquivo(String path){
		try {
			FileReader reader = new FileReader(new File(path));
			BufferedReader buffered = new BufferedReader(reader);
			
			return extrairGrafo(buffered);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Grafo extrairGrafo(BufferedReader buffered) throws IOException{
		Grafo grafo = new Grafo();
		
		String readLine = buffered.readLine();
		while(readLine != null){
			String[] vertices = readLine.split(" ");

			if(vertices.length > 0
					&& !vertices[0].replace(" ","").equals("")){
				
				Celula origem = new Celula(Integer.valueOf(vertices[0]));
				Vertice vertice = new Vertice(origem);
				System.out.println(origem);
				
				if(grafo.raiz == null)
					grafo.raiz = vertice; 

				for (int i = 1; i < vertices.length; i++) {
					Celula destino = new Celula(Integer.valueOf(vertices[i]));
					grafo.adicionarAresta(origem, destino);
				}
				
			}
			readLine = buffered.readLine();
		}
		return grafo;
	}
}