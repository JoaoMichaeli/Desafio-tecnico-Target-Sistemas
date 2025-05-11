package questoes;

public class Questao5 {
    public static void inverterTexto(String texto) {
        String invertido = inverter(texto);
        System.out.println("Texto invertido: " + invertido);
    }

    private static String inverter(String texto) {
        char[] invertido = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            invertido[i] = texto.charAt(texto.length() - 1 - i);
        }
        return new String(invertido);
    }
}
