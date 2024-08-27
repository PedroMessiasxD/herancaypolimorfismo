package br.com.solutis.exercicio.dez;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioGraduacao(String nome, String codigoFuncional, String escola, String universidade) {
        super(nome, codigoFuncional, escola);
        this.universidade = universidade;
    }

    public FuncionarioGraduacao(String nome, String codigoFuncional, String escola, String universidade, Comissao comissao) {
        super(nome, codigoFuncional, escola, comissao);
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
                "nome='" + getNome() + '\'' +
                ", codigoFuncional='" + getCodigoFuncional() + '\'' +
                ", escola='" + getEscola() + '\'' +
                ", universidade='" + universidade + '\'' +
                ", rendaBasica=" + getRENDA_BASICA() +
                ", comissao=" + (getComissao() != null ? getComissao().calcularAdicional() : "Nenhuma") +
                '}';
    }
}
