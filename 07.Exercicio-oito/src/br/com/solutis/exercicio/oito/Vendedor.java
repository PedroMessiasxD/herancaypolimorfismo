package br.com.solutis.exercicio.oito;

public class Vendedor extends Comissao{
    @Override
    public double calcularAdicional(){
        return getVendedorAdicional();
    }
}
