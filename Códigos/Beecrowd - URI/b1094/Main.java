package b1094;

import java.util.Scanner;

/*
1.entrada
    nCasos = experimento
    quantidade = cobaias
    especie = cobaias
2.saida
    totalCobaias = cobaias
    totalCoelho = cobaias
    totalRato = cobaias
    totalSapo = cobaias
    percentualSapo= cobaias
    percemtualCoelho= cobaias
    percentualRato= cobaias

 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        Experimento exp = new Experimento(casos);
        Cobaia cobaia = new Cobaia();
        cobaia.registraCobaia(sc,casos);
        cobaia.imprime();
    }
}

class Experimento{
    private int nCasos = 0;
    public Experimento(int nCasos){
        this.nCasos = nCasos;
    }
    public int getnCasos(){
        return this.nCasos;
    }
    public void setnCasos(int nCasos){
        this.nCasos = nCasos;
    }
}

class Cobaia{
    Experimento experimento;
    private int qtdCobaia;
    private String tipo;
    private int totalCobaias = 0;
    private int qtdCoelho, qtdRato,qtdSapo;

    private float percentualSapo, percemtualCoelho, percentualRato;
    public void registraCobaia(Scanner sc, int casos){
        for(int i = 0; i < casos;i++){

            qtdCobaia = sc.nextInt();
            tipo = sc.next();
            acumulaQuantidade();
            totalCobaias+=qtdCobaia;
        }
    }
    public void acumulaQuantidade(){
        if(tipo.equals("C")){
            qtdCoelho+=qtdCobaia;
        } else if (tipo.equals("S")) {
            qtdSapo+=qtdCobaia;
        } else if (tipo.equals("R")) {
            qtdRato+=qtdCobaia;
        }
    }
    public void calculaPercentual(){
        percemtualCoelho = (float) (qtdCoelho * 100) /totalCobaias;
        percentualRato = ((float) (qtdRato * 100) /totalCobaias);
        percentualSapo = ((float) (qtdSapo * 100) /totalCobaias);
    }
    public void imprime(){
        System.out.println("Total: "+totalCobaias+" cobaias");
        System.out.println("Total de coelhos: "+qtdCoelho);
        System.out.println("Total de ratos: "+qtdRato);
        System.out.println("Total de sapos: "+qtdSapo);
        calculaPercentual();
        System.out.printf("Percentual de coelhos: %.2f",percemtualCoelho);
        System.out.print(" %\n");
        System.out.printf("Percentual de ratos: %.2f",percentualRato);
        System.out.print(" %\n");
        System.out.printf("Percentual de sapos: %.2f",percentualSapo);
        System.out.print(" %\n");
    }
}
