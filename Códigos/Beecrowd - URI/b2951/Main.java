package b2951;

import java.util.Scanner;

/*
1. entrada
    qtdRuna = runa
    qtdAmizade = runa

    runaLetra = runa
    amizadeRuna = runa

    runaTotal = runa
    runas[] = runa
2. saída
    quantidade de valor da amizade
    string
3. métodos
    calculaRuna()
    imprime()
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Runa runa = new Runa(sc.nextInt(),sc.nextInt());
        runa.calculaRuna(sc);

    }
}

class Runa{
    //ATRIBUTO
    private int qtdRunas, qtdAmizade;
    private int amizadeRuna;
    private String runaLetra;
    //CONSTRUTOR
    public Runa(int qtdRunas, int qtdAmizade){
        this.qtdAmizade = qtdAmizade;
        this.qtdRunas = qtdRunas;

    }
    //AUXILIARES
    private String[] letras = new String[40];
    private int amizadeAcc;
    private boolean win;

    public void calculaRuna(Scanner sc){
        for(int i = 0; i < this.qtdRunas; i++){
            this.runaLetra = sc.next();
            this.amizadeRuna = sc.nextInt();
            if(this.amizadeRuna>0){
                this.amizadeAcc+=amizadeRuna;

            }
                letras[i]=sc.next();
        }
        imprime();
    }


    public void imprime(){
        System.out.println(qtdAmizade);
        if(amizadeAcc>qtdAmizade){
            System.out.println("You shall pass!");
        }else{
            System.out.println("My precioooous");
        }
    }

}
