/**
 * Classe Calculadora que implementa diversas operações matemáticas.
 */
public class Calculadora {

	/**
	 * Realiza a adição de dois números.
	 * @param parcela1 O primeiro número.
	 * @param parcela2 O segundo número.
	 * @return A soma dos dois números.
	 */
	public static double adicao(double parcela1, double parcela2) {
		double resultado = parcela1 + parcela2;
		System.out.printf("Resultado da adição: %.2f\n", resultado);
		return resultado;
	}

	/**
	 * Realiza a subtração entre dois números.
	 * @param minuendo O número de onde será subtraído.
	 * @param subtraendo O número a ser subtraído.
	 * @return O resultado da subtração.
	 */
	public static double subtracao(double minuendo, double subtraendo) {
		double resultado = minuendo - subtraendo;
		System.out.printf("Resultado da subtração: %.2f\n", resultado);
		return resultado;
	}

	/**
	 * Realiza a multiplicação de dois números.
	 * @param fator1 O primeiro fator.
	 * @param fator2 O segundo fator.
	 * @return O produto dos fatores.
	 */
	public static double multiplicacao(double fator1, double fator2) {
		double resultado = fator1 * fator2;
		System.out.printf("Resultado da multiplicação: %.2f\n", resultado);
		return resultado;
	}

	/**
	 * Realiza a divisão entre dois números.
	 * @param dividendo O número a ser dividido.
	 * @param divisor O número pelo qual será dividido.
	 * @return O quociente da divisão, ou NaN se o divisor for zero.
	 */
	public static double divisao(double dividendo, double divisor) {
		if (divisor == 0) {
			System.err.println("Erro! Divisão por zero.");
			return Double.NaN;
		}
		double resultado = dividendo / divisor;
		System.out.printf("Resultado da divisão: %.2f\n", resultado);
		return resultado;
	}

	/**
	 * Calcula a exponenciação de um número.
	 * @param base A base da exponenciação.
	 * @param indice O expoente.
	 * @return O resultado da base elevada ao expoente.
	 */
	public static double exponenciacao(double base, double indice) {
		return Math.pow(base, indice);
	}

	/**
	 * Realiza a divisão inteira entre dois números inteiros.
	 * @param dividendo O dividendo.
	 * @param divisor O divisor.
	 * @return O quociente inteiro da divisão, ou 0 se o divisor for zero.
	 */
	public static int divisaoInteira(int dividendo, int divisor) {
		if (divisor == 0) {
			System.err.println("Erro! Divisão por zero.");
			return 0;
		}
		return dividendo / divisor;
	}

	/**
	 * Calcula o resto da divisão entre dois números.
	 * @param dividendo O número a ser dividido.
	 * @param divisor O número pelo qual será dividido.
	 * @return O resto da divisão, ou NaN se o divisor for zero.
	 */
	public static double restoDivisao(double dividendo, double divisor) {
		if (divisor == 0) {
			System.err.println("Erro! Divisão por zero.");
			return Double.NaN;
		}
		return dividendo % divisor;
	}

	/**
	 * Calcula o número de arranjos simples de n elementos tomados k a k.
	 * A(n, k) = n! / (n - k)!
	 * @param n O total de elementos.
	 * @param k O número de elementos no arranjo.
	 * @return O número de arranjos possíveis.
	 */
	public static double arranjo(double n, double k) {
		if (k > n) {
			System.err.println("Erro! k não pode ser maior que n.");
			return 0;
		}
		return fatorial(n) / fatorial(n - k);
	}

	/**
	 * Calcula o número de permutações com repetições.
	 * P(n; r1, r2, ..., rk) = n! / (r1! * r2! * ... * rk!)
	 * @param n O número total de elementos.
	 * @param repeticoes Um array com as repetições dos elementos.
	 * @return O número de permutações possíveis.
	 */
	public static double permutacao(int n, int[] repeticoes) {
		double denominador = 1;
		for (int rep : repeticoes) {
			denominador *= fatorial(rep);
		}
		return fatorial(n) / denominador;
	}

	/**
	 * Verifica se um número é um quadrado perfeito.
	 * @param numero O número a ser verificado.
	 * @return true se o número for um quadrado perfeito, false caso contrário.
	 */
	public static boolean quadradoPerfeito(int numero) {
		double raiz = Math.sqrt(numero);
		return raiz == Math.floor(raiz);
	}

	/**
	 * Calcula o fatorial de um número (versão iterativa).
	 * @param numero O número para calcular o fatorial.
	 * @return O fatorial do número.
	 */
	public static double fatorial(double numero) {
		if (numero == 0 || numero == 1) return 1;
		double resultado = 1;
		for (int i = 2; i <= numero; i++) {
			resultado *= i;
		}
		return resultado;
	}

	/**
	 * Calcula o fatorial de um número (versão recursiva).
	 * @param numero O número para calcular o fatorial.
	 * @return O fatorial do número.
	 */
	public static double fatorialRecursivo(double numero) {
		if (numero <= 1) return 1;
		return numero * fatorialRecursivo(numero - 1);
	}

	/**
	 * Retorna o piso (maior inteiro menor ou igual) de um número.
	 * @param numero O número de entrada.
	 * @return O valor de piso do número.
	 */
	public static double piso(double numero) {
		return Math.floor(numero);
	}

	/**
	 * Retorna o teto (menor inteiro maior ou igual) de um número.
	 * @param numero O número de entrada.
	 * @return O valor de teto do número.
	 */
	public static double teto(double numero) {
		return Math.ceil(numero);
	}

	/**
	 * Calcula a raiz n-ésima de um número.
	 * @param numero O radicando.
	 * @param indice O índice da raiz.
	 * @return A raiz n-ésima do número, ou NaN se o índice for zero.
	 */
	public static double raizEnesima(double numero, double indice) {
		if (indice == 0) {
			System.err.println("Erro! Índice zero.");
			return Double.NaN;
		}
		return Math.pow(numero, 1.0 / indice);
	}

	/**
	 * Verifica se um número inteiro é primo.
	 * @param numero O número a ser verificado.
	 * @return true se o número for primo, false caso contrário.
	 */
	public static boolean verificarPrimo(int numero) {
		if (numero <= 1) return false;
		if (numero == 2 || numero == 3) return true;
		if (numero % 2 == 0) return false;
		for (int i = 3; i <= Math.sqrt(numero); i += 2) {
			if (numero % i == 0) return false;
		}
		return true;
	}
}
