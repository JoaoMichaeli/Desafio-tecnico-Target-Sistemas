package questoes;

public class Questao2 {
    public static void verificarNumero(int numero) {
        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }
    }

    private static boolean pertenceFibonacci(int numero) {
        int a = 0, b = 1;
        while (a <= numero) {
            if (a == numero) {
                return true;
            }
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        return false;
    }
}

