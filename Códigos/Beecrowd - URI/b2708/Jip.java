package b2708;

import java.util.concurrent.LinkedTransferQueue;

public class Jip {
    private String movimento;
    private int qtdPessoas;
    public Jip(String movimento, int qtdPessoas){
        this.movimento = movimento;
        this.qtdPessoas = qtdPessoas;
    }

    public String getMovimento(){
        return movimento;
    }
    public void setMovimento(String movimento){
        this.movimento = movimento;
    }
    public int getQtdPessoas(){
        return qtdPessoas;
    }
    public void setQtdPessoas(int qtdPessoas){
        this.qtdPessoas = qtdPessoas;
    }
}
