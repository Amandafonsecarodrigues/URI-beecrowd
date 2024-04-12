package Pratica12;

public class Peixe extends Animal{
    private String corEscama;
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Peixe nada");
    }

    @Override
    public void alimentar() {
        System.out.println("Peixe come substancias");
    }

    @Override
    public void som() {
        System.out.println("Solta bolha de peixe");
    }
}
