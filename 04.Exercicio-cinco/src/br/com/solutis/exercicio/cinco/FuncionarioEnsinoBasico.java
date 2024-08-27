package br.com.solutis.exercicio.cinco;

public class FuncionarioEnsinoBasico extends Funcionario{
    private String escola;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escola) {
        super(nome, codigoFuncional);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    public String toString() {
        return "FuncionarioEnsinoBasico{" +
                "escola='" + escola + '\'' +
                '}';
    }
}
