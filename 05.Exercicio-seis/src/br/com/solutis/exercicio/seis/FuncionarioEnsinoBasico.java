package br.com.solutis.exercicio.seis;

public class FuncionarioEnsinoBasico extends Funcionario {
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

    public double calculoRenda(){
        return getRENDA_BASICA() * 1.1;
    }

    @Override
    public String toString() {
        return "FuncionarioEnsinoBasico{" +
                "escola='" + escola + '\'' +
                '}';
    }
}
