package pilhas;

import java.util.Stack;

public class ExemploPilha {

	public static void main(String[] args) {
		// Exemplo de Pilha de dados
		// Criação de uma nova pilha de Strings
		/*
		 * Uma pilha, vai trabalhar com o padrão LIFO
		 * Last in, First Out
		 * ou seja: O ultimo a entrar será o primeiro a sair.
		 */
		Stack<String> pilha = new Stack<String>();
		
		// Adicionando dados na pilha com o comando PUSH
		pilha.push("Najla");
		pilha.push("Carol");
		pilha.push("Daniele");
		
		//System.out.println(pilha);
		// Removendo dados da pilha com o comando POP
		System.out.println(pilha.pop());
		//System.out.println(pilha.pop());
		System.out.println(pilha);
		
		// verificando se a pilha contem um dado
		System.out.println(pilha.contains("Najla"));
		
		//ForEach para percorrer cada um dos dados da pilha individualmente
		for(String nome : pilha) {
			System.out.println("O nome " + nome + " está na pilha.");
		}

	}

}