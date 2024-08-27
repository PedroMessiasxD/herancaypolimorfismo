package br.com.solutis.exercicio.sete;

public class Empresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        for (int i = 0; i < 10; i++) {
            switch (i / 4) {
                case 0:
                    funcionarios[i] = new FuncionarioEnsinoBasico(
                            "Funcionario Basico " + (i + 1),
                            String.format("%03d", i + 1),
                            "Escola " + (i + 1)
                    );
                    break;
                case 1:
                    funcionarios[i] = new FuncionarioEnsinoMedio(
                            "Funcionario Medio " + (i - 4 + 1),
                            String.format("%03d", i + 1),
                            "Escola " + (i - 4 + 1)
                    );
                    break;
                case 2:
                    funcionarios[i] = new FuncionarioGraduacao(
                            "Funcionario Graduacao " + (i - 8 + 1),
                            String.format("%03d", i + 1),
                            "Escola " + (i - 8 + 1),
                            "Universidade " + (i - 8 + 1)
                    );
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + (i / 4));
            }
        }


        double totalRendaEnsinoBasico = 0.0;
        double totalRendaEnsinoMedio = 0.0;
        double totalRendaGraduacao = 0.0;

        for (Funcionario funcionario : funcionarios) {
            double renda = funcionario.calculoRenda();
            switch (funcionario.getClass().getSimpleName()) {
                case "FuncionarioEnsinoBasico":
                    totalRendaEnsinoBasico += renda;
                    break;
                case "FuncionarioEnsinoMedio":
                    totalRendaEnsinoMedio += renda;
                    break;
                case "FuncionarioGraduacao":
                    totalRendaGraduacao += renda;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + funcionario.getClass().getSimpleName());
            }
        }

        System.out.println("Custos da Empresa:");
        System.out.println("Total de salários (Ensino Básico): R$ " + totalRendaEnsinoBasico);
        System.out.println("Total de salários (Ensino Médio): R$ " + totalRendaEnsinoMedio);
        System.out.println("Total de salários (Graduação): R$ " + totalRendaGraduacao);
        System.out.println("Total geral de salários: R$ " + (totalRendaEnsinoBasico + totalRendaEnsinoMedio + totalRendaGraduacao));
    }
}
