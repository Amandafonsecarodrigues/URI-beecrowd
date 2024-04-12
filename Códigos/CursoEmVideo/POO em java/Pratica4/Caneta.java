package Pratica4;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    public Caneta(String modelo, String cor, float ponta){
        this.tampar();
        this.modelo = modelo;
        this.ponta = ponta;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ponta: "+this.getPonta());
        System.out.println("Cor: "+this.cor);
        System.out.println("Tampada: "+this.tampada);
    }

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void setPonta(float ponta){
        this.ponta=ponta;
    }
    public float getPonta(){
        return this.ponta;
    }
}
