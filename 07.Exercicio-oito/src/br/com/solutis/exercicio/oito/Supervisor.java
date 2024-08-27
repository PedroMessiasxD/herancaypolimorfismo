package br.com.solutis.exercicio.oito;

public class Supervisor extends Comissao {
    @Override
    public double calcularAdicional() {
        return getSupervisorAdicional();
    }

}
