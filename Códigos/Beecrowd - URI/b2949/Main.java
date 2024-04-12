package b2949;

import java.util.Scanner;

/*
1. entrada
    numAlistadas = animais
    nome = animais
    tipoRaca = animais
2. saída
    quantidade de cada raça = animais
    + classificação():
    + alistados():
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Alistados lista = new Alistados(sc.nextInt());
        lista.classifica(sc);
    }
}
class Alistados{
    private int numAlistadas;
    private String nome;
    private String especie;
    int hobbit = 0, humano = 0,elfo = 0, anao = 0, mago = 0;


    public Alistados(int numAlistadas){
        this.numAlistadas = numAlistadas;
    }

    public void classifica(Scanner sc){
        for(int i = 0; i < this.numAlistadas;i++){
            nome = sc.next();
            especie = sc.next();
            if(especie.equals("X")){
                this.hobbit++;
            } else if (especie.equals("M")) {
                this.mago++;
            } else if (especie.equals("E")) {
                this.elfo++;
            } else if (especie.equals("A")) {
                this.anao++;
            } else if (especie.equals("H")) {
                this.humano++;
            }
        }
        imprime();
    }
    public void imprime(){
        System.out.println(this.hobbit+" Hobbit(s)");
        System.out.println(this.humano+" Humano(s)");
        System.out.println(this.elfo+" Elfo(s)");
        System.out.println(this.anao+" Anao(oes)");
        System.out.println(this.mago+" Mago(s)");
    }
}
