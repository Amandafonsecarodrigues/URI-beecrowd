package Pratica12;


public class Cachorro extends Mamifero {
    @Override
    public void locomover(){
        System.out.println("Cachorro corre");
    }
    @Override
    public void alimentar() {
        System.out.println("Carne");
    }

    @Override
    public void som() {
        System.out.println("Late");
    }
}
