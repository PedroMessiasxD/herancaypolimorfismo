package br.com.solutis.exercicio.onze;

public class FuncionarioEnsinoBasico extends Funcionario {
    private String escola;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escola) {
        super(nome, codigoFuncional);
        this.escola = escola;
    }

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escola, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {

        this.escola = escola;
    }

    public double calculoRenda(){
        return getRENDA_BASICA() * 1.1 ;
    }

    @Override
    public String toString() {
        double rendaComissao = (getComissao() != null) ? getComissao().calcularAdicional() : 0;
        return super.toString() +
                ", Escola: " + escola;
    }

}
