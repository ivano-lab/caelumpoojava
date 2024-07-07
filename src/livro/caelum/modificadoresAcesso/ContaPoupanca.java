package livro.caelum.modificadoresAcesso;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int id, String titular, int numero, double saldo, double limite) {
        super(id, titular, numero, saldo, limite); // Chama o construtor da classe base (Conta)
    }

    @Override
    public void saca(double valor) {
        if (valor <= getSaldo()) { // Utiliza o método getSaldo() da classe base
            super.saca(valor); // Chama o método saca() da classe base
        } else {
            System.out.println("Saldo indisponível!");
        }
    }

    // Métodos específicos da ContaPoupanca, se houver
}