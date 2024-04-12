package b1051;

import java.util.Scanner;

/*
1. ENTRADA
    salario = trabalhador
2. SAIDA
    imposto = trabalhador
3. método
    caluclaImposto();
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Funcionario f1 = new Funcionario(sc.nextFloat());

        f1.imprime();
    }
}

class Funcionario {
    private float salario;
    private float imposto;
    public Funcionario(float salario){
        this.salario=salario;
        calculaImposto();
    }
    public void calculaImposto(){
        if (salario >= 0 && salario<= 2000){
            System.out.println("Isento");
        } else if (salario >= 2000.01 && salario<= 3000){
             imposto = (float) ((salario -2000) * 0.08);
        }else if (salario >= 3000.01 && salario <= 4500){
            imposto= (float) ((salario - 3000) * 0.18 +1000*0.08);
        }else if (salario >= 4500){
            imposto = (float) ((salario - 4500)* 0.28+1500*0.18+1000*0.08);

        }
    }
    public void imprime(){
        if(this.salario<2000){

        }else{
            System.out.printf("R$ %.2f",imposto);
        }
    }

}
