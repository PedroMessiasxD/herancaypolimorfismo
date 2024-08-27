package br.com.solutis.exercicio.oito;

public class Gerente extends Comissao {
    @Override
    public double calcularAdicional() {
        return getGerenteAdicional();
    }
}
