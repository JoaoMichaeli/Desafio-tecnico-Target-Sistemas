package Questoes;

import com.google.gson.*;
import Model.Faturamento;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.List;

public class Questao3 {

    public static void analisarFaturamento() {
        // Lê o arquivo JSON da pasta resources diretamente
        InputStream inputStream = Questao3.class.getClassLoader().getResourceAsStream("dados");

        if (inputStream == null) {
            System.out.println("Arquivo não encontrado! Certifique-se de que o arquivo 'dados.json' esteja na pasta 'resources'.");
            return;
        }

        try (InputStreamReader reader = new InputStreamReader(inputStream)) {
            // Criação do objeto Gson para deserializar o JSON
            Gson gson = new Gson();
            List<Faturamento> faturamentos = gson.fromJson(reader, List.class);

            // Calculando o faturamento total
            double faturamentoTotal = 0;
            for (Faturamento faturamento : faturamentos) {
                faturamentoTotal += faturamento.getFaturamento();
            }

            // Exibindo os resultados
            System.out.println("Faturamento Total: R$ " + faturamentoTotal);

            // Calculando e exibindo o percentual de cada estado
            for (Faturamento faturamento : faturamentos) {
                double percentual = (faturamento.getFaturamento() / faturamentoTotal) * 100;
                System.out.println("Estado: " + faturamento.getEstado() + " | Faturamento: R$ " + faturamento.getFaturamento() +
                        " | Percentual: " + String.format("%.2f", percentual) + "%");
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        }
    }
}
