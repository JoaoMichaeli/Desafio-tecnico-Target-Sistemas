package questoes;

import java.util.*;

public class Questao4 {
    public static void calcularPercentuais() {
        Map<String, Double> estados = inicializarEstados();
        double total = calcularTotalFaturamento(estados);

        System.out.println("Percentual de representatividade por estado:");
        for (var entry : estados.entrySet()) {
            double percentual = calcularPercentual(entry.getValue(), total);
            imprimirPercentual(entry.getKey(), percentual);
        }
    }

    private static Map<String, Double> inicializarEstados() {
        Map<String, Double> estados = new LinkedHashMap<>();
        estados.put("SP", 67836.43);
        estados.put("RJ", 36678.66);
        estados.put("MG", 29229.88);
        estados.put("ES", 27165.48);
        estados.put("Outros", 19849.53);
        return estados;
    }

    private static double calcularTotalFaturamento(Map<String, Double> estados) {
        return estados.values().stream().mapToDouble(Double::doubleValue).sum();
    }

    private static double calcularPercentual(double valor, double total) {
        return (valor / total) * 100;
    }

    private static void imprimirPercentual(String estado, double percentual) {
        System.out.printf("- %s: %.2f%%\n", estado, percentual);
    }
}

