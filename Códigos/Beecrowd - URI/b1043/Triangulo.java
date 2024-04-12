package b1043;

import java.text.DecimalFormat;

public class Triangulo extends Poligono{
    DecimalFormat df = new DecimalFormat("0.0");
    public Triangulo(float a, float b, float c){
        this.c=c;
        this.a=a;
        this.b=b;
    }
    @Override
    public void calcula(float a, float b, float c) {
        float perimetro = a+b+c;
        System.out.println("Perimetro = "+df.format(perimetro));
    }
}
