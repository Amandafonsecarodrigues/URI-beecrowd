package b1049;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal a;
        String filo = sc.next();
        String classe = sc.next();
        String ordem = sc.next();
        if(filo.equals("vertebrado")&&classe.equals("mamifero")){
            a = new Mamifero(filo,classe,ordem);
        } else if (filo.equals("vertebrado")&&classe.equals("ave")) {
            a = new Ave(filo,classe,ordem);
        } else if (filo.equals("invertebrado")&&classe.equals("anelideo")) {
            a = new Anelideo(filo,classe,ordem);
        } else if (filo.equals("invertebrado")&&classe.equals("inseto")) {
            a = new Inseto(filo,classe,ordem);
        }
    }
}