package br.senac.ado.grafos;

public class Main {

	public static void main(String[] args) {
		Grafo<String> grafo = new Grafo<String>(); {

			grafo.adicionarVertice("Maria");
			grafo.adicionarVertice("João");
			grafo.adicionarVertice("Ribamar");
			grafo.adicionarVertice("Cremilda");
			grafo.adicionarVertice("José");
			
			
			grafo.adicionarAresta(3.0, "Maria", "João");
			grafo.adicionarAresta(2.0, "João", "Ribamar");
			grafo.adicionarAresta(1.0, "Ribamar", "Cremilda");
			grafo.adicionarAresta(3.0, "Cremilda", "José");
			grafo.adicionarAresta(1.0, "José", "João");
			grafo.adicionarAresta(2.0, "José", "Maria");
			
			grafo.buscaEmLargura();
		}

	}

}
