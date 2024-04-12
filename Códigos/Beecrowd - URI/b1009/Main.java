package b1009;
/*
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o
total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o
total a receber no final do mês, com duas casas decimais

1.entrada
    nome = funcionario
    salarioFixo = funcionário
    vendas = funcionário
2. saida
    salarioTotal = funcionário
3. objeto = funcionário
 */

import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f1 = new Funcionario(sc.next(),sc.nextDouble(),sc.nextDouble());
        f1.imprime();
    }
}

class Funcionario{
    private String nome;
    private double salarioFixo;
    private double vendas;
    private double salario = 0;
    public Funcionario(String nome, double salarioFixo, double vendas){
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.vendas = vendas;
    }
    public void calculaSal(){
        this.salario = salarioFixo + (vendas * 0.15);
    }
    public void imprime(){
        calculaSal();
        System.out.printf("TOTAL = R$ %.2f",this.salario);
    }
}
