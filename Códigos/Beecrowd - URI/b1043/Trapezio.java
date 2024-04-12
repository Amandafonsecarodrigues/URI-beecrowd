package b1043;

import java.text.DecimalFormat;

public class Trapezio extends Poligono {
    DecimalFormat df = new DecimalFormat("0.0");
    public Trapezio(float a, float b, float c){
        this.c=c;
        this.a=a;
        this.b=b;
    }
    @Override
    public void calcula(float a, float b, float c) {
        float area = ((a+b)*c)/2;
        System.out.println("Area = "+df.format(area));
    }
}
