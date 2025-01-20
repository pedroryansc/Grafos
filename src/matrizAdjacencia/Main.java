package matrizAdjacencia;

public class Main {
	public static void main(String[] args) {
		
		// Grafo com 5 vértices e direcionado
		MatrizAdjacencia grafo = new MatrizAdjacencia(5, true);
		
		// Adicionar arestas com pesos

		grafo.adicionarAresta(0, 1, 5);
		grafo.adicionarAresta(0, 4, 10);
		grafo.adicionarAresta(1, 2, 3);
		grafo.adicionarAresta(1, 3, 1);
		grafo.adicionarAresta(2, 3, 8);
		
		grafo.imprimirMatrizAdjacencia();
		
		System.out.println();
		
		// Remover uma aresta
		// grafo.removerAresta(1, 3);
		
		grafo.adicionarAresta(0, 2, 1);
		
		grafo.imprimirMatrizAdjacencia();
		
		System.out.println();
		
		System.out.println(grafo.verificarAdjacentes(0, 4));
		
		System.out.println(grafo.verificarAdjacentes(3, 4));
		
		System.out.println();
		
		grafo.mostrarVizinhos(0);
		
		System.out.println();
		
		grafo.mostrarVizinhos(3);
		
		System.out.println();
		
		grafo.grauVertice(2);
		
	}
}