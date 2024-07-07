package br.com.caelum.contas.modelo;

public class Reitor extends EmpregadoDaFaculdade {
    // informações extras
    public String getInfo() {
        return super.getInfo() + " e ele é um reitor!";
    }
    // não sobrescrevemos o getGastors!!!
}
