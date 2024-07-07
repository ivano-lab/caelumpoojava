package livro.caelum.modificadoresAcesso;

public class contaTeste1 {
    public static void main(String[] args) {
        int identificador1 = Conta.geraId(1);
        int identificador2 = Conta.geraId(2);
        Conta conta1 = new Conta(identificador1, "clinte1", 1, 111, 100.0, 200.0);
        Conta conta2 = new Conta(identificador2, "clinte2", 1, 222, 100.0, 200.0);
        conta1.mostraInfo();
        conta2.mostraInfo();
    }
}
