package br.com.solutis.exercicio.quatro;

import br.com.solutis.exercicio.um.*;

public class Zoologico {
    private AnimalIn[] jaulas;

    public Zoologico(){
        jaulas = new AnimalIn[10];

        jaulas[0] = new Cachorro("Rex", 5);
        jaulas[1] = new Cavalo("Pampas", 3);
        jaulas[2] = new Preguica("George", 6);
        jaulas[3] = new Cachorro("Juninho",6);
        jaulas[4] = new Cavalo("Samoiedo", 2);
        jaulas[5] = new Preguica("Buttercup", 4);
        jaulas[6] = new Cachorro("Buddy", 7);
        jaulas[7] = new Cavalo("Rex", 4);
        jaulas[8] = new Preguica("Geraldine", 5);
        jaulas[9] = new Cavalo("Pernalonga", 8);
    }

    public void percorrerJaulas() {
        for (AnimalIn animal : jaulas) {
            if (animal != null) {
                animal.emitirSom();

                if (animal instanceof Cachorro) {
                    ((Cachorro) animal).correr();
                } else if (animal instanceof Cavalo) {
                    ((Cavalo) animal).correr();
                }
            }
        }
    }

    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        zoo.percorrerJaulas();
    }



}
