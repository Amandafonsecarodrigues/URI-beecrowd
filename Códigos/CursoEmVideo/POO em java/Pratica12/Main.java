package Pratica12;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Cachorro c1 = new Cachorro();

        m.locomover();
        c1.locomover();
    }
}
