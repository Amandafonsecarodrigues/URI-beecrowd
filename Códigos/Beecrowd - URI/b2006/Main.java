package b2006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numCerto = 0, tentativas=0,qtdAcertos=0;

        numCerto = sc.nextInt();

        for(int i = 0; i < 5; i++){
            tentativas = sc.nextInt();
            if(tentativas == numCerto){
                qtdAcertos++;
            }
        }

        System.out.println(qtdAcertos);

    }
}
