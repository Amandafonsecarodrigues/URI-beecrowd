package Pratica6;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    public ControleRemoto(){
        volume = 50;
        ligado = false;
        tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        if(ligado){
            System.out.println("Já está ligada");
        }else{
            this.ligado = true;
        }
    }

    @Override
    public void desligar() {
        if(!ligado){
            System.out.println("Já está desligada");
        }else{
            this.ligado = false;
        }
    }

    @Override
    public void abrirMenu() {
        System.out.println("Abrindo ============");
        System.out.println("Ligada: "+ligado);
        System.out.println("Volume: "+volume);
        for(int i = 0;i<volume;i++){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando ==============");
    }

    @Override
    public void maisVolume() {
        if(volume>=100){

        }else{
            volume++;
        }
    }

    @Override
    public void menosVolume() {
        if(volume<=0){

        }else{
            volume--;
        }
    }

    @Override
    public void ligarMudo() {
        if(ligado==true && volume>0){
            volume = 0;
        }
    }

    @Override
    public void desligarMudo() {
        if(ligado==true && volume<0){
            volume = 50;
        }
    }

    @Override
    public void play() {
        if(ligado==true){
            tocando =true;
        }
    }

    @Override
    public void pause() {
        if(ligado==true){
            tocando=true;
        }
    }
}
