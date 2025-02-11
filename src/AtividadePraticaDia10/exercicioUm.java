package AtividadePraticaDia10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicioUm {
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();

        
        Scanner entrada = new Scanner(System.in);

        boolean executando = true;

        
        do {
           
            System.out.println("\nMenu");
            System.out.println("************");
            System.out.println("1- Adicionar Cliente na fila");
            System.out.println("2- Listar todos os clientes");
            System.out.println("3- Retirar cliente da fila");
            System.out.println("0- Finalizar o programa");
            System.out.println("************");
            System.out.print("Entre com a opção desejada: ");

            
            int opcao = entrada.nextInt();
            entrada.nextLine(); 

            
            switch (opcao) {
                case 1:
                    
                    System.out.print("Digite o nome do cliente: ");
                    String nome = entrada.nextLine();
                    fila.add(nome); 
                    System.out.println("Cliente adicionado: " + nome);
                    break;

                case 2:
                    
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        System.out.println("Lista de Clientes na Fila:");
                        for (String cliente : fila) {
                            System.out.println("- " + cliente);
                        }
                    }
                    break;

                case 3:
                    
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia! Nenhum cliente para chamar.");
                    } else {
                        String clienteChamado = fila.poll(); 
                        System.out.println("Cliente chamado: " + clienteChamado);
                    }
                    break;

                case 0:
                    
                    System.out.println("Programa finalizado. Até mais!");
                    executando = false; 
                    break;

                default:
                    
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (executando); 

        
        entrada.close();
    }
}