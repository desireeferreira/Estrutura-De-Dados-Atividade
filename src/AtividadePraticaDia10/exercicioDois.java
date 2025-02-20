package AtividadePraticaDia10;
import java.util.LinkedList;
	import java.util.Scanner;
public class exercicioDois {

		//public class PilhaDeLivros {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        LinkedList<String> pilhaLivros = new LinkedList<>();
	        int opcao;

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1 - Adicionar um livro");
	            System.out.println("2 - Listar todos os livros");
	            System.out.println("3 - Retirar um livro");
	            System.out.println("0 - Finalizar programa");
	            System.out.print("Digite uma opção: ");
	            opcao = scanner.nextInt();
	            scanner.nextLine(); // Consumir a quebra de linha

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do livro: ");
	                    String livro = scanner.nextLine();
	                    pilhaLivros.addLast(livro); // Adiciona no final (como uma pilha)
	                    System.out.println("\nLivro adicionado!");
	                    break;
	                case 2:
	                    if (pilhaLivros.isEmpty()) {
	                        System.out.println("\nA pilha está vazia!");
	                    } else {
	                        System.out.println("\nLista de Livros na Pilha:");
	                        listarLivros(pilhaLivros);
	                    }
	                    break;
	                case 3:
	                    if (pilhaLivros.isEmpty()) {
	                        System.out.println("\nA Pilha está vazia!");
	                    } else {
	                        pilhaLivros.removeLast(); 
	                        System.out.println("\nUm Livro foi retirado da pilha!");
	                    }
	                    break;
	                case 0:
	                    System.out.println("\nPrograma Finalizado!");
	                    break;
	                default:
	                    System.out.println("\nOpção inválida! Tente novamente.");
	            }
	        } while (opcao != 0);

	        scanner.close();
	    }

	    private static void listarLivros(LinkedList<String> pilha) {
	        for (String livro : pilha) {
	            System.out.println(livro);
	        }
	    }
	}


