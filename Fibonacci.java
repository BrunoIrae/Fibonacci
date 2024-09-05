public class Fibonacci {

public static void main(String[] args) {
        int numero = 21; 

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int numero) {
        int fib1 = 0, fib2 = 1, atual = 0;

        while (atual < numero) {
            atual = fib1 + fib2;
            fib1 = fib2;
            fib2 = atual;
        }

        return atual == numero || numero == 0;
    }
}