package br.com.solutis.exercicio.dez;

public abstract class Comissao {
    private double adicional;

    public Comissao(double adicional) {
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public abstract double calcularAdicional();


}
