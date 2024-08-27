package br.com.solutis.exercicio.onze;

public class Supervisor extends Comissao {

    private static final double SUPERVISOR_ADICIONAL = 600.0;

    public Supervisor() {
        super(SUPERVISOR_ADICIONAL); // Passa o valor do adicional para o construtor da superclasse
    }

    @Override
    public double calcularAdicional() {
        return getAdicional();
    }
}
