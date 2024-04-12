package Pratica11;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    public Aluno(String nome, int idade, String sexo, int matricula, String curso){
        super(nome,idade,sexo);
        this.matricula=matricula;
        this.curso=curso;
    }
    //adicionei
    public void pagarMen(){
        System.out.println("Mensalidade paga do aluno "+nome);
        System.out.println("Aluno: "+nome);
        System.out.println("Idade: "+idade);
    }
    public void cancelarMa(){
        System.out.println("Matricula cancelada");
    }
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
