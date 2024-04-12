package b2059;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ParImpar p1 = new ParImpar(sc.nextInt(),sc.nextInt(),sc.nextInt());
        ParImparRoubo p2 = new ParImparRoubo(sc.nextInt(),sc.nextInt());
        p2.vencedor();
    }
}
