package Pratica8;


public class EmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[2];
        l[0]=new Lutador("Pretty Boy", "França", 31,1.75f,71.9f,11,2,1);
        l[1]=new Lutador("Giovana", "Belgica", 31,1.85f,73f,11,2,1);

        Luta l1 = new Luta(l[0],l[1]);
        l1.marcarLuta(l[0],l[1]);
        l1.lutar();

    }
}
