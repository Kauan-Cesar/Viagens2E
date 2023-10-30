package pacote;

public class Validacao {

    public static boolean cpf(String cpf) {
        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais, o que é um CPF inválido
        if (cpf.matches("(\\d)\\1*")) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma += digito * (10 - i);
        }
        int primeiroDigito = 11 - (soma % 11);

        if (primeiroDigito == 10 || primeiroDigito == 11) {
            primeiroDigito = 0;
        }

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma += digito * (11 - i);
        }
        int segundoDigito = 11 - (soma % 11);

        if (segundoDigito == 10 || segundoDigito == 11) {
            segundoDigito = 0;
        }

        // Verifica se os dígitos verificadores estão corretos
        int digitoVerificador1 = Character.getNumericValue(cpf.charAt(9));
        int digitoVerificador2 = Character.getNumericValue(cpf.charAt(10));

        return primeiroDigito == digitoVerificador1 && segundoDigito == digitoVerificador2;
    }
}
