package br.com.solutis.exercicio.um;

public class Cavalo extends Animal {
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public void correr(){
        System.out.println("O " + getNome() + " está correndo rápido.");
    }

    @Override
    public void emitirSom(){
        System.out.println("O cavalo"+ getNome() + " está fazendo: Rum rum!");
    }


}
