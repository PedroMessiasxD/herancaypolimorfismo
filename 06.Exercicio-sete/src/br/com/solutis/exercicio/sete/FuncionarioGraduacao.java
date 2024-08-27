package br.com.solutis.exercicio.sete;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioGraduacao(String nome, String codigoFuncional, String escola, String universidade) {
        super(nome, codigoFuncional, escola);
        this.universidade = universidade;
    }

    @Override
    public double calculoRenda() {
        return super.calculoRenda()*2;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    @Override
    public String toString() {
        return "FuncionarioGraduacao{" +
                "universidade='" + universidade + '\'' +
                '}';
    }
}
