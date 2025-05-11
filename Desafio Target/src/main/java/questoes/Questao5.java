package questoes;

public class Questao5 {

    public static void inverterTextoUsuario(String texto) {
        char[] caracteres = texto.toCharArray();
        int esquerda = 0;
        int direita = caracteres.length - 1;

        while (esquerda < direita) {
            char temp = caracteres[esquerda];
            caracteres[esquerda] = caracteres[direita];
            caracteres[direita] = temp;

            esquerda++;
            direita--;
        }

        String textoInvertido = new String(caracteres);
        System.out.println("Texto invertido: " + textoInvertido);
    }
}
