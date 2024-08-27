package br.com.solutis.exercicio.tres;

import br.com.solutis.exercicio.um.AnimalIn;
import br.com.solutis.exercicio.um.Cachorro;
import br.com.solutis.exercicio.um.Cavalo;
import br.com.solutis.exercicio.um.Preguica;

public class Veterinario {
    public void examinar(AnimalIn animalIn){
        System.out.println("Examinando..");
        animalIn.emitirSom();
    }
    public static void main(String[] args){
        Veterinario veterinario = new Veterinario();
        Cachorro cachorro = new Cachorro("Rex",5);
        Cavalo cavalo = new Cavalo("Cavalone",10);
        Preguica preguica = new Preguica("Joalisson",2);
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
    }

}
