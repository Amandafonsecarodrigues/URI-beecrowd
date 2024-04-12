package b1131;

import java.util.Scanner;

/*
1. entrada
    golInter
    golGremio
    repetir
2. Saída
    qtdGrenais
    interTotal
    gremioTotal
    empate
    venceuMais
*/
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Partida p1 = new Partida();
        p1.pegaValor(sc);
        p1.imprimir();
    }
}

class Partida{
        private int golInter, golGremio, repetir = 0, qtdGrenais, interTotal;
        private int gremioTotal, empate ;
        public void pegaValor(Scanner sc){
            while(repetir != 2){
                qtdGrenais++;
                golInter = sc.nextInt();
                golGremio = sc.nextInt();
                if(golGremio>golInter){
                    gremioTotal++;
                } else if (golInter>golGremio) {
                    interTotal++;
                } else if(golGremio == golInter){
                    empate++;
                }
                System.out.println("Novo grenal (1-sim 2-nao)");
                repetir = sc.nextInt();
                if(repetir==2){
                    break;
                }
            }
        }

        public void ganhouMais(){
            if(interTotal>gremioTotal){
                System.out.println("Inter venceu mais");
            }else if(gremioTotal>interTotal){
                System.out.println("Gremio venceu mais");
            }
        }

        public void imprimir(){
            System.out.println(qtdGrenais+" grenais");
            System.out.println("Inter:"+interTotal);
            System.out.println("Gremio:"+gremioTotal);
            System.out.println("Empates:"+empate);
            ganhouMais();

        }
}