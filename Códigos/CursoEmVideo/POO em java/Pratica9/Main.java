package Pratica9;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Amanda",19,"Feminino");
        Livro l1 = new Livro("Amar, Desamar","Marcos Delacerda",180,180,false,p1);
        l1.detalhes();
    }
}
