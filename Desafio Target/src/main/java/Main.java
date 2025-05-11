import java.util.Scanner;
import Questoes.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Exibe as opções de questões para o usuário
            exibirMenu();

            // Solicita a escolha do usuário
            System.out.print("Digite o número da questão que deseja executar (1-5) ou 0 para sair: ");
            int opcao = obterEntradaInteira(scanner);

            switch (opcao) {
                case 1:
                    Questao1.executar();
                    break;
                case 2:
                    System.out.print("Digite o número para verificar se pertence à sequência de Fibonacci: ");
                    int numero = obterEntradaInteira(scanner);
                    Questao2.verificarNumero(numero);
                    break;
                case 3:
                    // Chamando o método para analisar o faturamento sem precisar de entrada de caminho
                    Questao3.analisarFaturamento();
                    break;
                case 4:
                    Questao4.calcularPercentuais();
                    break;
                case 5:
                    System.out.print("Digite a string para inverter: ");
                    String texto = scanner.nextLine();
                    Questao5.inverterTexto(texto);
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        scanner.close();  // Fechar o scanner ao final
    }

    // Método para exibir o menu com as opções de questões
    private static void exibirMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1 - Questão 1: Calcular a soma de 1 até 13");
        System.out.println("2 - Questão 2: Verificar se um número pertence à sequência de Fibonacci");
        System.out.println("3 - Questão 3: Analisar faturamento diário");
        System.out.println("4 - Questão 4: Calcular percentual de faturamento por estado");
        System.out.println("5 - Questão 5: Inverter os caracteres de uma string");
        System.out.println("0 - Sair");
        System.out.println("==============");
    }

    // Método para garantir que a entrada do usuário seja um número inteiro válido
    private static int obterEntradaInteira(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. Digite um número inteiro: ");
            scanner.next();  // Consumir a entrada inválida
        }
        return scanner.nextInt();
    }
}
