package Pratica11;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    public Pessoa(String nome, int idade, String sexo){
        this.idade = idade;
        this.nome=nome;
        this.sexo=sexo;
    }
    public void fazNiver(){
        idade++;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
