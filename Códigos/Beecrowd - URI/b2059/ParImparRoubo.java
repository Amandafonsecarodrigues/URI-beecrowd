package b2059;

public class ParImparRoubo extends ParImpar{
    private int roubou;
    private int acusou;

    public ParImparRoubo(int roubou, int acusou) {
        super();
        this.roubou = roubou;
        this.acusou=acusou;
    }

    @Override
    public void vencedor(){
        if(roubou == 1 && acusou == 1){
            System.out.println("Jogador 2 ganha!");
        } else if(roubou == 1 && acusou == 0 || roubou == 0 && acusou == 1){
            System.out.println("Jogador 1 ganha!");
        } else if(roubou == 0 && acusou==0){
            if(jog1escolha == 1 && ((numero1+numero2)%2==0) || jog1escolha == 0 && ((numero1+numero2)%2!=0)){
                System.out.println("Jogador 1 ganha!");
            }else if (jog1escolha == 0 && ((numero1+numero2)%2==0)||jog1escolha == 1 && ((numero1+numero2)%2!=0)){
                System.out.println("Jogador 2 ganha!");
            }
        }
    }

    public int getRoubou() {
        return roubou;
    }

    public void setRoubou(int roubou) {
        this.roubou = roubou;
    }

    public int getAcusou() {
        return acusou;
    }

    public void setAcusou(int acusou) {
        this.acusou = acusou;
    }
}
