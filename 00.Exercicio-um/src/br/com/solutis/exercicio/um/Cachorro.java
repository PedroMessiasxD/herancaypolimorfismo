package br.com.solutis.exercicio.um;

public class Cachorro extends Animal {


    public Cachorro(String name, int idade) {
        super(name, idade);
    }

    public void correr() {
        System.out.println("O " + getNome() + " está correndo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro "+ getNome() +" está fazendo: Au! Au! Au!");
    }
}
