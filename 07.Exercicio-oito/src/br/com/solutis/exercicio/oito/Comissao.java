package br.com.solutis.exercicio.oito;

public abstract class Comissao {
    private static final double GERENTE_ADICIONAL = 1500.0;
    private static final double SUPERVISOR_ADICIONAL = 600.0;
    private static final double VENDEDOR_ADICIONAL = 250.0;

    public abstract double calcularAdicional();

    public static double getGerenteAdicional() {
        return GERENTE_ADICIONAL;
    }

    public static double getSupervisorAdicional() {
        return SUPERVISOR_ADICIONAL;
    }

    public static double getVendedorAdicional() {
        return VENDEDOR_ADICIONAL;
    }

}
