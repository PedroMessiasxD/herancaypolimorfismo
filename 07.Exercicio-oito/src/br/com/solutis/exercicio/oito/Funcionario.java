package br.com.solutis.exercicio.oito;

public class Funcionario {
    private String nome;
    private String codigoFuncional;
    private static final double RENDA_BASICA = 1000.0;
    private Comissao comissao;

    public Funcionario(String nome, String codigoFuncional) {
        this(nome, codigoFuncional, null);
    }

    public Funcionario(String nome, String codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao; // Inicializa o campo comissao com o valor passado
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

    public Comissao getComissao(){
        return comissao;
    }
    public void setComissao(Comissao comissao){
        this.comissao = comissao;
    }

    public double calculoRenda(){
        double rendaComissao = (comissao != null) ? comissao.calcularAdicional() : 0;
        return RENDA_BASICA + rendaComissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", codigoFuncional='" + codigoFuncional + '\'' +
                ", renda_Basica=" + RENDA_BASICA +
                ", comissao =" + (comissao!=null ? comissao.calcularAdicional() : "Nenhuma") +
                '}';
    }
}
