package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 1000.0;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "senha=" + senha +
                ", numeroDeFuncionariosGerenciados=" + numeroDeFuncionariosGerenciados +
                "} " + super.toString();
    }
}
