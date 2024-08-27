package br.com.solutis.exercicio.dez;

public class Gerente extends Comissao {
    private static final double ADICIONAL_GERENTE = 1500.0;

    public Gerente() {
        super(ADICIONAL_GERENTE);
    }

    @Override
    public double calcularAdicional() {
        return getAdicional();
    }

}
