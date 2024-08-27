package br.com.solutis.exercicio.um;

public class Preguica extends Animal{
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }


    public void subirEmArvores(){
        System.out.println(getNome() + " subindo em arvore");
    }


    @Override
    public void emitirSom() {
        System.out.println("A preguiça "+ getNome() +" está fazendo: rrr...");
    }

}
