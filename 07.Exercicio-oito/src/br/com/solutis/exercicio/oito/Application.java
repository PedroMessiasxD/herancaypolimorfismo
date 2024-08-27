package br.com.solutis.exercicio.oito;

public class Application {
    public static void main(String[] args) {
        Comissao gerenteComissao = new Gerente();
        Funcionario funcionarioGerente = new Funcionario("João", "G123", gerenteComissao);

        System.out.println(funcionarioGerente.toString());
        System.out.println("Renda com comissão: " + funcionarioGerente.calculoRenda());
    }
}
