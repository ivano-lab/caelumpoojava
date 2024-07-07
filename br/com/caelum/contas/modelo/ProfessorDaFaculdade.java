package br.com.caelum.contas.modelo;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
    private int horasDeAula;
    public double getGastos() {
        return this.getSalario() + this.horasDeAula * 10;
    }

    public String getInfo() {
        String infromacaoBasica = super.getInfo();
        String informacao = infromacaoBasica + " horas de aula: " + this.horasDeAula;
        return informacao;
    }

    public int getHorasDeAula() {
        return horasDeAula;
    }

    public void setHorasDeAula(int horasDeAula) {
        this.horasDeAula = horasDeAula;
    }
}
