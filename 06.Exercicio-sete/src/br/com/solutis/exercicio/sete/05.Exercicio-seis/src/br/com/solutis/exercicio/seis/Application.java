package br.com.solutis.exercicio.sete;

public class Application {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("João", "001");
        FuncionarioEnsinoBasico funcionarioEnsinoBasico = new FuncionarioEnsinoBasico("Maria", "002", "Escola A");
        FuncionarioEnsinoMedio funcionarioEnsinoMedio = new FuncionarioEnsinoMedio("Pedro", "003", "Escola B");
        FuncionarioGraduacao funcionarioGraduacao = new FuncionarioGraduacao("Ana", "004", "Escola C", "Universidade X");


        System.out.println("Renda do Funcionário:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Renda: R$ " + funcionario.calculoRenda());

        System.out.println("\nRenda do Funcionário com Ensino Básico:");
        System.out.println("Nome: " + funcionarioEnsinoBasico.getNome());
        System.out.println("Escola: " + funcionarioEnsinoBasico.getEscola());
        System.out.println("Renda: R$ " + funcionarioEnsinoBasico.calculoRenda());

        System.out.println("\nRenda do Funcionário com Ensino Médio:");
        System.out.println("Nome: " + funcionarioEnsinoMedio.getNome());
        System.out.println("Escola: " + funcionarioEnsinoMedio.getEscola());
        System.out.println("Renda: R$ " + funcionarioEnsinoMedio.calculoRenda());

        System.out.println("\nRenda do Funcionário com Graduação:");
        System.out.println("Nome: " + funcionarioGraduacao.getNome());
        System.out.println("Escola: " + funcionarioGraduacao.getEscola());
        System.out.println("Universidade: " + funcionarioGraduacao.getUniversidade());
        System.out.println("Renda: R$ " + funcionarioGraduacao.calculoRenda());
    }
}
