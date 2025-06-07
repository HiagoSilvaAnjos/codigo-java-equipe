import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculadora de raízes de polinômio de grau 2 ===");
        try {
            System.out.print("Digite o valor de a: ");
            double a = scanner.nextDouble();

            System.out.print("Digite o valor de b: ");
            double b = scanner.nextDouble();

            System.out.print("Digite o valor de c: ");
            double c = scanner.nextDouble();

            PolinomioGrau2 polinomio = new PolinomioGrau2(a, b, c);
            double[] raizes = polinomio.calcularRaizesReais();

            if (raizes.length == 0) {
                System.out.println("Não existem raízes reais.");
            } else if (raizes.length == 1) {
                System.out.println("Raiz real dupla: " + raizes[0]);
            } else {
                System.out.println("Raízes reais: " + Arrays.toString(raizes));
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
