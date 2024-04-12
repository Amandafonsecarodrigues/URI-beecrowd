package Pratica8;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta(Lutador desafiado, Lutador desafiante) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;

    }
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals((l2.getCategoria()))&&l1!=l2){
            this.aprovada=true;
        }else{
            this.aprovada=false;
        }
    }
    public void lutar(){
        if(this.aprovada==true){
            System.out.println("Desafiado: "+desafiado.getNome());
            System.out.println("Desafiante: "+desafiante.getNome());
            Random ale = new Random();
            int vencedor = ale.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.println("Empate");
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado+" ganhou!");
                    desafiante.perderLuta();
                    desafiado.ganharLuta();
                    break;
                case 2:
                    System.out.println(desafiante+" ganhou!");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;

            }
        }else{
            System.out.println("Luta nao aprovada");
        }
    }
}
