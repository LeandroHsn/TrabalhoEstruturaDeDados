import java.util.Stack;

public class Hanoi {

    public static void hanoi (int n, Stack<String> principal, Stack<String> destino, Stack<String> auxiliar){
        if (n > 0){
            hanoi(n-1, principal, auxiliar, destino);
            destino.push(principal.pop());
            System.out.println("");
            System.out.print("Torre: " + principal);
            System.out.print("  Torre: " + destino);
            System.out.print("  Torre: " + auxiliar);
            hanoi(n-1, auxiliar, destino, principal);
        }
    }    
}
