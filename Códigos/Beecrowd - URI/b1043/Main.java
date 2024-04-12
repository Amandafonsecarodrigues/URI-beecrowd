package b1043;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Poligono p;
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        if((a + b) > c && (a + c) >b  && (b + c) > a){
            p = new Triangulo(a,b,c);
            p.calcula(a,b,c);
        }else{
            p = new Trapezio(a,b,c);
            p.calcula(a,b,c);
        }

    }
}
