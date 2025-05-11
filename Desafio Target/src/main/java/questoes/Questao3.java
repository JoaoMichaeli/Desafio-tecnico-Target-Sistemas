package questoes;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.FaturamentoDia;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Questao3 {

    public static void analisarFaturamento() {
        InputStream inputStream = Questao3.class.getClassLoader().getResourceAsStream("dados.json");

        if (inputStream == null) {
            System.out.println("Arquivo não encontrado! Certifique-se de que o arquivo 'dados.json' esteja na pasta 'resources'.");
            return;
        }

        try (InputStreamReader reader = new InputStreamReader(inputStream)) {
            Gson gson = new Gson();
            Type listType = new TypeToken<List<FaturamentoDia>>() {}.getType();
            List<FaturamentoDia> dados = gson.fromJson(reader, listType);

            List<FaturamentoDia> diasComFaturamento = dados.stream()
                    .filter(d -> d.getValor() > 0.0)
                    .toList();

            DoubleSummaryStatistics stats = diasComFaturamento.stream()
                    .mapToDouble(FaturamentoDia::getValor)
                    .summaryStatistics();

            double mediaMensal = stats.getAverage();

            long diasAcimaDaMedia = diasComFaturamento.stream()
                    .filter(d -> d.getValor() > mediaMensal)
                    .count();

            System.out.println("Menor valor de faturamento diário: R$ " + stats.getMin());
            System.out.println("Maior valor de faturamento diário: R$ " + stats.getMax());
            System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        }
    }
}
