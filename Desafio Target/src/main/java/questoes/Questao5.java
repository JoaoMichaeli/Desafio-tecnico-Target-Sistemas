package questoes;

public class Questao5 {
    public static void inverterTexto(String texto) {
        StringBuilder invertido = new StringBuilder(texto).reverse();
        System.out.println("Texto invertido: " + invertido);
    }
}
