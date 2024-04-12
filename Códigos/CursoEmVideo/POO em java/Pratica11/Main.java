package Pratica11;

public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante("Josué",43,"M");
        Aluno a1 = new Aluno("Amanda",19,"F",1111,"CC");
        Bolsista b1 = new Bolsista("Mandi",20,"F",324,"CC");
        a1.pagarMen();
        b1.renovarBolsa();
    }
}
