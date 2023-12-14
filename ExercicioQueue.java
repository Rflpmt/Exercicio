package Exercicios;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class ExercicioQueue {

	public static void main(String[] args) {
	Queue<String> filaClientes = new LinkedList<>();
    Scanner leia = new Scanner(System.in);
    int opcao;

    do {
    exibirMenu();
    opcao = leia.nextInt();
    switch (opcao) {
    case 1:
    adicionarCliente(filaClientes, leia);
    break;
        
    case 2:
    listarClientes(filaClientes);
    break;
                
    case 3:
    chamarCliente(filaClientes);
    break;
     
    case 0:
    System.out.println("Programa Finalizado!");
    break;
                
    default:
    System.out.println("Opção inválida. Tente novamente.");
    }
    } while (opcao != 0);

    leia.close();
    }

    private static void exibirMenu() {
    System.out.println("\nDigite uma opção:");
    System.out.println("1: Adicionar um novo Cliente na fila.");
    System.out.println("2: Listar todos os Clientes na fila.");
    System.out.println("3: Chamar (retirar) uma pessoa da fila.");
    System.out.println("0: Sair.");
    }

    private static void adicionarCliente(Queue<String> filaClientes, Scanner leia) {
    System.out.println("\nDigite o nome do Cliente:");
    String nomeCliente = leia.next();
    filaClientes.add(nomeCliente);
    System.out.println("\nFila:\n" + filaClientes.toString() + "\nCliente Adicionado!\n");
    }

    private static void listarClientes(Queue<String> filaClientes) {
        System.out.println("\nLista de Clientes na Fila:\n" + filaClientes.toString() + "\n");
    }

    private static void chamarCliente(Queue<String> filaClientes) {
    if (!filaClientes.isEmpty()) {
    String clienteChamado = filaClientes.poll();
    System.out.println("\nFila:\n" + filaClientes.toString() + "\nO Cliente " + clienteChamado + " foi Chamado!\n");
    } else {
    System.out.println("\nA Fila está vazia!\n");
    }
    }		
	}


