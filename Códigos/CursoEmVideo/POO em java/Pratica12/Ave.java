package Pratica12;

public class Ave extends Animal {
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Ave voa");
    }

    @Override
    public void alimentar() {
        System.out.println("Ave come minhoca");
    }

    @Override
    public void som() {
        System.out.println("Ave pia");
    }
}
