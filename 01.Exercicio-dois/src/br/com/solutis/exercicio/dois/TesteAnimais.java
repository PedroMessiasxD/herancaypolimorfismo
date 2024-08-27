package br.com.solutis.exercicio.dois;

import br.com.solutis.exercicio.um.AnimalIn;
import br.com.solutis.exercicio.um.Cachorro;
import br.com.solutis.exercicio.um.Cavalo;
import br.com.solutis.exercicio.um.Preguica;

public class TesteAnimais {
    public static void main(String[] args) {

        AnimalIn[] animais = new AnimalIn[] {
                new Cachorro("Rex", 5),
                new Cavalo("Pampas", 7),
                new Preguica("Lento", 3)
        };

        for (AnimalIn animalIn : animais) {
            animalIn.emitirSom();
        }
    }
}
