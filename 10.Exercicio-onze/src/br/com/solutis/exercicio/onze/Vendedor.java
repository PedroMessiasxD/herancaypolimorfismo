package br.com.solutis.exercicio.onze;

public class Vendedor extends Comissao {
    private static final double VENDEDOR_ADICIONAL = 250.0;

    public Vendedor() {
        super(VENDEDOR_ADICIONAL); // Passa o valor do adicional para o construtor da superclasse
    }

    @Override
    public double calcularAdicional() {
        return getAdicional();
    }
}
