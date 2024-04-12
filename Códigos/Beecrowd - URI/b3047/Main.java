package b3047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int idadeMae = sc.nextInt();
        int idadeF1=sc.nextInt();
        int idadeF2 = sc.nextInt();
        int idadef3;
             idadef3 = idadeMae - (idadeF2 + idadeF1);

        if(idadeF2>idadeF1 && idadeF2>idadef3){
            System.out.println(idadeF2);
        } else if (idadeF1>idadeF2 && idadeF1>idadef3) {
            System.out.println(idadeF1);
        } else if (idadef3>idadeF1 && idadef3>idadeF2) {
            System.out.println(idadef3);
        }
    }
}
