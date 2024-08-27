package br.com.solutis.exercicio.onze;

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

        System.out.println("Lista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

}
