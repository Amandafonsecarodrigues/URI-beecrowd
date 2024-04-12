package Pratica11;

public class Bolsista extends Aluno{
    private int bolsa;
    public Bolsista(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo, matricula, curso);
    }
    public void renovarBolsa(){
        System.out.println("Bolsa renovada do(a) "+nome);
    }
    @Override
    public void pagarMen(){
        System.out.println("Paga!");
    }
}
