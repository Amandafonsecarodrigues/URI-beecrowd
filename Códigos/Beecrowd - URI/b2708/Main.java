package b2708;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Parque jip = new Parque();

        String movimento;
        int qtdTurista;

        while(true){
            movimento = sc.next();
            if(movimento.equals("ABEND")){
                break;
            }
            qtdTurista = sc.nextInt();
            jip.registraJip(movimento,qtdTurista);
        }
        System.out.println(jip.imprimirPessoa());
        System.out.println(jip.imprimirJip());
    }
}
