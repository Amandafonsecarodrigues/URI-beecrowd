package Pratica13;

import Pratica12.Mamifero;

public class Main {
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        Cachorro c1 = new Cachorro();
        c1.reagir(true);
        c1.reagir(3,4);
        c1.reagir("Vamos passear");
    }
}
