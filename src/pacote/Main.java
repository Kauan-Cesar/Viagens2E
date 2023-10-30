package pacote;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {


        // Classe Objeto    Construtor
        Turista mochileiro = new Turista("Maia");
        // Definir formato do objeto
        mochileiro.setNome("Agnes");
        mochileiro.setCpf("123");

        Turista mochileira = new Turista();
        mochileira.setNome("Tomas");

        // Atribuição indireta
        String nome = JOptionPane.showInputDialog("Entre com o nome:");
        mochileira.setNome(nome);
        System.out.println("O nome do Turista é: " + mochileira.getNome());

        // Fazer o mesmo para capturar o cpf deste objeto
        String cpf = JOptionPane.showInputDialog("Digite seu cpf:");
        mochileira.setCpf(cpf);
        System.out.println("CPF sem validação " + mochileira.getCpf());

 
        nome = JOptionPane.showInputDialog("Qual seu nome: ");
        // Criando objeto com construtor recebendo nome
        Turista outroTurista = new Turista(nome);
        System.out.println("O nome deste turista é :" + outroTurista.getNome());

        cpf = JOptionPane.showInputDialog("Digite seu cpf:");

        while (!Validacao.cpf(cpf)) {
            System.out.println("O CPF \""+ cpf + "\" é inválido, redigite um válIdo.");
            cpf = JOptionPane.showInputDialog("CPF inserido inválido, insira um válido:");
        }
        if(Validacao.cpf(cpf))
            outroTurista.setCpf(cpf);
            System.out.println("O cpf(válido) digitado foi: " + cpf);

    }
}
