package br.com.solutis.exercicio.onze;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional,String escola ) {
        super(nome, codigoFuncional, escola);
    }

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escola, Comissao comissao) {
        super(nome, codigoFuncional, escola, comissao);
    }

    @Override
    public double calculoRenda() {
        return super.calculoRenda()* 1.5;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Nível: Ensino Médio";
    }

}
