public class Main {

    public static void main(String[] args) {

        ValidadorCPF validador = new ValidadorCPF("12345678909");
        boolean valido = validador.validar();
        if (valido) {
            System.out.println("CPF válido.");
        } else {
            System.out.println("CPF inválido.");
        }

    }

}
