package b1014;
/*
1. entrada
distancia = carro
totalCom = carro
2. saida
consumo = carro
3. class = carro

 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner sc = new Scanner(System.in);
        Carro c1 = new Carro(sc.nextInt(), sc.nextFloat());
        System.out.println(df.format(c1.calculaConsumo())+" km/l");
    }
}

class Carro{
    private int distancia;
    private float totalCombustivel;
    public Carro(int distancia, float totalCombustivel){
        this.distancia=distancia;
        this.totalCombustivel=totalCombustivel;
    }
    public float calculaConsumo(){
        return distancia/totalCombustivel;
    }
}
