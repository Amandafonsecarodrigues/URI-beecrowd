package Pratica13;

import Pratica12.Mamifero;

public class Cachorro extends Mamifero {
    @Override
    public void locomover(){
        System.out.println("Cachorro corre");
    }
    @Override
    public void alimentar() {
        System.out.println("Carne");
    }

    @Override
    public void som() {
        System.out.println("Late");
    }
    public void reagir(String frase){
        if(frase.equals("Vamos passear")){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int min){
        if(hora%2==0 && min%2!=0){
            System.out.println("Rosnar querendo dormir");
        }else{
            System.out.println("Abanar e latir quenredo sair");
        }
    }
    public void reagir(boolean dono){
        if(true){
            System.out.println("Lambe ele");
        }else{
            System.out.println("Ignora");
        }
    }
}
