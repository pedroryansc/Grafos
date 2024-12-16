package matrizAdjacencia;

public class MatrizAdjacencia {

	private int[][] matrizAdjacencia;
	private int numeroVertices;
	private boolean direcionado; // Indica se o grafo é direcionado
	
	// Construtor
	public MatrizAdjacencia(int numeroVertices, boolean direcionado) {
		this.numeroVertices = numeroVertices;
		this.direcionado = direcionado;
		this.matrizAdjacencia = new int[numeroVertices][numeroVertices];
	}
	
	// Método para adicionar uma aresta
	public void adicionarAresta(int origem, int destino, int peso) {
		atualizarAresta(origem, destino, peso);
	}
	
	public void adicionarAresta(int origem, int destino) {
		atualizarAresta(origem, destino, 1);
	}
	
	public void atualizarAresta(int origem, int destino, int peso) {
		if(origem >= 0 && destino >= 0 && origem < numeroVertices && destino < numeroVertices) {
			matrizAdjacencia[origem][destino] = peso;
			
			if(!direcionado) {
				// Se não for direcionado, adiciona na outra direção
				matrizAdjacencia[destino][origem] = peso;
			}
		} else {
			System.out.println("Vértice(s) inválido(s)!");
		}
	}
	
	// Método para remover uma aresta
	public void removerAresta(int origem, int destino) {
		atualizarAresta(origem, destino, 0);
	}
	
	// Método para mostrar a matriz de adjacência
	public void imprimirMatrizAdjacencia() {
		System.out.println("Matriz de Adjacência:");
		for(int i = 0; i < numeroVertices; i++) {
			for(int j = 0; j < numeroVertices; j++)
				System.out.print(matrizAdjacencia[i][j] + " ");
			System.out.println();
		}
	}
	
	// Método para verificar se dois vértices são adjacentes
	public boolean verificarAdjacentes(int origem, int destino) {
		if(origem >= 0 && destino >=0 && origem < numeroVertices && destino < numeroVertices) {
			if(matrizAdjacencia[origem][destino] != 0)
				return true;
		} else
			System.out.println("Vértice(s) inválido(s)!");
		
		return false;
	}
	
	// Método para mostrar as adjacências (vizinhos) de um vértice
	public void mostrarVizinhos(int vertice) {
		if(vertice >= 0 && vertice < numeroVertices) {
			boolean temVizinho = false;
			
			System.out.print("Adjacências de " + vertice + ": ");
			
			for(int i = 0; i < numeroVertices; i++) {
				if(matrizAdjacencia[vertice][i] != 0) {
					System.out.print(i + " ");
					
					temVizinho = true;
				}
			}
			
			if(!temVizinho)
				System.out.println("O vértice não tem nenhuma adjacência/vizinho");
		} else
			System.out.println("Vértice inválido!");
	}
	
	// Método para contar o grau de um vértice
	public void grauVertice(int vertice) {
		if(direcionado) {
			contarGrauInterno(vertice);
			contarGrauExterno(vertice);
		} else
			contarGrau(vertice);
	}
	
	private void contarGrau(int vertice) {
		
	}
	
	private void contarGrauInterno(int vertice) {
		
	}
	
	private void contarGrauExterno(int vertice) {
		
	}
	
}