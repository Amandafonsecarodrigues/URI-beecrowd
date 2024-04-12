package b2950;
/*
1. entrada
    ditancia = palacio
    diametroSauron = palacio
    diametroSaruman = palacio
2. saida
    ICM = palacio
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Torre torre = new Torre(sc.nextInt(), sc.nextInt(), sc.nextInt());
        torre.ICM();
        torre.imprime();
    }
}
class Torre{
    private int distancia;
    private int diametroSauron;
    private int diametroSaruman;
    public Torre(int distancia, int diametroSaruman, int diametroSauron){
        this.diametroSaruman = diametroSaruman;
        this.distancia = distancia;
        this.diametroSauron = diametroSauron;
        ICM();
    }
    public float ICM(){
        return ( (float) distancia /(diametroSauron + diametroSaruman));
    }

    public void imprime(){
        System.out.printf("%.2f",ICM());
    }

}



