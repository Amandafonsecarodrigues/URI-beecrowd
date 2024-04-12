package b2059;

public class ParImpar {
    protected int jog1escolha;
    protected int numero1;
    protected int numero2;
    public ParImpar(int jog1escolha, int numero1, int numero2){
        this.jog1escolha = jog1escolha;
        this.numero2=numero2;
        this.numero1=numero1;
    }

    public ParImpar() {

    }

    public void vencedor(){
        if(jog1escolha == 1 && ((numero1+numero2)%2==0) || jog1escolha == 0 && ((numero1+numero2)%2!=0)){
            System.out.println("Jogador 1 ganha!");
        }else if (jog1escolha == 0 && ((numero1+numero2)%2==0)||jog1escolha == 1 && ((numero1+numero2)%2!=0)){
            System.out.println("Jogador 2 ganha!");
        }
    }
}
