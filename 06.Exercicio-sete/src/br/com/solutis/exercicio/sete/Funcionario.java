package br.com.solutis.exercicio.sete;

public class Funcionario {
    private String nome;
    private String codigoFuncional;
    private static final double RENDA_BASICA = 1000.0;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(String codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public double getRENDA_BASICA() {
        return RENDA_BASICA;
    }

    public double calculoRenda(){
        return RENDA_BASICA;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", codigoFuncional='" + codigoFuncional + '\'' +
                ", renda_Basica=" + RENDA_BASICA +
                '}';
    }
}
