package br.com.solutis.exercicio.nove;

public class Gerente extends Comissao {
    @Override
    public double calcularAdicional() {
        return getGerenteAdicional();
    }
}
