package br.com.solutis.exercicio.dez;

import java.util.Random;

public class Empresa {

    public static void main(String[] args) {

        final int TOTAL_FUNCIONARIOS = 10;
        Funcionario[] funcionarios = new Funcionario[TOTAL_FUNCIONARIOS];
        Random random = new Random();


        for (int i = 0; i < TOTAL_FUNCIONARIOS; i++) {

            Comissao comissao = null;
            int comissaoTipo = random.nextInt(100) + 1; // Entre 1 e 100
            if (comissaoTipo <= 10) {
                comissao = new Gerente();
            } else if (comissaoTipo <= 30) {
                comissao = new Supervisor();
            } else {
                comissao = new Vendedor();
            }


            int escolaridade = random.nextInt(100) + 1; // Entre 1 e 100
            if (escolaridade <= 40) {
                funcionarios[i] = new FuncionarioEnsinoBasico("Funcionario" + (i + 1), "CB" + (i + 1), "Escola" + (i + 1), comissao);
            } else if (escolaridade <= 80) {
                funcionarios[i] = new FuncionarioEnsinoMedio("Funcionario" + (i + 1), "CM" + (i + 1), "Escola" + (i + 1), comissao);
            } else {
                funcionarios[i] = new FuncionarioGraduacao("Funcionario" + (i + 1), "CG" + (i + 1), "Escola" + (i + 1), "Universidade" + (i + 1), comissao);
            }
        }


        double totalCusto = 0;
        double custoEnsinoBasico = 0;
        double custoEnsinoMedio = 0;
        double custoGraduacao = 0;

        for (Funcionario funcionario : funcionarios) {
            double renda = funcionario.calculoRenda();
            totalCusto += renda;

            if (funcionario instanceof FuncionarioEnsinoBasico) {
                custoEnsinoBasico += renda;
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
                custoEnsinoMedio += renda;
            } else if (funcionario instanceof FuncionarioGraduacao) {
                custoGraduacao += renda;
            }
        }

        System.out.println("Custo total da empresa: R$" + totalCusto);
        System.out.println("Custo total Ensino Básico: R$" + custoEnsinoBasico);
        System.out.println("Custo total Ensino Médio: R$" + custoEnsinoMedio);
        System.out.println("Custo total Nível Superior: R$" + custoGraduacao);
    }
}