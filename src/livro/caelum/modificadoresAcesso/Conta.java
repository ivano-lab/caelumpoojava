package livro.caelum.modificadoresAcesso;

import java.util.Scanner;

public class Conta {
    private int id;
    private String titular;
    private static int totalDeContas;
    private int numero;
    private double saldo;
    private double limite;

    public Conta(int id, String titular) {
        System.out.println("Construindo a classe...");
        this.id += id;
        this.titular = titular;
    }

    public Conta(int id, String titular, int numero, double saldo, double limite) {
        this.id = id;
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = 1000.0;
    }

    public Conta(int id, String titular, int totalDeContas, int numero, double saldo, double limite) {
        this.id = id;
        this.titular = titular;
        Conta.totalDeContas += 1;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = 1000.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id == id) {
            System.out.println("Identificador precisa ser único");
        } else {
            this.id = id;
        }
    }

    public static void setTotalDeContas(int totalDeContas) {
        Conta.totalDeContas += totalDeContas;
    }

    public String getTitular() {
        return titular;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo + limite;
    }

    public double getLimite() {
        return limite;
    }

    public void saca(double valor) {
        if(valor < saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.out.println("Saldo indisponível!");
        }
    }

    public void sacaLimite(double valor) {
        if(this.limite >= valor) {
            this.saca(valor);
            this.saldo -= valor;
            this.limite -= valor;
        }
    }

    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("Depósito efetuado com sucesso!");
    }

    static int geraId(int id) {
        System.out.println("Gerando identificador");
        int identificador = id;
        return identificador;
    }

    public void mostraInfo() {
        System.out.println("-------------------------------");
        System.out.println("ID conta: " + this.id);
        System.out.println("Titular da conta: " + this.titular);
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Saldo disponível: " + this.saldo);
        System.out.println("Crédito disponível: " + this.limite);
    }
}
