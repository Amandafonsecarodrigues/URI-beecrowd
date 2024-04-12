package Pratica13;


import Pratica12.Animal;

public class Mamifero extends Animal {
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Mamifero corre");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamifero mama");
    }

    @Override
    public void som() {
        System.out.println("Som de mamífero");
    }
}
