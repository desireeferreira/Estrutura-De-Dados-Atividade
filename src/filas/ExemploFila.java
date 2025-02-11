package filas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {
	public static void main(String[] args) {
		// Exemplo Pratico de aplicação de fila
		/* 
		 * Uma Fila trabalha com o padrão FIFO
		 * First In, First Out
		 * ou seja: o primeiro dado a entrar na fila, vai ser o
		 * primeiro dado a sair da fila.
		 * Sempre que adicionamos um dado novo na fila, ele automaticamente
		 * vai para o final da fila.
		 */
		
		// Criação de uma nova fila
		Queue<String> fila = new LinkedList<String>();
				
		//adicionar um dado no final da fila
		fila.add("Jacque");
		fila.add("Eliane");
		fila.add("Sandra");
		
		//System.out.println(fila);
		
		// remove o primeiro dado da fila
		fila.remove();
		//System.out.println(fila);
		
		//System.out.println(fila.size());
		
		// O comando PEEK exibe o primeiro dado da fila, mas não remove ele
		System.out.println("Proxima pessoa da fila: " + fila.peek());
		System.out.println(fila);
		
		// O comando POLL exibe e remove o primeiro dado da fila
		System.out.println("Ultimo Atendimento: " + fila.poll());
		System.out.println(fila);
		
		fila.add("Ana");
		fila.add("Gaby");
		fila.add("Mariana");
		fila.add("Willa");
		
		System.out.println(fila);
		
		/* Trabalhando com um Iterator, para percorrer individualmente 
		 * cada um dos elementos da fila, exibindo uma mensagem personalizada
		 * */
		Iterator<String> iterator = fila.iterator();
		while(iterator.hasNext()) {
			System.out.println("Proximo atendimento: " + iterator.next());
		}
	}
}