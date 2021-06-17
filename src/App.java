import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {

        // Exercício 1
        System.out.println("\nExercício 1: ");

        Stack<String> principal = new Stack<>();
        Stack<String> destino = new Stack<>();
        Stack<String> auxiliar = new Stack<>();

        principal.push("A");
        principal.push("B");
        principal.push("C");

        Hanoi.hanoi(principal.size(), principal, destino, auxiliar);

        // Exercício 2

        System.out.println("\n\nExercício 2: \n");

        Queue<Cliente> filaComPrioridade = new PriorityQueue<Cliente>(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente p1, Cliente p2) {
                return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
            }

        });

        filaComPrioridade.offer(new Cliente("Idoso 1", 1));
        filaComPrioridade.offer(new Cliente("Quantidade máxima de 15 itens", 3));
        filaComPrioridade.offer(new Cliente("Gestante 2", 2));
        filaComPrioridade.offer(new Cliente("Demais clientes 1", 4));
        filaComPrioridade.offer(new Cliente("Gestante 1", 2));
        filaComPrioridade.offer(new Cliente("Quantidade máxima de 15 itens", 3));
        filaComPrioridade.offer(new Cliente("Quantidade máxima de 15 itens", 3));
        filaComPrioridade.offer(new Cliente("Demais clientes 2", 4));
        filaComPrioridade.offer(new Cliente("Idoso 2", 1));

        while (!filaComPrioridade.isEmpty()) {
            System.out.println(filaComPrioridade.poll());
        }

        // Exercício 3
        System.out.println("\nExercício 3: \n");

        System.out.println("Pré-ordem: 8, 4, 2, 1, 3, 6, 5, 12, 10, 11, 14, 13, 15");
        System.out.println("Em-ordem: 1, 2, 3, 4, 5, 6, 8, 11, 10, 12, 13, 14, 15");
        System.out.println("Pós-ordem: 1, 3, 2, 5, 6, 4, 11, 10, 13, 15, 14, 12, 8");

    }

}
