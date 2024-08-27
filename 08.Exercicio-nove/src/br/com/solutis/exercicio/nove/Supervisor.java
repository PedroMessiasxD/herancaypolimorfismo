package br.com.solutis.exercicio.nove;

public class Supervisor extends Comissao {
    @Override
    public double calcularAdicional() {
        return getSupervisorAdicional();
    }

}
