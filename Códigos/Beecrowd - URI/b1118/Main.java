package b1118;
/*
1. entradas
    nota = aluno
    continua = aluno
2. saída
    média = aluno
3. método
    pegaNota()
    confereNota()
    confereContinua()
    media()
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Boletim aluno = new Boletim();
        aluno.pegaNota(sc);
    }
}

class Boletim{
    private float nota = 0, accNota = 0, notaValida = 0;
    private int continua = 0;
    public void pegaNota(Scanner sc){
        do {
            do {
                nota = sc.nextFloat();
                if (nota < 0 || nota > 10) {
                    System.out.println("nota invalida");
                    nota = 0;
                } else {
                    notaValida++;
                    accNota += nota;
                    System.out.println("Accnota: " + accNota);
                }

            } while (notaValida != 2);

            System.out.printf("media = %.2f\n", media());
            System.out.println("novo calculo (1-sim 2-nao)");
            continua = sc.nextInt();
            System.out.println(continua);

            if (continua == 1) {
                notaValida = 0; // Reinicia a contagem de notas válidas
                accNota = 0; // Reinicia o acumulador de notas
            }

        } while (continua != 2);
    }

    public float media(){
        return accNota/2;
    }
}
