package b1794;

public abstract class Maquina {
    protected int minQ;
    protected int maxQ;
    public boolean possivel(int qtdPeca) {
        if(qtdPeca>=minQ && qtdPeca<=maxQ){
            return true;
        }else{
            return false;
        }
    }


}
