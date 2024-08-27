package br.com.solutis.exercicio.sete;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional,String escola ) {
        super(nome, codigoFuncional, escola);
    }

    @Override
    public double calculoRenda() {
        return super.calculoRenda()* 1.5;
    }


}
