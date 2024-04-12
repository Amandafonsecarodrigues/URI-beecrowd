package Pratica10;

public class Main {
    public static void main(String[] args) {
        Aluno p1 = new Aluno("Amanda",19,"Fem",1111,"CC");
        Professor f1 = new Professor("Andrade",30,"Masc","Joventude",2094);
        Funcionario f2 = new Funcionario("Jose",43,"Masc","Clinico",true);

        System.out.println(p1.toString());
    }
}
