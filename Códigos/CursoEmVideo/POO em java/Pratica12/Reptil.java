package Pratica12;

public class Reptil extends Animal{
    private String corEscama;
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Reptil rasteja");
    }

    @Override
    public void alimentar() {
        System.out.println("Reptil come vegetal");
    }

    @Override
    public void som() {
        System.out.println("Som de reptil");
    }
}
