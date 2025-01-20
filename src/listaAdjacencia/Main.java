package listaAdjacencia;

public class Main {
	public static void main(String[] args) {
		
		int quantidadeVertices = 5;
		boolean direcionado = true;
		
		ListaAdjacencia grafo = new ListaAdjacencia(quantidadeVertices, direcionado);
		
		grafo.adicionarAresta(0, 1, 5);
		grafo.adicionarAresta(1, 3, 1);
		grafo.adicionarAresta(1, 2, 3);
		grafo.adicionarAresta(0, 4, 10);
		grafo.adicionarAresta(2, 3, 8);
		
		grafo.exibirGrafo();

		System.out.println();
		
		// grafo.removerAresta(1, 3);
		
		grafo.exibirGrafo();
		
		System.out.println();
		
		// grafo.adicionarAresta(0, 2);
		
		grafo.exibirGrafo();
		
		System.out.println();
		
		System.out.println(grafo.verificarAdjacentes(0, 2));
		
		System.out.println();
		
		grafo.grauVertice(2);
		
		System.out.println();
		
		grafo.mostrarAdjacentes(4);
		
	}
}