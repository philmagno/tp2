package paa.grafos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import paa.grafos.model.Grafo;
import paa.grafos.model.No;
import paa.grafos.model.Vertice;

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
				No no = new No(Integer.valueOf(vertices[0]));
				Vertice vertice = new Vertice(no);
				System.out.println(no);
			
				for (int i = 1; i < vertices.length; i++) {
					vertice.adicionarAresta(new No(Integer.valueOf(vertices[i])));
				}
				grafo.adicionarVertice(vertice);
			}
			readLine = buffered.readLine();
		}
		return grafo;
	}
}