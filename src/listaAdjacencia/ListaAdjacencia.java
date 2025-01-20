package listaAdjacencia;

import java.util.ArrayList;
import java.util.HashMap;

public class ListaAdjacencia {

	private int quantidadeVertices;
	private boolean direcionado;
	private ArrayList<HashMap<Integer, Integer>> listaAdjacencia;
	
	// Construtor
	public ListaAdjacencia(int quantidadeVertices, boolean direcionado) {
		this.quantidadeVertices = quantidadeVertices;
		this.direcionado = direcionado;
		listaAdjacencia = new ArrayList<>(quantidadeVertices);
		
		// Inicializa cada lista de adjacências
		for(int i = 0; i < quantidadeVertices; i++)
			listaAdjacencia.add(new HashMap<>());
	}
	
	// Função para adicionar uma aresta no grafo
	public void adicionarAresta(int origem, int destino) {
		listaAdjacencia.get(origem).put(destino, null);
		
		// Se não for direcionado, adiciona em ambas as listas
		if(!direcionado)
			listaAdjacencia.get(destino).put(origem, null);
	}
	
	public void adicionarAresta(int origem, int destino, int peso) {
		listaAdjacencia.get(origem).put(destino, peso);
		
		// Se não for direcionado, adiciona em ambas as listas
		if(!direcionado)
			listaAdjacencia.get(destino).put(origem, peso);
	}
	
	// Função para remover uma aresta no grafo
	public void removerAresta(int origem, int destino) {
		listaAdjacencia.get(origem).remove(Integer.valueOf(destino));
		
		// Se não for direcionado, remove a conexão em ambas as listas
		if(!direcionado)
			listaAdjacencia.get(destino).remove(Integer.valueOf(origem));
	}
	
	// Função para exibir o grafo
	public void exibirGrafo() {
		for(int i = 0; i < quantidadeVertices; i++) {
			System.out.print("Vértice " + i + " -> ");
			for(HashMap.Entry<Integer, Integer> adjacente : listaAdjacencia.get(i).entrySet()) {
				System.out.print(adjacente.getKey() + " ");
				if(adjacente.getValue() != null)
					System.out.print("(" + adjacente.getValue() + ") ");
			}
			System.out.println();
		}
	}
	
	// Exercício: Método para verificar se dois vértices são adjacentes
	public boolean verificarAdjacentes(int origem, int destino) {
		if(origem >= 0 && destino >= 0 && origem < quantidadeVertices && origem < quantidadeVertices) {
			if(listaAdjacencia.get(origem).get(destino) != null)
				return true;
		} else
			System.out.println("Vértice(s) inválido(s)");
		
		return false;
	}
	
	// Exercício: Método para calcular o grau de um vértice
	public void grauVertice(int vertice) {
		if(vertice >= 0 && vertice < quantidadeVertices) {
			if(direcionado)
				grauInternoExterno(vertice);
			else
				System.out.println("Grau do vértice " + vertice + ": " + listaAdjacencia.get(vertice).size());
		} else
			System.out.println("Vértice(s) inválido(s)");
	}
	
	private void grauInternoExterno(int vertice) {
		int grauInterno = 0;
		int grauExterno = listaAdjacencia.get(vertice).size();
		
		for(int i = 0; i < quantidadeVertices; i++) {
			if(listaAdjacencia.get(i).get(vertice) != null)
				grauInterno++;
		}
		
		System.out.println("Grau interno do vértice " + vertice + ": " + grauInterno);
		System.out.println("Grau externo do vértice " + vertice + ": " + grauExterno);
	}
	
	// Exercício: Método para listar as adjacências de um vértice
	public void mostrarAdjacentes(int vertice) {
		if(vertice >= 0 && vertice < quantidadeVertices) {
			System.out.print("Lista de adjacências do vértice " + vertice + ": ");
			
			if(listaAdjacencia.get(vertice).isEmpty())
				System.out.println("O vértice não tem nenhuma adjacência/vizinho");
			else {
				for(HashMap.Entry<Integer, Integer> adjacente : listaAdjacencia.get(vertice).entrySet())
					System.out.print(adjacente.getKey() + " ");
			}
		} else
			System.out.println("Vértice inválido");
	}
	
}