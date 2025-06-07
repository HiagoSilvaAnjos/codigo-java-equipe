import java.util.Arrays;

/**
 * Classe para encontrar as raizes reais de um polinomio de grau 2 (ax^2 + bx + c = 0).
 */
public class PolinomioGrau2 {

    private final double a;
    private final double b;
    private final double c;

    /**
     * Construtor da classe PolinomioGrau2.
     * @param a Coeficiente de x^2.
     * @param b Coeficiente de x.
     * @param c Termo independente.
     * @throws IllegalArgumentException se 'a' for zero, pois nao seria um polinomio de grau 2.
     */
    public PolinomioGrau2(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("O coeficiente 'a' nao pode ser zero para um polinomio de grau 2.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Calcula o discriminante (delta) da equacao.
     * Delta = b^2 - 4ac
     * @return O valor do discriminante.
     */
    private double calcularDelta() {
        return (b * b) - (4 * a * c);
    }

    /**
     * Calcula as raizes reais do polinomio.
     * @return Um array de double contendo as raizes reais. O array estara vazio se nao houver raizes reais (delta < 0).
     *         Contera uma raiz se delta = 0.
     *         Contera duas raizes se delta > 0.
     */
    public double[] calcularRaizesReais() {
        double delta = calcularDelta();

        if (delta < 0) {
            // Nenhuma raiz real
            return new double[0];
        } else if (delta == 0) {
            // Uma raiz real (raiz dupla)
            double raiz = -b / (2 * a);
            return new double[]{raiz};
        } else {
            // Duas raizes reais distintas
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            // Retorna as raizes ordenadas para facilitar testes
            if (raiz1 > raiz2) {
                return new double[]{raiz2, raiz1};
            } else {
                return new double[]{raiz1, raiz2};
            }
        }
    }

    // Getters (opcional, mas util para testes ou outras funcionalidades)
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}

