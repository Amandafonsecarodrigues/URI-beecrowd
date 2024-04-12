package b2434;
/*
1. entrada
    dias = apenas informação
    saldo inicial = conta
2. saida
    menor valor de saldo = conta
3. pertence
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Conta vovo = new Conta(sc.nextInt(),sc.nextInt());
        vovo.attConta(sc);
    }
}
class Conta{
    private int dias;
    private int saldo;
    public Conta(int dias, int saldo){
        this.dias = dias;
        this.saldo = saldo;

    }

    public void attConta(Scanner sc){
        int menor = saldo;
        for(int i = 0; i < this.dias; i++){
            int movimento = sc.nextInt();
            this.saldo += movimento;
            if(saldo < menor){
                menor = saldo;
            }
        }
        System.out.println(menor);
    }
}
