package b1914;

import java.util.Objects;
import java.util.Scanner;

/*
1. entrada
    qtdTeste = partida
    nomeJog1 = jogador
    escolhaJog1 = jogador
    numeroJog1 = jogador
    nomeJog2 = jogador
    escolhaJog2 = jogador
    numeroJog2 = jogador
2. saida
    ganhador
3. métodos
    pegaValor()
    calculaSoma()
    vencedor()
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int qtdTeste = sc.nextInt();
        Partida partida = new Partida(qtdTeste);
        Jogador jogador = new Jogador();
        jogador.pegaValor(sc,qtdTeste);

    }
}
class Partida{
    private int qtdTeste;
    public Partida(int qtdTeste){
        this.qtdTeste = qtdTeste;
    }
    public void setQtdTeste(int qtdTeste) {
        this.qtdTeste = qtdTeste;
    }

    public int getQtdTeste() {
        return qtdTeste;
    }
}

class Jogador{
    private boolean state;
    private String nomeJog1, nomeJog2, escolhaJog1, escolhaJog2;
    private int numeroJog1;
    private int numeroJog2;
    public void pegaValor(Scanner sc, int qtdTeste){
        for(int i = 0; i < qtdTeste; i++){
            nomeJog1 = sc.next();
            escolhaJog1 = sc.next();
            nomeJog2 = sc.next();
            escolhaJog2 = sc.next();

            if(!Objects.equals(escolhaJog2, escolhaJog1)){
                numeroJog1 = sc.nextInt();
                numeroJog2 = sc.nextInt();
            }
            calculaSoma();
            vencedor();
        }
    }
    public int calculaSoma(){
        return numeroJog2 + numeroJog1;
    }
    public void vencedor(){
        if(calculaSoma()%2==0 && escolhaJog1.equals("PAR")){
            System.out.println(nomeJog1);
        }else if(calculaSoma()%2==0 && escolhaJog2.equals("PAR")){
            System.out.println(nomeJog2);
        } else if(calculaSoma()%2!=0 && escolhaJog1.equals("IMPAR")){
            System.out.println(nomeJog1);
        } else if (calculaSoma()%2!=0 && escolhaJog2.equals("IMPAR")) {
            System.out.println(nomeJog2);
        }
    }

}
