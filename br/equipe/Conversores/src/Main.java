
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorUnidades conversorUnidades = new ConversorUnidades();

        int opcao;

        do {
            System.out.println("\n=== CONVERSOR GERAL ===");
            System.out.println("1 - Conversor de Massa");
            System.out.println("2 - Conversor de Moeda");
            System.out.println("3 - Conversor de Temperatura");
            System.out.println("4 - Conversor de Comprimento");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {

                    System.out.print("Unidade de origem " +
                            "(1-Kg, 2-g, 3-lb): ");
                    int origem = scanner.nextInt();

                    System.out.print("Unidade de destino " +
                            "(1-Kg, 2-g, 3-lb): ");
                    int destino = scanner.nextInt();

                    System.out.print("Valor a converter: ");
                    double valor = scanner.nextDouble();

                    double resultado = conversorUnidades.converterMassa(origem, destino, valor);

                    if (resultado != -1)
                        System.out.println("Resultado: " + resultado);
                }
                case 2 -> {

                    System.out.print("Moeda atual " +
                            "(1-real, 2-dólar, 3-euro, 4-libra): ");
                    int moedaatual = scanner.nextInt();

                    System.out.print("Quantidade: ");
                    float qtd = scanner.nextFloat();

                    System.out.print("Moeda destino " +
                            "(1-real, 2-dólar, 3-euro, 4-libra): ");

                    int moedaconversao = scanner.nextInt();
                    conversorUnidades.converterMoeda(moedaatual, moedaconversao, qtd);
                }
                case 3 -> conversorUnidades.converterTemperatura(scanner);
                case 4 -> conversorUnidades.converterComprimento(scanner);
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}