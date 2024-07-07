package livro.caelum.modificadoresAcesso;

import java.util.Scanner;

public class TestaContaEstouro1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*System.out.print("Titular da conta: ");
        String titular = entrada.nextLine();
        System.out.print("Número da conta: ");
        int numero = entrada.nextInt();
        System.out.print("Saldo inicial da conta: ");
        double saldoAtribuido = entrada.nextDouble();
        double saldo = 0;
        if (saldoAtribuido < 0) {
            System.out.println("Saldo inválido, permitido apenas valores positivos!");
        } else {
            saldo = saldoAtribuido;
        }*/

        Conta minhaConta = new Conta(1, "Titular", 1,246, 0, 1000.0);
        minhaConta.mostraInfo();
        int resposta = 0;
        double valor = 0;
        while (true) {
            System.out.println("-------------------------------");
            System.out.println("Operação desejada?\n0) Ver saldo\n1) Sacar\n2) Despositar\n3) Sair");
            System.out.print("Sua resposta: ");
            resposta = entrada.nextInt();
            if (resposta ==0) {
                System.out.println("Seu saldo é de R$" + minhaConta.getSaldo());
            } else if (resposta == 1) {
                // lógica de saque
                System.out.print("Qual o valor do saque? ");
                valor = entrada.nextDouble();
                minhaConta.saca(valor);
                if(minhaConta.getLimite() > 0) {
                    System.out.println("Deseja sacar crédito disponível?\n1) Sim\n2) Não");
                    System.out.print("Sua opção: ");
                    resposta = entrada.nextInt();
                    if (resposta == 1) {
                        System.out.println("Crédito disponível no valor de R$" + minhaConta.getLimite());
                        System.out.print("Qual o valor do saque? ");
                        valor = entrada.nextDouble();
                        minhaConta.sacaLimite(valor);
                    }
                }
                minhaConta.mostraInfo();
            } else if (resposta == 2) {
                // lógica de depósito
                System.out.print("Qual o valor do depósito? ");
                valor = entrada.nextDouble();
                minhaConta.deposita(valor);
                minhaConta.mostraInfo();
            } else if (resposta == 3) {
                System.out.println("Saindo do sistema...");
                break;
            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
        }
    }
}
