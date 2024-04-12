package b1794;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdPeca = sc.nextInt();
        Lavadora l1 = new Lavadora(sc.nextInt(),sc.nextInt());
        Secadora s1 = new Secadora(sc.nextInt(),sc.nextInt());
        if(l1.possivel(qtdPeca) && s1.possivel(qtdPeca)){
            System.out.println("possivel");
        }else{
            System.out.println("impossivel");
        }
    }
}
