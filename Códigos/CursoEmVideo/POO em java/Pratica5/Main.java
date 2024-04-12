package Pratica5;

public class Main {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(11111);
        c1.setDono("Amanda");
        c1.abrirConta("CC");
        c1.depositar(100);
        c1.sacar(200);
        System.out.println(c1.toString());
    }
}
