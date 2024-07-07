package br.com.caelum.contas.modelo;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.setNome("Fulaninho Silva");

        gerente.setSenha(4231);

        gerente.setSalario(5000.0);

        System.out.println(gerente.toString());

        System.out.println(gerente.getBonificacao());
    }
}
