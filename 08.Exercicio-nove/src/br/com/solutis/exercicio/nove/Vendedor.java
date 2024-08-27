package br.com.solutis.exercicio.nove;

public class Vendedor extends Comissao {
    @Override
    public double calcularAdicional(){
        return getVendedorAdicional();
    }
}
