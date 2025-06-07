import java.util.Scanner;

/**
 * Classe utilitaria que fornece métodos para conversão de diferentes unidades:
 * massa, moeda, temperatura e comprimento.
 */
public class ConversorUnidades {

    // ================= CONVERSOR DE MASSA =================

    /**
     * Converte um valor de massa entre quilogramas,
     * gramas e libras.

     * @param origem Codigo da unidade de origem:
     *  1 - kg, 2 - g, 3 - lb

     * @param destino Codigo da unidade de destino:
     * 1 - kg, 2 - g, 3 - lb

     * @param valor Valor a ser convertido.

     * @return Valor convertido, ou -1 se as unidades forem invalidas.
     */
    public double converterMassa(int origem, int destino, double valor) {
        double emQuilos;

        // Converte valor para quilogramas
        switch (origem) {
            // Quilogramas
            case 1: emQuilos = valor; break;
            // Gramas
            case 2: emQuilos = valor / 1000; break;
            // Libras
            case 3: emQuilos = valor * 0.453592; break;
            default:
                System.out.println("Unidade de origem inválida.");
                return -1;
        }

        // Converte de quilogramas para unidade de destino
        switch (destino) {
            case 1: return emQuilos;                           // Para kg
            case 2: return emQuilos * 1000;                    // Para g
            case 3: return emQuilos / 0.453592;                // Para lb
            default:
                System.out.println("Unidade de destino invalida.");
                return -1;
        }
    }

    // ================ CONVERSOR DE MOEDAS =================

    /**
     * Converte valores entre quatro moedas com taxas fixas:
     * real, dolar, euro e libra.

     * @param moedaatual Codigo da moeda atual:
     * 1 - real, 2 - dólar, 3 - euro, 4 - libra

     * @param moedaconversao Codigo da moeda de destino

     * @param qtd Quantidade a ser convertida
     */
    public void converterMoeda(int moedaatual, int moedaconversao, float qtd) {
        // Verifica se as moedas são iguais
        if (moedaatual == moedaconversao) {
            System.out.println("Voce tentou converter uma moeda para a mesma moeda.");
            return;
        }

        // Validação dos códigos de moeda
        if (moedaatual < 1
                || moedaatual > 4
                || moedaconversao < 1
                || moedaconversao > 4)
        {
            System.out.println("Moeda invalida. " +
                    "Use: 1 - real, 2 - dolar, " +
                    "3 - euro, 4 - libra.");
            return;
        }

        float resultado = 0;
        String nome = "";

        // Conversão usando taxas aproximadas
        switch (moedaatual) {
            case 1: // Real
                if (moedaconversao == 2)
                { resultado = qtd * 0.18f; nome = "dolares"; }

                else if
                (moedaconversao == 3)
                { resultado = qtd * 0.16f; nome = "euros"; }

                else if (moedaconversao == 4)
                { resultado = qtd * 0.13f; nome = "libras"; }

                break;

            case 2: // Dolar
                if (moedaconversao == 1)
                { resultado = qtd * 5.65f; nome = "reais"; }

                else if (moedaconversao == 3)
                { resultado = qtd * 0.88f; nome = "euros"; }

                else if (moedaconversao == 4)
                { resultado = qtd * 0.74f; nome = "libras"; }

                break;

            case 3: // Euro
                if (moedaconversao == 1)
                { resultado = qtd * 6.44f; nome = "reais"; }

                else if
                (moedaconversao == 2)
                { resultado = qtd * 1.14f; nome = "dolares"; }

                else if (moedaconversao == 4)
                { resultado = qtd * 0.84f; nome = "libras"; }

                break;

            case 4: // Libra
                if (moedaconversao == 1)
                { resultado = qtd * 7.63f; nome = "reais"; }

                else if (moedaconversao == 2)
                { resultado = qtd * 1.35f; nome = "dolares"; }

                else if (moedaconversao == 3)
                { resultado = qtd * 1.19f; nome = "euros"; }

                break;
        }

        // Exibe o resultado
        System.out.println("Voce possui: " + resultado + " " + nome);
    }

    // ============= CONVERSOR DE TEMPERATURA ==============

    /**
     * Converte entre Celsius, Fahrenheit e Kelvin, com entrada via Scanner.
     * @param scanner Scanner utilizado para entrada de dados do usuário.
     */
    public void converterTemperatura(Scanner scanner) {
        System.out.println("Escolha a temperatura de " +
                "origem:\n1 - Celsius\n2 - " +
                "Fahrenheit\n3 -" +
                " Kelvin");

        int origem = scanner.nextInt();

        System.out.println("Escolha a temperatura de destino:\n1 - Celsius\n2 - Fahrenheit\n3 - Kelvin");
        int destino = scanner.nextInt();

        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();
        double resultado = 0;

        // Verifica se a conversão é entre unidades diferentes
        if (origem == destino) {
            System.out.println("Temperatura igual.");
            return;
        }

        // Realiza as conversões entre as unidades

        if (origem == 1) { // Celsius

            if (destino == 2) resultado = valor * 1.8 + 32;

            else if (destino == 3) resultado = valor + 273.15;

        } else if (origem == 2) { // Fahrenheit

            if (destino == 1) resultado = (valor - 32) / 1.8;

            else if (destino == 3) resultado = (valor - 32) * 5 / 9 + 273.15;

        } else if (origem == 3) { // Kelvin

            if (destino == 1) resultado = valor - 273.15;

            else if (destino == 2) resultado = (valor - 273.15) * 1.8 + 32;

        } else {
            System.out.println("Valor inválido.");
            return;
        }

        // Exibe o resultado
        System.out.println("Resultado da conversão: " + resultado);
    }

    // =========== CONVERSOR DE COMPRIMENTO ============

    /**
     * Converte entre diferentes unidades de comprimento:
     * metro, centímetro, milímetro, polegada e pé.

     * @param scanner Scanner utilizado para entrada de dados do usuário.
     */
    public void converterComprimento(Scanner scanner) {
        System.out.println("Unidade de origem: \n1 - m\n2 - cm\n3 - mm\n4 - in\n5 - ft");

        int origem = scanner.nextInt();

        System.out.print("Digite o valor: ");

        double valor = scanner.nextDouble();

        System.out.println("Unidade de destino: \n1 - m\n2 - cm\n3 - mm\n4 - in\n5 - ft");

        int destino = scanner.nextInt();

        // Converte para metros
        double emMetros = switch (origem) {
            case 1 -> valor;
            case 2 -> valor / 100;
            case 3 -> valor / 1000;
            case 4 -> valor * 0.0254;
            case 5 -> valor * 0.3048;
            default -> {
                System.out.println("Unidade de origem inválida.");
                yield -1;
            }
        };

        if (emMetros == -1) return;

        // Converte de metros para unidade de destino
        double convertido = switch (destino) {
            case 1 -> emMetros;
            case 2 -> emMetros * 100;
            case 3 -> emMetros * 1000;
            case 4 -> emMetros / 0.0254;
            case 5 -> emMetros / 0.3048;
            default -> {
                System.out.println("Unidade de destino inválida.");
                yield -1;
            }
        };

        // Exibe o resultado
        if (convertido != -1) {
            System.out.println("Resultado da conversão: " + convertido);
        }
    }
}
