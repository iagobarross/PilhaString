package br.edu.fateczl.pilhaString;

public class PilhaString {
	No topo;
	
	public PilhaString() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if(topo == null) {
			return true;
		}
		return false;
	}
	
	public void push(String valor) {
		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = topo;
		topo = elemento;
	}
	
	public String pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		
		String valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public String top() throws Exception{
		if(isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		
		String valor = topo.dado;
		return valor;
	}
	
	public int size() {
		int count = 0;
		if(!isEmpty()) {
			No aux = topo;
			count = 1;
			while(aux.proximo != null) {
				count++;
				aux = aux.proximo;
			}
		}
		
		return count;
	}
	
}
