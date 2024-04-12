package b3058;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nSuper = sc.nextInt();
        double maior=0;
        float[] vetorDinheiro = new float[nSuper];
        maior = 0;
        for(int i = 0;i<nSuper;i++){
            double precoN = 0;
            vetorDinheiro[i] =  sc.nextFloat();
            int grama = sc.nextInt();
             maior = vetorDinheiro[0];
            if(grama == 500){
               precoN = 2*vetorDinheiro[i];
            }
            if (grama == 1000) {
                precoN = vetorDinheiro[i];
            }

            }
            if(maior>precoN){
                maior=precoN;
            }


        }
        System.out.println(maior);
    }
}
