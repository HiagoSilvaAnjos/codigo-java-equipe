/**
 * Classe para validar um CPF brasileiro com base nos dígitos verificadores.
 */
public class ValidadorCPF {

    private String cpf;

    /**
     * Construtor da classe ValidadorCPF.
     * @param cpf String representando o CPF (pode conter ou não caracteres especiais).
     */
    public ValidadorCPF(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Método para validar se o CPF é válido conforme a fórmula dos dígitos verificadores.
     * @return true se o CPF for válido, false caso contrário.
     */
    public boolean validar() {
        // Verifica se o CPF é nulo ou tem tamanho diferente de 11
        if (cpf == null || cpf.length() != 11) {
            return false;
        }

        // Remove todos os caracteres que não são números (ex: pontos e traços)
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se todos os dígitos são iguais (ex: 00000000000, 11111111111 etc.)
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Converte a string do CPF em um array de inteiros
        int[] digitos = new int[11];
        for (int i = 0; i < 11; i++) {
            digitos[i] = Integer.parseInt(cpf.substring(i, i + 1));
        }

        // Calcula o primeiro dígito verificador com base nos primeiros 9 dígitos
        int soma1 = 0;
        for (int i = 0; i < 9; i++) {
            soma1 += digitos[i] * (10 - i);
        }
        int digito1 = 11 - (soma1 % 11);
        if (digito1 >= 10) {
            digito1 = 0;
        }

        // Verifica se o primeiro dígito verificador está correto
        if (digito1 != digitos[9]) {
            return false;
        }

        // Calcula o segundo dígito verificador com base nos primeiros 10 dígitos
        int soma2 = 0;
        for (int i = 0; i < 10; i++) {
            soma2 += digitos[i] * (11 - i);
        }
        int digito2 = 11 - (soma2 % 11);
        if (digito2 >= 10) {
            digito2 = 0;
        }

        // Verifica se o segundo dígito verificador está correto
        if (digito2 != digitos[10]) {
            return false;
        }

        // CPF é válido
        return true;
    }
}
