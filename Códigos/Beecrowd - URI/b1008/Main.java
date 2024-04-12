package b1008;

import java.util.Scanner;

/*
Escreva um programa que leia o número de um funcionário, seu número de
horas trabalhadas, o valor que recebe por hora e calcula o salário desse
funcionário. A seguir, mostre o número e o salário do funcionário, com duas
 casas decimais.

1.dado de entrada
    numFuncionario = funcionario
    horasTrabalhadas = funcionario
    valorHora = funcionario
2.dado de saída
    calculaSal();
Objeto: funcionário
Classe: Salário
 */

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Salario jose = new Salario(sc.nextInt(),sc.nextInt(),sc.nextFloat());
        jose.imprime();
    }
}
class Salario{
    private int numFuncionario;
    private int horasTrabalhadas;
    private float valorHora;
    public Salario(int numFuncionario, int horasTrabalhadas, float valorHora){
        this.numFuncionario = numFuncionario;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    public float calculaSalario(){
        return this.horasTrabalhadas * this.valorHora;
    }
    public void imprime(){
        System.out.printf("NUMBER = %d\n", numFuncionario);
        System.out.printf("SALARY = U$ %.2f ", calculaSalario());
    }
    public void setHorasTrabalhadas(int horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public int getHorasTrabalhadas(){
        return this.horasTrabalhadas;
    }
    public void setNumFuncionario(int numFuncionario){
        this.numFuncionario = numFuncionario;
    }
    public int getNumFuncionario(){
        return this.numFuncionario;
    }
    public void setValorHora(float valorHora){
        this.valorHora = valorHora;
    }
    public float getValorHora(){
        return this.valorHora;
    }
}


