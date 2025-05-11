package questoes;

public class Questao1 {
    public static void executar() {
        int indice = 13;
        int soma = calcularSoma(indice);
        System.out.println("Valor final da SOMA: " + soma);
    }

    private static int calcularSoma(int indice) {
        int soma = 0;
        for (int k = 1; k <= indice; k++) {
            soma += k;
        }
        return soma;
    }
}
