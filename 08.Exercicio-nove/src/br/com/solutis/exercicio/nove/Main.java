package br.com.solutis.exercicio.nove;

public class Main {
    public static void main(String[] args) {
        Comissao gerenteComissao = new Gerente(); // Comissão para Gerente
        Funcionario funcionarioGerente = new Funcionario("João", "G123", gerenteComissao);

        System.out.println(funcionarioGerente.toString());
        System.out.println("Renda com comissão: " + funcionarioGerente.calculoRenda());

        Comissao supervisorComissao = new Supervisor(); // Comissão para Supervisor
        Funcionario funcionarioSupervisor = new Funcionario("Maria", "S456", supervisorComissao);

        System.out.println(funcionarioSupervisor.toString());
        System.out.println("Renda com comissão: " + funcionarioSupervisor.calculoRenda());

        Comissao vendedorComissao = new Vendedor(); // Comissão para Vendedor
        Funcionario funcionarioVendedor = new Funcionario("Pedro", "V789", vendedorComissao);

        System.out.println(funcionarioVendedor.toString());
        System.out.println("Renda com comissão: " + funcionarioVendedor.calculoRenda());
    }
}
