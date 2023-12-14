package Exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
   
   Queue<String> filaLivros = new LinkedList<>();
   Scanner leia = new Scanner(System.in);
   int opcao;

   do {
   exibirMenu();
   opcao = leia.nextInt();

   switch (opcao) {
   case 1:
   adicionarLivro(filaLivros, leia);
   break;
               
   case 2:
   listarLivros(filaLivros);
   break;
                
    case 3:
    retirarLivro(filaLivros);
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
        System.out.println("1: Adicionar um novo livro na fila.");
        System.out.println("2: Listar todos os livros na fila.");
        System.out.println("3: Retirar um livro da fila.");
        System.out.println("0: Sair.");
    }
    private static void adicionarLivro(Queue<String> filaLivros, Scanner leia) {
    System.out.println("\nDigite o nome do Livro:");
    String nomeLivro = leia.next();
    filaLivros.add(nomeLivro);
    System.out.println("\nFila:\n" + filaLivros.toString() + "\nLivro adicionado!\n");
    }

    private static void listarLivros(Queue<String> filaLivros) {
    System.out.println("\nLista de Livros na Fila:\n" + filaLivros.toString() + "\n");
    }

    private static void retirarLivro(Queue<String> filaLivros) {
    if (!filaLivros.isEmpty()) {
    String livroRetirado = filaLivros.poll();
    System.out.println("\nFila:\n" + filaLivros.toString() + "\nUm Livro foi retirado da fila!\n");
    } else {
    System.out.println("\nA Fila está vazia!\n");
    }
    }
	}


