public class Main {
    public static void main(String[] args) {

        double adicao = Calculadora.adicao(27, 2);

        double subtracao = Calculadora.subtracao(27, 2);

        double multiplicacao = Calculadora.multiplicacao(4, 5);

        double divisao = Calculadora.divisao(10, 2);

        double exponenciacao = Calculadora.exponenciacao(2, 3);

        int divisaoInteira = Calculadora.divisaoInteira(10, 3);

        double restoDivisao = Calculadora.restoDivisao(10, 3);

        double arranjo = Calculadora.arranjo(5, 2);

        double permutacao = Calculadora.permutacao(5, new int[]{2, 3});

        boolean quadradoPerfeito = Calculadora.quadradoPerfeito(25);

        double fatorial = Calculadora.fatorial(5);

        double fatorialRecursivo = Calculadora.fatorialRecursivo(5);

        double piso = Calculadora.piso(3.7);

        double teto = Calculadora.teto(3.1);

        double raizCubica = Calculadora.raizEnesima(27, 3);

        boolean primo7 = Calculadora.verificarPrimo(7);

        boolean primo9 = Calculadora.verificarPrimo(9);

        System.out.println("Adicao: " + adicao);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Exponenciacao: " + exponenciacao);
        System.out.println("Divisao Inteira: " + divisaoInteira);
        System.out.println("Resto da Divisao: " + restoDivisao);
        System.out.println("Arranjo A(5,2): " + arranjo);
        System.out.println("Permutacao P(5,[2,3]): " + permutacao);
        System.out.println("Quadrado Perfeito (25): " + quadradoPerfeito);
        System.out.println("Fatorial 5: " + fatorial);
        System.out.println("Fatorial Recursivo 5: " + fatorialRecursivo);
        System.out.println("Piso de 3.7: " + piso);
        System.out.println("Teto de 3.1: " + teto);
        System.out.println("Raiz cubica de 27: " + raizCubica);
        System.out.println("Número primo (7): " + primo7);
        System.out.println("Número primo (9): " + primo9);

    }
}
